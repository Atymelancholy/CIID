#ifndef UNTITLED7_MAINWINDOW_H
#define UNTITLED7_MAINWINDOW_H

#include <QWidget>
#include "enterwindow.h"
#include "userinterfacewindow.h"
#include "test.h"
#include "history.h"
#include "endwindownotbad.h"
#include "endwindowgood.h"
#include "endwindow.h"

QT_BEGIN_NAMESPACE
namespace Ui { class mainwindow; }
QT_END_NAMESPACE
enum class UserAction { None, Login, Registration };
class mainwindow : public QWidget {
Q_OBJECT

public:
    void onLoginSelected();       // Обработчик для выбора входа
    void onRegistrationSelected(); // Обработчик для выбора регистрации
    void openEnterWindow();       // Открытие окна ввода
    void onUserSubmit();          // Обработчик подтверждения

    explicit mainwindow(QWidget *parent = nullptr);

    void enterButtonClicked(int mode);
    void userInterfaceWindowShow(const std::string& login);
    void testWindow();
    void historyWindow();
    void endWindow();
    void endWindowGood();
    void endWindowNotBad();
    void loadQuestions(const std::string& filePath, std::vector<std::string>& questions);
    void showNextQuestion(Ui::test* testUI);
    void handleTesting();

    ~mainwindow() override;

private:
    Ui::mainwindow *ui;
    enterWindow *enterWindow;
    UserInterfaceWindow *userInterfaceWindow;
    UserAction currentAction;
    test *test;
    history *history;
    endwindow *endwindow;
    endwindowgood *endwindowgood;
    endwindownotbad *endwindownotbad;
    int currentQuestionIndex = 0;                 // Текущий индекс вопроса
    std::vector<std::string> situationalQuestions;  // Загруженные вопросы
    std::vector<std::string> personalQuestions;    // Другие вопросы (если нужно)
    std::vector<int> answers;                     // Ответы пользователя

};

#endif


