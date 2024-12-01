/********************************************************************************
** Form generated from reading UI file 'history.ui'
**
** Created by: Qt User Interface Compiler version 6.7.2
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_HISTORY_H
#define UI_HISTORY_H

#include <QtCore/QVariant>
#include <QtWidgets/QApplication>
#include <QtWidgets/QLabel>
#include <QtWidgets/QPushButton>
#include <QtWidgets/QWidget>

QT_BEGIN_NAMESPACE

class Ui_history
{
public:
    QLabel *background;
    QLabel *introText_2;
    QLabel *background_3;
    QLabel *background_4;
    QPushButton *enterButton_2;
    QLabel *background_5;
    QLabel *background_6;
    QLabel *background_8;
    QLabel *background_9;
    QLabel *background_10;
    QLabel *background_11;

    void setupUi(QWidget *history)
    {
        if (history->objectName().isEmpty())
            history->setObjectName("history");
        history->resize(800, 600);
        background = new QLabel(history);
        background->setObjectName("background");
        background->setEnabled(true);
        background->setGeometry(QRect(0, -10, 811, 621));
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
        introText_2 = new QLabel(history);
        introText_2->setObjectName("introText_2");
        introText_2->setGeometry(QRect(70, -30, 691, 181));
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
        background_3 = new QLabel(history);
        background_3->setObjectName("background_3");
        background_3->setEnabled(true);
        background_3->setGeometry(QRect(10, 10, 781, 101));
        background_3->setStyleSheet(QString::fromUtf8("Qlabel {\n"
"    border: none;\n"
"    background: none;\n"
"    border-radius: 15px; \n"
"    background-color: transparent\n"
"}"));
        background_3->setFrameShape(QFrame::Shape::NoFrame);
        background_3->setFrameShadow(QFrame::Shadow::Plain);
        background_3->setPixmap(QPixmap(QString::fromUtf8("../resources/vintage-wallpaper-background.png")));
        background_3->setScaledContents(true);
        background_3->setAlignment(Qt::AlignmentFlag::AlignLeading|Qt::AlignmentFlag::AlignLeft|Qt::AlignmentFlag::AlignVCenter);
        background_3->setWordWrap(false);
        background_3->setOpenExternalLinks(false);
        background_4 = new QLabel(history);
        background_4->setObjectName("background_4");
        background_4->setEnabled(true);
        background_4->setGeometry(QRect(10, 120, 781, 401));
        background_4->setStyleSheet(QString::fromUtf8("Qlabel {\n"
"    border: none;\n"
"    background: none;\n"
"    border-radius: 15px; \n"
"    background-color: transparent\n"
"}"));
        background_4->setFrameShape(QFrame::Shape::NoFrame);
        background_4->setFrameShadow(QFrame::Shadow::Plain);
        background_4->setPixmap(QPixmap(QString::fromUtf8("../resources/vintage-wallpaper-background.png")));
        background_4->setScaledContents(true);
        background_4->setAlignment(Qt::AlignmentFlag::AlignLeading|Qt::AlignmentFlag::AlignLeft|Qt::AlignmentFlag::AlignVCenter);
        background_4->setWordWrap(false);
        background_4->setOpenExternalLinks(false);
        enterButton_2 = new QPushButton(history);
        enterButton_2->setObjectName("enterButton_2");
        enterButton_2->setGeometry(QRect(320, 530, 161, 51));
        QFont font1;
        font1.setFamilies({QString::fromUtf8("MS Serif")});
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
        background_5 = new QLabel(history);
        background_5->setObjectName("background_5");
        background_5->setEnabled(true);
        background_5->setGeometry(QRect(10, 460, 151, 141));
        background_5->setStyleSheet(QString::fromUtf8("Qlabel {\n"
"    border: none;\n"
"    background: none;\n"
"    border-radius: 15px; \n"
"    background-color: transparent\n"
"}"));
        background_5->setFrameShape(QFrame::Shape::NoFrame);
        background_5->setFrameShadow(QFrame::Shadow::Plain);
        background_5->setPixmap(QPixmap(QString::fromUtf8("../resources/flower.png")));
        background_5->setScaledContents(true);
        background_5->setAlignment(Qt::AlignmentFlag::AlignLeading|Qt::AlignmentFlag::AlignLeft|Qt::AlignmentFlag::AlignVCenter);
        background_5->setWordWrap(false);
        background_5->setOpenExternalLinks(false);
        background_6 = new QLabel(history);
        background_6->setObjectName("background_6");
        background_6->setEnabled(true);
        background_6->setGeometry(QRect(580, 470, 151, 141));
        background_6->setStyleSheet(QString::fromUtf8("Qlabel {\n"
"    border: none;\n"
"    background: none;\n"
"    border-radius: 15px; \n"
"    background-color: transparent\n"
"}"));
        background_6->setFrameShape(QFrame::Shape::NoFrame);
        background_6->setFrameShadow(QFrame::Shadow::Plain);
        background_6->setPixmap(QPixmap(QString::fromUtf8("../resources/flower.png")));
        background_6->setScaledContents(true);
        background_6->setAlignment(Qt::AlignmentFlag::AlignLeading|Qt::AlignmentFlag::AlignLeft|Qt::AlignmentFlag::AlignVCenter);
        background_6->setWordWrap(false);
        background_6->setOpenExternalLinks(false);
        background_8 = new QLabel(history);
        background_8->setObjectName("background_8");
        background_8->setEnabled(true);
        background_8->setGeometry(QRect(210, 510, 101, 91));
        background_8->setStyleSheet(QString::fromUtf8("Qlabel {\n"
"    border: none;\n"
"    background: none;\n"
"    border-radius: 15px; \n"
"    background-color: transparent\n"
"}"));
        background_8->setFrameShape(QFrame::Shape::NoFrame);
        background_8->setFrameShadow(QFrame::Shadow::Plain);
        background_8->setPixmap(QPixmap(QString::fromUtf8("../resources/flower.png")));
        background_8->setScaledContents(true);
        background_8->setAlignment(Qt::AlignmentFlag::AlignLeading|Qt::AlignmentFlag::AlignLeft|Qt::AlignmentFlag::AlignVCenter);
        background_8->setWordWrap(false);
        background_8->setOpenExternalLinks(false);
        background_9 = new QLabel(history);
        background_9->setObjectName("background_9");
        background_9->setEnabled(true);
        background_9->setGeometry(QRect(490, 500, 111, 101));
        background_9->setStyleSheet(QString::fromUtf8("Qlabel {\n"
"    border: none;\n"
"    background: none;\n"
"    border-radius: 15px; \n"
"    background-color: transparent\n"
"}"));
        background_9->setFrameShape(QFrame::Shape::NoFrame);
        background_9->setFrameShadow(QFrame::Shadow::Plain);
        background_9->setPixmap(QPixmap(QString::fromUtf8("../resources/flower.png")));
        background_9->setScaledContents(true);
        background_9->setAlignment(Qt::AlignmentFlag::AlignLeading|Qt::AlignmentFlag::AlignLeft|Qt::AlignmentFlag::AlignVCenter);
        background_9->setWordWrap(false);
        background_9->setOpenExternalLinks(false);
        background_10 = new QLabel(history);
        background_10->setObjectName("background_10");
        background_10->setEnabled(true);
        background_10->setGeometry(QRect(720, 520, 91, 81));
        background_10->setStyleSheet(QString::fromUtf8("Qlabel {\n"
"    border: none;\n"
"    background: none;\n"
"    border-radius: 15px; \n"
"    background-color: transparent\n"
"}"));
        background_10->setFrameShape(QFrame::Shape::NoFrame);
        background_10->setFrameShadow(QFrame::Shadow::Plain);
        background_10->setPixmap(QPixmap(QString::fromUtf8("../resources/flower.png")));
        background_10->setScaledContents(true);
        background_10->setAlignment(Qt::AlignmentFlag::AlignLeading|Qt::AlignmentFlag::AlignLeft|Qt::AlignmentFlag::AlignVCenter);
        background_10->setWordWrap(false);
        background_10->setOpenExternalLinks(false);
        background_11 = new QLabel(history);
        background_11->setObjectName("background_11");
        background_11->setEnabled(true);
        background_11->setGeometry(QRect(130, 540, 71, 61));
        background_11->setStyleSheet(QString::fromUtf8("Qlabel {\n"
"    border: none;\n"
"    background: none;\n"
"    border-radius: 15px; \n"
"    background-color: transparent\n"
"}"));
        background_11->setFrameShape(QFrame::Shape::NoFrame);
        background_11->setFrameShadow(QFrame::Shadow::Plain);
        background_11->setPixmap(QPixmap(QString::fromUtf8("../resources/flower.png")));
        background_11->setScaledContents(true);
        background_11->setAlignment(Qt::AlignmentFlag::AlignLeading|Qt::AlignmentFlag::AlignLeft|Qt::AlignmentFlag::AlignVCenter);
        background_11->setWordWrap(false);
        background_11->setOpenExternalLinks(false);
        background->raise();
        background_3->raise();
        introText_2->raise();
        background_4->raise();
        enterButton_2->raise();
        background_5->raise();
        background_6->raise();
        background_8->raise();
        background_9->raise();
        background_10->raise();
        background_11->raise();

        retranslateUi(history);

        QMetaObject::connectSlotsByName(history);
    } // setupUi

    void retranslateUi(QWidget *history)
    {
        history->setWindowTitle(QCoreApplication::translate("history", "history", nullptr));
        background->setText(QString());
        introText_2->setText(QCoreApplication::translate("history", "\320\222\320\260\321\210\320\260 \320\270\321\201\321\202\320\276\321\200\320\270\321\217 \320\277\321\200\320\276\321\205\320\276\320\266\320\264\320\265\320\275\320\270\321\217 \321\202\320\265\321\201\321\202\320\260", nullptr));
        background_3->setText(QString());
        background_4->setText(QString());
        enterButton_2->setText(QCoreApplication::translate("history", "\320\235\320\260\320\267\320\260\320\264", nullptr));
        background_5->setText(QString());
        background_6->setText(QString());
        background_8->setText(QString());
        background_9->setText(QString());
        background_10->setText(QString());
        background_11->setText(QString());
    } // retranslateUi

};

namespace Ui {
    class history: public Ui_history {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_HISTORY_H
