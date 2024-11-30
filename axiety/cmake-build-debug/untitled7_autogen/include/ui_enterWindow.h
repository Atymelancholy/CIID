/********************************************************************************
** Form generated from reading UI file 'enterwindow.ui'
**
** Created by: Qt User Interface Compiler version 6.7.2
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_ENTERWINDOW_H
#define UI_ENTERWINDOW_H

#include <QtCore/QVariant>
#include <QtWidgets/QApplication>
#include <QtWidgets/QLabel>
#include <QtWidgets/QLineEdit>
#include <QtWidgets/QPushButton>
#include <QtWidgets/QWidget>

QT_BEGIN_NAMESPACE

class Ui_enterWindow
{
public:
    QLabel *background;
    QLabel *introText_2;
    QLineEdit *passwordField;
    QLineEdit *loginField;
    QPushButton *applyButton;
    QPushButton *enterButton_2;
    QLabel *background_3;

    void setupUi(QWidget *enterWindow)
    {
        if (enterWindow->objectName().isEmpty())
            enterWindow->setObjectName("enterWindow");
        enterWindow->resize(800, 600);
        background = new QLabel(enterWindow);
        background->setObjectName("background");
        background->setEnabled(true);
        background->setGeometry(QRect(-10, 0, 811, 621));
        background->setStyleSheet(QString::fromUtf8("Qlabel {\n"
"    border: none;\n"
"    background: none;\n"
"}"));
        background->setFrameShape(QFrame::Shape::NoFrame);
        background->setFrameShadow(QFrame::Shadow::Plain);
        background->setPixmap(QPixmap(QString::fromUtf8("../resources/paper-background.png")));
        background->setScaledContents(true);
        background->setAlignment(Qt::AlignmentFlag::AlignLeading|Qt::AlignmentFlag::AlignLeft|Qt::AlignmentFlag::AlignVCenter);
        background->setWordWrap(false);
        background->setOpenExternalLinks(false);
        introText_2 = new QLabel(enterWindow);
        introText_2->setObjectName("introText_2");
        introText_2->setGeometry(QRect(140, 60, 521, 141));
        QFont font;
        font.setFamilies({QString::fromUtf8("MS Serif")});
        font.setPointSize(32);
        font.setBold(false);
        introText_2->setFont(font);
        introText_2->setStyleSheet(QString::fromUtf8("QLabel{\n"
"    border: none;\n"
"    background: none;\n"
"   color: rgb(123, 156, 100);\n"
"}"));
        passwordField = new QLineEdit(enterWindow);
        passwordField->setObjectName("passwordField");
        passwordField->setGeometry(QRect(230, 390, 341, 61));
        QFont font1;
        font1.setFamilies({QString::fromUtf8("Yu Gothic Light")});
        passwordField->setFont(font1);
        passwordField->setStyleSheet(QString::fromUtf8("QLineEdit {\n"
"                   font-size: 10px; \n"
"                   background-color: rgb(123, 156, 100);\n"
"                   border: 1px solid gray; \n"
"                   border-radius: 10px; \n"
"                   padding: 5px; \n"
"                }\n"
"QPushButton:hover {\n"
"    background-color: rgb(255, 174, 205); \n"
"    cursor: pointer; /* \320\230\320\267\320\274\320\265\320\275\320\265\320\275\320\270\320\265 \320\272\321\203\321\200\321\201\320\276\321\200\320\260 \320\277\321\200\320\270 \320\275\320\260\320\262\320\265\320\264\320\265\320\275\320\270\320\270 */\n"
"}"));
        loginField = new QLineEdit(enterWindow);
        loginField->setObjectName("loginField");
        loginField->setGeometry(QRect(230, 290, 341, 61));
        QFont font2;
        font2.setFamilies({QString::fromUtf8("Yu Gothic Light")});
        font2.setPointSize(20);
        loginField->setFont(font2);
        loginField->setStyleSheet(QString::fromUtf8("QLineEdit {\n"
"  background-color: rgb(123, 156, 100);\n"
"            border: 1px solid gray; \n"
"               border-radius: 10px; \n"
"               padding: 5px; \n"
"}\n"
""));
        applyButton = new QPushButton(enterWindow);
        applyButton->setObjectName("applyButton");
        applyButton->setGeometry(QRect(230, 490, 161, 51));
        QFont font3;
        font3.setFamilies({QString::fromUtf8("MS Serif")});
        applyButton->setFont(font3);
        applyButton->setStyleSheet(QString::fromUtf8("QPushButton {\n"
"    background-color: rgb(123, 156, 100);\n"
"    color: white; /* \320\246\320\262\320\265\321\202 \321\202\320\265\320\272\321\201\321\202\320\260 */\n"
"    border: none; /* \320\221\320\265\320\267 \321\200\320\260\320\274\320\272\320\270 */\n"
"    border-radius: 10px; /* \320\227\320\260\320\272\321\200\321\203\320\263\320\273\320\265\320\275\320\275\321\213\320\265 \320\263\321\200\320\260\320\275\320\270\321\206\321\213 */\n"
"    padding: 10px 20px; /* \320\236\321\202\321\201\321\202\321\203\320\277\321\213 \320\262\320\275\321\203\321\202\321\200\320\270 \320\272\320\275\320\276\320\277\320\272\320\270 */\n"
"    font-size: 16px; /* \320\240\320\260\320\267\320\274\320\265\321\200 \321\210\321\200\320\270\321\204\321\202\320\260 */\n"
"}\n"
"\n"
"QPushButton:hover {\n"
"    background-color: rgb(255, 174, 205); \n"
"    cursor: pointer; /* \320\230\320\267\320\274\320\265\320\275\320\265\320\275\320\270\320\265 \320\272\321\203\321\200\321\201\320\276\321\200\320\260 \320\277\321\200"
                        "\320\270 \320\275\320\260\320\262\320\265\320\264\320\265\320\275\320\270\320\270 */\n"
"}"));
        enterButton_2 = new QPushButton(enterWindow);
        enterButton_2->setObjectName("enterButton_2");
        enterButton_2->setGeometry(QRect(410, 490, 161, 51));
        enterButton_2->setFont(font3);
        enterButton_2->setStyleSheet(QString::fromUtf8("QPushButton {\n"
"    background-color: rgb(123, 156, 100);\n"
"    color: white; /* \320\246\320\262\320\265\321\202 \321\202\320\265\320\272\321\201\321\202\320\260 */\n"
"    border: none; /* \320\221\320\265\320\267 \321\200\320\260\320\274\320\272\320\270 */\n"
"    border-radius: 10px; /* \320\227\320\260\320\272\321\200\321\203\320\263\320\273\320\265\320\275\320\275\321\213\320\265 \320\263\321\200\320\260\320\275\320\270\321\206\321\213 */\n"
"    padding: 10px 20px; /* \320\236\321\202\321\201\321\202\321\203\320\277\321\213 \320\262\320\275\321\203\321\202\321\200\320\270 \320\272\320\275\320\276\320\277\320\272\320\270 */\n"
"    font-size: 16px; /* \320\240\320\260\320\267\320\274\320\265\321\200 \321\210\321\200\320\270\321\204\321\202\320\260 */\n"
"}\n"
"\n"
"QPushButton:hover {\n"
"    background-color: rgb(255, 174, 205); \n"
"    cursor: pointer; /* \320\230\320\267\320\274\320\265\320\275\320\265\320\275\320\270\320\265 \320\272\321\203\321\200\321\201\320\276\321\200\320\260 \320\277\321\200"
                        "\320\270 \320\275\320\260\320\262\320\265\320\264\320\265\320\275\320\270\320\270 */\n"
"}"));
        background_3 = new QLabel(enterWindow);
        background_3->setObjectName("background_3");
        background_3->setEnabled(true);
        background_3->setGeometry(QRect(80, 290, 161, 151));
        background_3->setStyleSheet(QString::fromUtf8("Qlabel {\n"
"    border: none;\n"
"    background: none;\n"
"    border-radius: 15px; \n"
"    background-color: transparent\n"
"}"));
        background_3->setFrameShape(QFrame::Shape::NoFrame);
        background_3->setFrameShadow(QFrame::Shadow::Plain);
        background_3->setPixmap(QPixmap(QString::fromUtf8("../resources/sun.png")));
        background_3->setScaledContents(true);
        background_3->setAlignment(Qt::AlignmentFlag::AlignLeading|Qt::AlignmentFlag::AlignLeft|Qt::AlignmentFlag::AlignVCenter);
        background_3->setWordWrap(false);
        background_3->setOpenExternalLinks(false);

        retranslateUi(enterWindow);

        QMetaObject::connectSlotsByName(enterWindow);
    } // setupUi

    void retranslateUi(QWidget *enterWindow)
    {
        enterWindow->setWindowTitle(QCoreApplication::translate("enterWindow", "enterWindow", nullptr));
        background->setText(QString());
        introText_2->setText(QCoreApplication::translate("enterWindow", "\320\222\320\262\320\265\320\264\320\270\321\202\320\265 \320\270\320\274\321\217 \320\277\320\276\320\273\321\214\320\267\320\276\320\262\320\260\321\202\320\265\320\273\321\217 \320\270 \320\277\320\260\321\200\320\276\320\273\321\214", nullptr));
        passwordField->setText(QString());
        loginField->setText(QString());
        applyButton->setText(QCoreApplication::translate("enterWindow", "\320\237\320\276\320\264\321\202\320\262\320\265\320\264\320\270\321\202\321\214", nullptr));
        enterButton_2->setText(QCoreApplication::translate("enterWindow", "\320\235\320\260\320\267\320\260\320\264", nullptr));
        background_3->setText(QString());
    } // retranslateUi

};

namespace Ui {
    class enterWindow: public Ui_enterWindow {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_ENTERWINDOW_H
