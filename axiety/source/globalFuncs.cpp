#include "../header/globalFuncs.h"
#include "../header/SituationalAnxietyTest.h"
#include "../header/AnxietyCopingSuggestions.h"
#include "../header/PersonalAnxietyTest.h"
#include "../header/UserManager.h"
#include <iostream>
#include <limits>
#include <vector>

using namespace std;

std::vector<std::string> getQuestionsFromFile(const std::string& filePath) {
    std::vector<std::string> questions;
    std::ifstream file(filePath);

    if (!file) {
        std::cerr << "Ошибка: Не удалось открыть файл " << filePath << std::endl;
        return questions;
    }

    std::string question;
    while (std::getline(file, question)) {
        if (!question.empty()) {
            questions.push_back(question);
        }
    }
    file.close();
    return questions;
}

void handleTesting() {
    const int numQuestions = 20;

    std::vector<std::string> situationalQuestions = getQuestionsFromFile("situational_questions.txt");
    std::vector<std::string> personalQuestions = getQuestionsFromFile("personal_questions.txt");

    if (situationalQuestions.empty() || personalQuestions.empty()) {
        std::cerr << "Ошибка: Вопросы для теста не загружены." << std::endl;
        return;
    }

    SituationalAnxietyTest situationalTest(numQuestions, situationalQuestions);
    std::cout << "Тест на ситуативную тревожность:\n";
    situationalTest.takeTest();
    int situationalScore = situationalTest.calculateResult();
    situationalTest.resultPrint(situationalScore);

    PersonalAnxietyTest personalTest(numQuestions, personalQuestions);
    std::cout << "\nТест на личностную тревожность:\n";
    personalTest.takeTest();
    int personalScore = personalTest.calculateResult();
    personalTest.resultPrint(personalScore);
}
/*
void handleUserActions(UserManager& userManager, const std::string& username) {
    cout << "\nЧто вы хотите сделать?\n1. Пройти тест\n2. Просмотреть историю тестов\nВыберите действие: ";
    int action;
    cin >> action;
    cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n');

    if (action == 1) {
        handleTesting(userManager, username);
    } else if (action == 2) {
        userManager.viewTestHistory(username);
    }
}*/

bool handleLogin(UserManager& userManager, std::string& username) {
    std::string password;

    cout << "Введите имя пользователя: ";
    std::getline(cin, username);
    cout << "Введите пароль: ";
    std::getline(cin, password);
    return userManager.loginUser(username, password);
}

void handleRegistration(UserManager& userManager) {
    std::string username, password;

    cout << "Введите имя пользователя: ";
    std::getline(cin, username);
    cout << "Введите пароль (8 символов): ";
    std::getline(cin, password);

    if (password.length() != 8) {
        cout << "Пароль должен содержать ровно 8 символов.\n";
        return;
    }

    userManager.registerUser(username, password);
};