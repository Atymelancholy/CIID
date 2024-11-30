/********************************************************************************
** Form generated from reading UI file 'userinterfacewindow.ui'
**
** Created by: Qt User Interface Compiler version 6.7.2
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_USERINTERFACEWINDOW_H
#define UI_USERINTERFACEWINDOW_H

#include <QtCore/QVariant>
#include <QtWidgets/QApplication>
#include <QtWidgets/QLabel>
#include <QtWidgets/QPushButton>
#include <QtWidgets/QWidget>

QT_BEGIN_NAMESPACE

class Ui_UserInterfaceWindow
{
public:
    QLabel *background;
    QLabel *introText_2;
    QPushButton *enterButton;
    QPushButton *enterButton_2;

    void setupUi(QWidget *UserInterfaceWindow)
    {
        if (UserInterfaceWindow->objectName().isEmpty())
            UserInterfaceWindow->setObjectName("UserInterfaceWindow");
        UserInterfaceWindow->resize(800, 600);
        background = new QLabel(UserInterfaceWindow);
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
        introText_2 = new QLabel(UserInterfaceWindow);
        introText_2->setObjectName("introText_2");
        introText_2->setGeometry(QRect(160, -10, 571, 181));
        QFont font;
        font.setFamilies({QString::fromUtf8("MS Serif")});
        font.setPointSize(32);
        font.setBold(false);
        introText_2->setFont(font);
        introText_2->setStyleSheet(QString::fromUtf8("QLabel{\n"
"    border: none;\n"
"    background: none;\n"
"    color: rgb(123, 156, 100);\n"
"}"));
        enterButton = new QPushButton(UserInterfaceWindow);
        enterButton->setObjectName("enterButton");
        enterButton->setGeometry(QRect(280, 300, 231, 51));
        QFont font1;
        font1.setFamilies({QString::fromUtf8("MS Serif")});
        enterButton->setFont(font1);
        enterButton->setStyleSheet(QString::fromUtf8("QPushButton {\n"
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
        enterButton_2 = new QPushButton(UserInterfaceWindow);
        enterButton_2->setObjectName("enterButton_2");
        enterButton_2->setGeometry(QRect(280, 390, 231, 51));
        enterButton_2->setFont(font1);
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

        retranslateUi(UserInterfaceWindow);

        QMetaObject::connectSlotsByName(UserInterfaceWindow);
    } // setupUi

    void retranslateUi(QWidget *UserInterfaceWindow)
    {
        UserInterfaceWindow->setWindowTitle(QCoreApplication::translate("UserInterfaceWindow", "UserInterfaceWindow", nullptr));
        background->setText(QString());
        introText_2->setText(QCoreApplication::translate("UserInterfaceWindow", "\320\222\321\213\320\261\320\265\321\200\320\265\321\202\320\265 \320\276\320\264\320\275\321\203 \320\270\320\267 \320\276\320\277\321\206\320\270\320\271", nullptr));
        enterButton->setText(QCoreApplication::translate("UserInterfaceWindow", "\320\237\321\200\320\276\320\271\321\202\320\270 \321\202\320\265\321\201\321\202", nullptr));
        enterButton_2->setText(QCoreApplication::translate("UserInterfaceWindow", "\320\230\321\201\321\202\320\276\321\200\320\270\321\217", nullptr));
    } // retranslateUi

};

namespace Ui {
    class UserInterfaceWindow: public Ui_UserInterfaceWindow {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_USERINTERFACEWINDOW_H
