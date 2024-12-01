#include "../header/mainwindow.h"
#include "../header/UserManager.h"
#include "ui_UserInterfaceWindow.h"
#include "ui_mainwindow.h"
#include "ui_enterWindow.h"
#include "ui_test.h"
#include "../header/test.h"
#include "../header/userinterfacewindow.h"
#include "ui_history.h"
#include "../header/history.h"
#include "ui_endwindow.h"
#include "ui_endwindowgood.h"
#include "ui_endwindownotbad.h"
#include "../header/endwindow.h"
#include "../header/endwindowgood.h"
#include "../header/endwindownotbad.h"
#include "../header/globalFuncs.h"
#include <QMessageBox>


mainwindow::mainwindow(QWidget *parent) :
        QWidget(parent), ui(new Ui::mainwindow), enterWindow(nullptr), userInterfaceWindow(nullptr), test(nullptr), history(
        nullptr), endwindow(nullptr), endwindowgood(nullptr), endwindownotbad(nullptr) {
    ui->setupUi(this);
    QPixmap bg("C:/Users/atyme/CLionProjects/untitled7/resources/paper-background.png");
    ui->background->setPixmap(bg.scaled(ui->background->size(), Qt::KeepAspectRatio, Qt::SmoothTransformation));
    connect(ui->enterButton, &QPushButton::clicked, this, [this]() {
        enterButtonClicked(1);
    });
    connect(ui->regButton, &QPushButton::clicked, this, [this]() {
        enterButtonClicked(2);
    });
}

mainwindow::~mainwindow() {
    delete ui;
}

void mainwindow::enterButtonClicked(int mode) {
    ui->enterButton->hide();
    ui->regButton->hide();
    ui->introText_2->hide();
    std::string log;
    if (!enterWindow) {
        enterWindow = new class enterWindow(this);
        auto *enterUI = new Ui::enterWindow;
        enterUI->setupUi(enterWindow);
        enterWindow->setProperty("ui", QVariant::fromValue(static_cast<void *>(enterUI)));
        enterUI->passwordField->setEchoMode(QLineEdit::Password);

        if (mode == 1)
        {
            connect(enterUI->applyButton, &QPushButton::clicked, this, [this,enterUI]() {
                UserManager user;
                user.loginUser(enterUI->loginField->text().toStdString(),enterUI->passwordField->text().toStdString());
                userInterfaceWindowShow(enterUI->loginField->text().toStdString());
            });

            connect(enterUI->enterButton_2, &QPushButton::clicked, this, [this,enterUI]() {
                enterWindow->hide();
                ui->enterButton->show();
                ui->regButton->show();
                ui->introText_2->show();
            });
        }

        if (mode == 2)
        {
            connect(enterUI->applyButton, &QPushButton::clicked, this, [this,enterUI]() {
                UserManager user;
                user.registerUser(enterUI->loginField->text().toStdString(),enterUI->passwordField->text().toStdString());
                userInterfaceWindowShow(enterUI->loginField->text().toStdString());
            });

            connect(enterUI->enterButton_2, &QPushButton::clicked, this, [this,enterUI]() {
                enterWindow->hide();
                ui->enterButton->show();
                ui->regButton->show();
                ui->introText_2->show();
            });
        }
    }
    enterWindow->show();
}

void mainwindow::userInterfaceWindowShow(const std::string& login) {
    enterWindow->hide();
    std::string log;
    if (!userInterfaceWindow) {
        userInterfaceWindow = new class UserInterfaceWindow(this);
        auto *userInterfaceUI = new Ui::UserInterfaceWindow;
        userInterfaceUI->setupUi(userInterfaceWindow);
        userInterfaceWindow->setProperty("ui", QVariant::fromValue(static_cast<void *>(userInterfaceUI)));
        connect(userInterfaceUI->enterButton, &QPushButton::clicked, this, [this,userInterfaceUI]() {
            userInterfaceWindow->hide();
            testWindow();
        });

        connect(userInterfaceUI->enterButton_2, &QPushButton::clicked, this, [this,userInterfaceUI]() {
            userInterfaceWindow->hide();
            historyWindow();
        });
    }
    userInterfaceWindow->show();
}
void mainwindow::loadQuestions(const std::string& filePath, std::vector<std::string>& questions) {
    questions.clear();
    std::ifstream file(filePath);
    if (!file) {
        qDebug() << "Error: Failed to open file for loading questions: " << QString::fromStdString(filePath);
        return;
    }
    std::string line;
    while (std::getline(file, line)) {
        if (!line.empty()) {
            questions.push_back(line);
        }
    }
    file.close();
    qDebug() << "Loaded questions from:" << QString::fromStdString(filePath) << "Total:" << questions.size();
    currentQuestionIndex = 0; // Сброс индекса
}

/*
void mainwindow::loadQuestions(const std::string& filePath, std::vector<std::string>& questions) {
    questions.clear();
    std::ifstream file(filePath);
    if (!file) {
      //  QMessageBox::critical(this, "Ошибка", "Не удалось загрузить вопросы из файла.");
        return;
    }
    std::string line;
    while (std::getline(file, line)) {
        if (!line.empty()) {
            questions.push_back(line);
        }
    }
    file.close();
    currentQuestionIndex = 0;
}*/

void mainwindow::showNextQuestion(Ui::test* testUI) {
    if (currentQuestionIndex < situationalQuestions.size()) {
        testUI->label->setText(QString::fromStdString(situationalQuestions[currentQuestionIndex]));
    } else {
        //QMessageBox::information(this, "Тест завершён", "Вы ответили на все вопросы.");
        test->close();
    }
}

void mainwindow::showTestResult(const QString& title, int result, const std::vector<int>& answers) {
    QString answersStr = "Ответы на вопросы:\n";
    for (int i = 0; i < answers.size(); ++i) {
        answersStr += QString("Вопрос %1: Ответ %2\n").arg(i + 1).arg(answers[i]);
    }

    QMessageBox messageBox(this);
    messageBox.setWindowTitle(title);
    messageBox.setText(QString("%1\n\nРезультат теста: %2").arg(answersStr).arg(result));

    messageBox.setStyleSheet(
            "QMessageBox { background-color: rgb(255, 174, 205); }"
            "QLabel { color: black; font-size: 14px; }"
            "QPushButton { background-color: rgb(123, 156, 100); color: white; padding: 5px 10px; "
            "border-radius: 5px; }"
            "QPushButton:hover { background-color: rgb(101, 127, 80); }"
    );

    messageBox.exec();
}


/*
void SituationalAnxietyTest::addAnswer(int answer) {
    answers.push_back(answer);
}*/


void mainwindow::handleTesting(int answer) {
    auto *testUI = static_cast<Ui::test *>(test->property("ui").value<void *>());

    if (isSituationalTestRunning && anxietyTest) {
        anxietyTest->addAnswer(answer);
    } else if (!isSituationalTestRunning && personalAnxietyTest) {
        personalAnxietyTest->addAnswer(answer);
    }

    currentQuestionIndex++;

    if (currentQuestionIndex < situationalQuestions.size()) {
        showNextQuestion(testUI);
    } else if (isSituationalTestRunning) {
        int result = anxietyTest->calculateResult();
        showTestResult("Результат ситуационного теста", result, anxietyTest->getAnswers());

        isSituationalTestRunning = false;
        loadQuestions("personal_questions.txt", situationalQuestions);
        if (!situationalQuestions.empty()) {
            personalAnxietyTest = new PersonalAnxietyTest(situationalQuestions.size(), situationalQuestions);
            currentQuestionIndex = 0;
            showNextQuestion(testUI);
        } else {
            QMessageBox::critical(this, "Ошибка", "Не удалось загрузить вопросы для личностного теста.");
            test->close();
        }
    } else {
        int result = personalAnxietyTest->calculateResult();
        showTestResult("Результат личностного теста", result, personalAnxietyTest->getAnswers());
        test->close();
    }
}


void mainwindow::testWindow() {
    userInterfaceWindow->hide();

    if (!test) {
        test = new class test(this);
        auto *testUI = new Ui::test;
        testUI->setupUi(test);
        test->setProperty("ui", QVariant::fromValue(static_cast<void *>(testUI)));

        loadQuestions("situational_questions.txt", situationalQuestions);

        if (!situationalQuestions.empty()) {
            anxietyTest = new SituationalAnxietyTest(situationalQuestions.size(), situationalQuestions);
            showNextQuestion(testUI);
        } else {
            QMessageBox::critical(this, "Ошибка", "Не удалось загрузить вопросы для ситуационного теста.");
            return;
        }

        connect(testUI->enterButton, &QPushButton::clicked, this, [this, testUI]() {
            handleTesting(1);
        });
        connect(testUI->enterButton_2, &QPushButton::clicked, this, [this, testUI]() {
            handleTesting(2);
        });
        connect(testUI->enterButton_3, &QPushButton::clicked, this, [this, testUI]() {
            handleTesting(3);
        });
        connect(testUI->enterButton_4, &QPushButton::clicked, this, [this, testUI]() {
            handleTesting(4);
        });
    }
    test->show();
}

void mainwindow:: historyWindow(){
    userInterfaceWindow->hide();
    std::string log;
    if (!history) {
        history = new class history(this);
        auto *historyUI = new Ui::history;
        historyUI->setupUi(history);
        history->setProperty("ui", QVariant::fromValue(static_cast<void *>(historyUI)));
        connect(historyUI->enterButton_2, &QPushButton::clicked, this, [this,historyUI]() {
            history->hide();
            userInterfaceWindow->show();
        });
    }
    history->show();
}

void mainwindow:: endWindow(){
    test->hide();
    std::string log;
    if (!endwindow) {
        endwindow = new class endwindow(this);
        auto *endwindowUI = new Ui::endwindow;
        endwindowUI->setupUi(endwindow);
        endwindow->setProperty("ui", QVariant::fromValue(static_cast<void *>(endwindowUI)));
        connect(endwindowUI->enterButton, &QPushButton::clicked, this, [this,endwindowUI]() {
            endwindow->hide();
            ui->enterButton->show();
            ui->regButton->show();
            ui->introText_2->show();
        });
    }
    endwindow->show();
}

void mainwindow:: endWindowGood(){
    test->hide();
    std::string log;
    if (!endwindowgood) {
        endwindowgood = new class endwindowgood(this);
        auto *endwindowgoodUI = new Ui::endwindowgood;
        endwindowgoodUI->setupUi(endwindowgood);
        endwindowgood->setProperty("ui", QVariant::fromValue(static_cast<void *>(endwindowgoodUI)));
        connect(endwindowgoodUI->enterButton, &QPushButton::clicked, this, [this,endwindowgoodUI]() {
            endwindowgood->hide();
            ui->enterButton->show();
            ui->regButton->show();
            ui->introText_2->show();
        });
    }
    endwindowgood->show();
}

void mainwindow:: endWindowNotBad(){
    test->hide();
    std::string log;
    if (!endwindownotbad) {
        endwindownotbad = new class endwindownotbad(this);
        auto *endwindownotbadUI = new Ui::endwindownotbad;
        endwindownotbadUI->setupUi(endwindownotbad);
        endwindownotbad->setProperty("ui", QVariant::fromValue(static_cast<void *>(endwindownotbadUI)));
        connect(endwindownotbadUI->enterButton, &QPushButton::clicked, this, [this,endwindownotbadUI]() {
            endwindownotbad->hide();
            ui->enterButton->show();
            ui->regButton->show();
            ui->introText_2->show();
        });
    }
    endwindownotbad->show();
}