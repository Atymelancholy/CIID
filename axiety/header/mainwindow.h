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
#include "SituationalAnxietyTest.h"
#include "PersonalAnxietyTest.h"

QT_BEGIN_NAMESPACE
namespace Ui { class mainwindow; }
QT_END_NAMESPACE
enum class UserAction { None, Login, Registration };
class mainwindow : public QWidget {
Q_OBJECT

public:

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
    void handleTesting(int answer);
    void addAnswer(int answer);
    void showTestResult(const QString& title, int result, const std::vector<int>& answers)
;

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
    SituationalAnxietyTest* anxietyTest = nullptr;
    PersonalAnxietyTest *personalAnxietyTest = nullptr;
    bool isSituationalTestRunning = true;

};

#endif


