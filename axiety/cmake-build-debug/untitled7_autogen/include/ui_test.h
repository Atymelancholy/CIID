/********************************************************************************
** Form generated from reading UI file 'test.ui'
**
** Created by: Qt User Interface Compiler version 6.7.2
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_TEST_H
#define UI_TEST_H

#include <QtCore/QVariant>
#include <QtWidgets/QApplication>
#include <QtWidgets/QLabel>
#include <QtWidgets/QPushButton>
#include <QtWidgets/QWidget>

QT_BEGIN_NAMESPACE

class Ui_test
{
public:
    QLabel *background;
    QLabel *background_2;
    QPushButton *enterButton;
    QPushButton *enterButton_2;
    QPushButton *enterButton_3;
    QPushButton *enterButton_4;
    QLabel *background_3;
    QLabel *background_4;
    QLabel *introText_2;
    QLabel *label;

    void setupUi(QWidget *test)
    {
        if (test->objectName().isEmpty())
            test->setObjectName("test");
        test->resize(825, 675);
        background = new QLabel(test);
        background->setObjectName("background");
        background->setEnabled(true);
        background->setGeometry(QRect(0, 0, 831, 691));
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
        background_2 = new QLabel(test);
        background_2->setObjectName("background_2");
        background_2->setEnabled(true);
        background_2->setGeometry(QRect(30, 130, 781, 241));
        background_2->setStyleSheet(QString::fromUtf8("Qlabel {\n"
"    border: none;\n"
"    background: none;\n"
"    border-radius: 15px; \n"
"    background-color: transparent\n"
"}"));
        background_2->setFrameShape(QFrame::Shape::NoFrame);
        background_2->setFrameShadow(QFrame::Shadow::Plain);
        background_2->setPixmap(QPixmap(QString::fromUtf8("../resources/vintage-wallpaper-background.jpg")));
        background_2->setScaledContents(true);
        background_2->setAlignment(Qt::AlignmentFlag::AlignLeading|Qt::AlignmentFlag::AlignLeft|Qt::AlignmentFlag::AlignVCenter);
        background_2->setWordWrap(false);
        background_2->setOpenExternalLinks(false);
        enterButton = new QPushButton(test);
        enterButton->setObjectName("enterButton");
        enterButton->setGeometry(QRect(290, 400, 261, 51));
        QFont font;
        font.setFamilies({QString::fromUtf8("MS Serif")});
        enterButton->setFont(font);
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
        enterButton_2 = new QPushButton(test);
        enterButton_2->setObjectName("enterButton_2");
        enterButton_2->setGeometry(QRect(290, 460, 261, 51));
        enterButton_2->setFont(font);
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
        enterButton_3 = new QPushButton(test);
        enterButton_3->setObjectName("enterButton_3");
        enterButton_3->setGeometry(QRect(290, 520, 261, 51));
        enterButton_3->setFont(font);
        enterButton_3->setStyleSheet(QString::fromUtf8("QPushButton {\n"
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
        enterButton_4 = new QPushButton(test);
        enterButton_4->setObjectName("enterButton_4");
        enterButton_4->setGeometry(QRect(290, 580, 261, 51));
        enterButton_4->setFont(font);
        enterButton_4->setStyleSheet(QString::fromUtf8("QPushButton {\n"
"    background-color:rgb(123, 156, 100);\n"
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
        background_3 = new QLabel(test);
        background_3->setObjectName("background_3");
        background_3->setEnabled(true);
        background_3->setGeometry(QRect(680, 70, 161, 151));
        background_3->setStyleSheet(QString::fromUtf8("Qlabel {\n"
"    border: none;\n"
"    background: none;\n"
"    border-radius: 15px; \n"
"    background-color: transparent\n"
"}"));
        background_3->setFrameShape(QFrame::Shape::NoFrame);
        background_3->setFrameShadow(QFrame::Shadow::Plain);
        background_3->setPixmap(QPixmap(QString::fromUtf8("../resources/sun (1).png")));
        background_3->setScaledContents(true);
        background_3->setAlignment(Qt::AlignmentFlag::AlignLeading|Qt::AlignmentFlag::AlignLeft|Qt::AlignmentFlag::AlignVCenter);
        background_3->setWordWrap(false);
        background_3->setOpenExternalLinks(false);
        background_4 = new QLabel(test);
        background_4->setObjectName("background_4");
        background_4->setEnabled(true);
        background_4->setGeometry(QRect(-10, 200, 161, 131));
        background_4->setStyleSheet(QString::fromUtf8("Qlabel {\n"
"    border: none;\n"
"    background: none;\n"
"    border-radius: 15px; \n"
"    background-color: transparent\n"
"}"));
        background_4->setFrameShape(QFrame::Shape::NoFrame);
        background_4->setFrameShadow(QFrame::Shadow::Plain);
        background_4->setPixmap(QPixmap(QString::fromUtf8("../resources/rainy.png")));
        background_4->setScaledContents(true);
        background_4->setAlignment(Qt::AlignmentFlag::AlignLeading|Qt::AlignmentFlag::AlignLeft|Qt::AlignmentFlag::AlignVCenter);
        background_4->setWordWrap(false);
        background_4->setOpenExternalLinks(false);
        introText_2 = new QLabel(test);
        introText_2->setObjectName("introText_2");
        introText_2->setGeometry(QRect(50, 40, 731, 51));
        QFont font1;
        font1.setFamilies({QString::fromUtf8("MS Serif")});
        font1.setPointSize(17);
        font1.setBold(false);
        introText_2->setFont(font1);
        introText_2->setStyleSheet(QString::fromUtf8("QLabel{\n"
"    border: none;\n"
"    background: none;\n"
"    color: rgb(123, 156, 100);\n"
"}"));
        label = new QLabel(test);
        label->setObjectName("label");
        label->setGeometry(QRect(230, 190, 371, 141));
        QFont font2;
        font2.setFamilies({QString::fromUtf8("MS Serif")});
        font2.setPointSize(17);
        label->setFont(font2);
        label->setStyleSheet(QString::fromUtf8("QLabel{\n"
"    border: none;\n"
"    background: none;\n"
"    color: rgb(123, 156, 100);\n"
"}\n"
""));

        retranslateUi(test);

        QMetaObject::connectSlotsByName(test);
    } // setupUi

    void retranslateUi(QWidget *test)
    {
        test->setWindowTitle(QCoreApplication::translate("test", "test", nullptr));
        background->setText(QString());
        background_2->setText(QString());
        enterButton->setText(QCoreApplication::translate("test", "\320\275\320\265\321\202, \321\215\321\202\320\276 \320\275\320\265 \321\201\320\276\320\262\321\201\320\265\320\274 \321\202\320\260\320\272", nullptr));
        enterButton_2->setText(QCoreApplication::translate("test", "\320\277\320\276\320\266\320\260\320\273\321\203\320\271, \321\202\320\260\320\272", nullptr));
        enterButton_3->setText(QCoreApplication::translate("test", "\320\262\320\265\321\200\320\275\320\276", nullptr));
        enterButton_4->setText(QCoreApplication::translate("test", "\321\201\320\276\320\262\320\265\321\200\321\210\320\265\320\275\320\275\320\276 \320\262\320\265\321\200\320\275\320\276", nullptr));
        background_3->setText(QString());
        background_4->setText(QString());
        introText_2->setText(QCoreApplication::translate("test", "\320\236\321\202\320\262\320\265\321\202\321\214\321\202\320\265 \320\275\320\260 \321\201\320\273\320\265\320\264\321\203\321\216\321\211\320\270\320\271 \320\262\320\276\320\277\321\200\320\276\321\201, \320\262\321\213\320\261\321\200\320\260\320\262 \320\276\320\264\320\270\320\275 \320\270\320\267 \320\277\321\200\320\265\320\264\320\273\320\276\320\266\320\265\320\275\320\275\321\213\321\205 \320\262\320\260\321\200\320\270\320\260\320\275\321\202\320\276\320\262 \320\276\321\202\320\262\320\265\321\202\320\260", nullptr));
        label->setText(QCoreApplication::translate("test", "TextLabel", nullptr));
    } // retranslateUi

};

namespace Ui {
    class test: public Ui_test {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_TEST_H
