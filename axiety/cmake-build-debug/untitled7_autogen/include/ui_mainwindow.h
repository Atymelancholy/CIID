/********************************************************************************
** Form generated from reading UI file 'mainwindow.ui'
**
** Created by: Qt User Interface Compiler version 6.7.2
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_MAINWINDOW_H
#define UI_MAINWINDOW_H

#include <QtCore/QVariant>
#include <QtWidgets/QApplication>
#include <QtWidgets/QLabel>
#include <QtWidgets/QPushButton>
#include <QtWidgets/QWidget>

QT_BEGIN_NAMESPACE

class Ui_mainwindow
{
public:
    QLabel *background;
    QLabel *introText_2;
    QPushButton *enterButton;
    QPushButton *regButton;
    QLabel *background_3;
    QLabel *background_4;
    QLabel *background_5;
    QLabel *background_6;
    QLabel *background_7;
    QLabel *background_8;
    QLabel *background_9;
    QLabel *background_10;
    QLabel *background_11;
    QLabel *background_12;
    QLabel *background_13;

    void setupUi(QWidget *mainwindow)
    {
        if (mainwindow->objectName().isEmpty())
            mainwindow->setObjectName("mainwindow");
        mainwindow->resize(800, 600);
        background = new QLabel(mainwindow);
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
        introText_2 = new QLabel(mainwindow);
        introText_2->setObjectName("introText_2");
        introText_2->setGeometry(QRect(220, 170, 401, 131));
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
        enterButton = new QPushButton(mainwindow);
        enterButton->setObjectName("enterButton");
        enterButton->setGeometry(QRect(330, 340, 161, 51));
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
        regButton = new QPushButton(mainwindow);
        regButton->setObjectName("regButton");
        regButton->setGeometry(QRect(330, 420, 161, 51));
        regButton->setFont(font1);
        regButton->setStyleSheet(QString::fromUtf8("QPushButton {\n"
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
        background_3 = new QLabel(mainwindow);
        background_3->setObjectName("background_3");
        background_3->setEnabled(true);
        background_3->setGeometry(QRect(0, 0, 121, 111));
        background_3->setStyleSheet(QString::fromUtf8("Qlabel {\n"
"    border: none;\n"
"    background: none;\n"
"    border-radius: 15px; \n"
"    background-color: transparent\n"
"}"));
        background_3->setFrameShape(QFrame::Shape::NoFrame);
        background_3->setFrameShadow(QFrame::Shadow::Plain);
        background_3->setPixmap(QPixmap(QString::fromUtf8("../resources/lights.png")));
        background_3->setScaledContents(true);
        background_3->setAlignment(Qt::AlignmentFlag::AlignLeading|Qt::AlignmentFlag::AlignLeft|Qt::AlignmentFlag::AlignVCenter);
        background_3->setWordWrap(false);
        background_3->setOpenExternalLinks(false);
        background_4 = new QLabel(mainwindow);
        background_4->setObjectName("background_4");
        background_4->setEnabled(true);
        background_4->setGeometry(QRect(120, 0, 121, 111));
        background_4->setStyleSheet(QString::fromUtf8("Qlabel {\n"
"    border: none;\n"
"    background: none;\n"
"    border-radius: 15px; \n"
"    background-color: transparent\n"
"}"));
        background_4->setFrameShape(QFrame::Shape::NoFrame);
        background_4->setFrameShadow(QFrame::Shadow::Plain);
        background_4->setPixmap(QPixmap(QString::fromUtf8("../resources/lights.png")));
        background_4->setScaledContents(true);
        background_4->setAlignment(Qt::AlignmentFlag::AlignLeading|Qt::AlignmentFlag::AlignLeft|Qt::AlignmentFlag::AlignVCenter);
        background_4->setWordWrap(false);
        background_4->setOpenExternalLinks(false);
        background_5 = new QLabel(mainwindow);
        background_5->setObjectName("background_5");
        background_5->setEnabled(true);
        background_5->setGeometry(QRect(240, 0, 121, 111));
        background_5->setStyleSheet(QString::fromUtf8("Qlabel {\n"
"    border: none;\n"
"    background: none;\n"
"    border-radius: 15px; \n"
"    background-color: transparent\n"
"}"));
        background_5->setFrameShape(QFrame::Shape::NoFrame);
        background_5->setFrameShadow(QFrame::Shadow::Plain);
        background_5->setPixmap(QPixmap(QString::fromUtf8("../resources/lights.png")));
        background_5->setScaledContents(true);
        background_5->setAlignment(Qt::AlignmentFlag::AlignLeading|Qt::AlignmentFlag::AlignLeft|Qt::AlignmentFlag::AlignVCenter);
        background_5->setWordWrap(false);
        background_5->setOpenExternalLinks(false);
        background_6 = new QLabel(mainwindow);
        background_6->setObjectName("background_6");
        background_6->setEnabled(true);
        background_6->setGeometry(QRect(360, 0, 121, 111));
        background_6->setStyleSheet(QString::fromUtf8("Qlabel {\n"
"    border: none;\n"
"    background: none;\n"
"    border-radius: 15px; \n"
"    background-color: transparent\n"
"}"));
        background_6->setFrameShape(QFrame::Shape::NoFrame);
        background_6->setFrameShadow(QFrame::Shadow::Plain);
        background_6->setPixmap(QPixmap(QString::fromUtf8("../resources/lights.png")));
        background_6->setScaledContents(true);
        background_6->setAlignment(Qt::AlignmentFlag::AlignLeading|Qt::AlignmentFlag::AlignLeft|Qt::AlignmentFlag::AlignVCenter);
        background_6->setWordWrap(false);
        background_6->setOpenExternalLinks(false);
        background_7 = new QLabel(mainwindow);
        background_7->setObjectName("background_7");
        background_7->setEnabled(true);
        background_7->setGeometry(QRect(480, 0, 121, 111));
        background_7->setStyleSheet(QString::fromUtf8("Qlabel {\n"
"    border: none;\n"
"    background: none;\n"
"    border-radius: 15px; \n"
"    background-color: transparent\n"
"}"));
        background_7->setFrameShape(QFrame::Shape::NoFrame);
        background_7->setFrameShadow(QFrame::Shadow::Plain);
        background_7->setPixmap(QPixmap(QString::fromUtf8("../resources/lights.png")));
        background_7->setScaledContents(true);
        background_7->setAlignment(Qt::AlignmentFlag::AlignLeading|Qt::AlignmentFlag::AlignLeft|Qt::AlignmentFlag::AlignVCenter);
        background_7->setWordWrap(false);
        background_7->setOpenExternalLinks(false);
        background_8 = new QLabel(mainwindow);
        background_8->setObjectName("background_8");
        background_8->setEnabled(true);
        background_8->setGeometry(QRect(600, 0, 121, 111));
        background_8->setStyleSheet(QString::fromUtf8("Qlabel {\n"
"    border: none;\n"
"    background: none;\n"
"    border-radius: 15px; \n"
"    background-color: transparent\n"
"}"));
        background_8->setFrameShape(QFrame::Shape::NoFrame);
        background_8->setFrameShadow(QFrame::Shadow::Plain);
        background_8->setPixmap(QPixmap(QString::fromUtf8("../resources/lights.png")));
        background_8->setScaledContents(true);
        background_8->setAlignment(Qt::AlignmentFlag::AlignLeading|Qt::AlignmentFlag::AlignLeft|Qt::AlignmentFlag::AlignVCenter);
        background_8->setWordWrap(false);
        background_8->setOpenExternalLinks(false);
        background_9 = new QLabel(mainwindow);
        background_9->setObjectName("background_9");
        background_9->setEnabled(true);
        background_9->setGeometry(QRect(720, 0, 121, 111));
        background_9->setStyleSheet(QString::fromUtf8("Qlabel {\n"
"    border: none;\n"
"    background: none;\n"
"    border-radius: 15px; \n"
"    background-color: transparent\n"
"}"));
        background_9->setFrameShape(QFrame::Shape::NoFrame);
        background_9->setFrameShadow(QFrame::Shadow::Plain);
        background_9->setPixmap(QPixmap(QString::fromUtf8("../resources/lights.png")));
        background_9->setScaledContents(true);
        background_9->setAlignment(Qt::AlignmentFlag::AlignLeading|Qt::AlignmentFlag::AlignLeft|Qt::AlignmentFlag::AlignVCenter);
        background_9->setWordWrap(false);
        background_9->setOpenExternalLinks(false);
        background_10 = new QLabel(mainwindow);
        background_10->setObjectName("background_10");
        background_10->setEnabled(true);
        background_10->setGeometry(QRect(360, 0, 121, 111));
        background_10->setStyleSheet(QString::fromUtf8("Qlabel {\n"
"    border: none;\n"
"    background: none;\n"
"    border-radius: 15px; \n"
"    background-color: transparent\n"
"}"));
        background_10->setFrameShape(QFrame::Shape::NoFrame);
        background_10->setFrameShadow(QFrame::Shadow::Plain);
        background_10->setPixmap(QPixmap(QString::fromUtf8("../resources/lights.png")));
        background_10->setScaledContents(true);
        background_10->setAlignment(Qt::AlignmentFlag::AlignLeading|Qt::AlignmentFlag::AlignLeft|Qt::AlignmentFlag::AlignVCenter);
        background_10->setWordWrap(false);
        background_10->setOpenExternalLinks(false);
        background_11 = new QLabel(mainwindow);
        background_11->setObjectName("background_11");
        background_11->setEnabled(true);
        background_11->setGeometry(QRect(840, 0, 121, 111));
        background_11->setStyleSheet(QString::fromUtf8("Qlabel {\n"
"    border: none;\n"
"    background: none;\n"
"    border-radius: 15px; \n"
"    background-color: transparent\n"
"}"));
        background_11->setFrameShape(QFrame::Shape::NoFrame);
        background_11->setFrameShadow(QFrame::Shadow::Plain);
        background_11->setPixmap(QPixmap(QString::fromUtf8("../resources/lights.png")));
        background_11->setScaledContents(true);
        background_11->setAlignment(Qt::AlignmentFlag::AlignLeading|Qt::AlignmentFlag::AlignLeft|Qt::AlignmentFlag::AlignVCenter);
        background_11->setWordWrap(false);
        background_11->setOpenExternalLinks(false);
        background_12 = new QLabel(mainwindow);
        background_12->setObjectName("background_12");
        background_12->setEnabled(true);
        background_12->setGeometry(QRect(240, 0, 121, 111));
        background_12->setStyleSheet(QString::fromUtf8("Qlabel {\n"
"    border: none;\n"
"    background: none;\n"
"    border-radius: 15px; \n"
"    background-color: transparent\n"
"}"));
        background_12->setFrameShape(QFrame::Shape::NoFrame);
        background_12->setFrameShadow(QFrame::Shadow::Plain);
        background_12->setPixmap(QPixmap(QString::fromUtf8("../resources/lights.png")));
        background_12->setScaledContents(true);
        background_12->setAlignment(Qt::AlignmentFlag::AlignLeading|Qt::AlignmentFlag::AlignLeft|Qt::AlignmentFlag::AlignVCenter);
        background_12->setWordWrap(false);
        background_12->setOpenExternalLinks(false);
        background_13 = new QLabel(mainwindow);
        background_13->setObjectName("background_13");
        background_13->setEnabled(true);
        background_13->setGeometry(QRect(120, 0, 121, 111));
        background_13->setStyleSheet(QString::fromUtf8("Qlabel {\n"
"    border: none;\n"
"    background: none;\n"
"    border-radius: 15px; \n"
"    background-color: transparent\n"
"}"));
        background_13->setFrameShape(QFrame::Shape::NoFrame);
        background_13->setFrameShadow(QFrame::Shadow::Plain);
        background_13->setPixmap(QPixmap(QString::fromUtf8("../resources/lights.png")));
        background_13->setScaledContents(true);
        background_13->setAlignment(Qt::AlignmentFlag::AlignLeading|Qt::AlignmentFlag::AlignLeft|Qt::AlignmentFlag::AlignVCenter);
        background_13->setWordWrap(false);
        background_13->setOpenExternalLinks(false);
        background->raise();
        enterButton->raise();
        regButton->raise();
        introText_2->raise();
        background_3->raise();
        background_4->raise();
        background_5->raise();
        background_6->raise();
        background_7->raise();
        background_8->raise();
        background_9->raise();
        background_10->raise();
        background_11->raise();
        background_12->raise();
        background_13->raise();

        retranslateUi(mainwindow);

        QMetaObject::connectSlotsByName(mainwindow);
    } // setupUi

    void retranslateUi(QWidget *mainwindow)
    {
        mainwindow->setWindowTitle(QCoreApplication::translate("mainwindow", "mainwindow", nullptr));
        background->setText(QString());
        introText_2->setText(QCoreApplication::translate("mainwindow", "\320\224\320\276\320\261\321\200\320\276 \320\277\320\276\320\266\320\260\320\273\320\276\320\262\320\260\321\202\321\214!", nullptr));
        enterButton->setText(QCoreApplication::translate("mainwindow", "\320\222\321\205\320\276\320\264", nullptr));
        regButton->setText(QCoreApplication::translate("mainwindow", "\320\240\320\265\320\263\320\270\321\201\321\202\321\200\320\260\321\206\320\270\321\217", nullptr));
        background_3->setText(QString());
        background_4->setText(QString());
        background_5->setText(QString());
        background_6->setText(QString());
        background_7->setText(QString());
        background_8->setText(QString());
        background_9->setText(QString());
        background_10->setText(QString());
        background_11->setText(QString());
        background_12->setText(QString());
        background_13->setText(QString());
    } // retranslateUi

};

namespace Ui {
    class mainwindow: public Ui_mainwindow {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_MAINWINDOW_H
