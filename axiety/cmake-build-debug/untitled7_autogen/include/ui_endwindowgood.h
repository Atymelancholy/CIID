/********************************************************************************
** Form generated from reading UI file 'endwindowgood.ui'
**
** Created by: Qt User Interface Compiler version 6.7.2
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_ENDWINDOWGOOD_H
#define UI_ENDWINDOWGOOD_H

#include <QtCore/QVariant>
#include <QtWidgets/QApplication>
#include <QtWidgets/QLabel>
#include <QtWidgets/QPushButton>
#include <QtWidgets/QWidget>

QT_BEGIN_NAMESPACE

class Ui_endwindowgood
{
public:
    QLabel *background;
    QLabel *introText_2;
    QLabel *background_2;
    QLabel *background_3;
    QPushButton *enterButton;

    void setupUi(QWidget *endwindowgood)
    {
        if (endwindowgood->objectName().isEmpty())
            endwindowgood->setObjectName("endwindowgood");
        endwindowgood->resize(791, 597);
        background = new QLabel(endwindowgood);
        background->setObjectName("background");
        background->setEnabled(true);
        background->setGeometry(QRect(0, -10, 800, 600));
        background->setStyleSheet(QString::fromUtf8("Qlabel {\n"
"    border: none;\n"
"    background: none;\n"
"}"));
        background->setFrameShape(QFrame::Shape::NoFrame);
        background->setFrameShadow(QFrame::Shadow::Plain);
        background->setPixmap(QPixmap(QString::fromUtf8("../resources/vintage-wallpaper-background.jpg")));
        background->setScaledContents(true);
        background->setAlignment(Qt::AlignmentFlag::AlignLeading|Qt::AlignmentFlag::AlignLeft|Qt::AlignmentFlag::AlignVCenter);
        background->setWordWrap(false);
        background->setOpenExternalLinks(false);
        introText_2 = new QLabel(endwindowgood);
        introText_2->setObjectName("introText_2");
        introText_2->setGeometry(QRect(90, 50, 661, 151));
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
        background_2 = new QLabel(endwindowgood);
        background_2->setObjectName("background_2");
        background_2->setEnabled(true);
        background_2->setGeometry(QRect(220, 200, 361, 321));
        background_2->setStyleSheet(QString::fromUtf8("Qlabel {\n"
"    border: none;\n"
"    background: none;\n"
"}"));
        background_2->setFrameShape(QFrame::Shape::NoFrame);
        background_2->setFrameShadow(QFrame::Shadow::Plain);
        background_2->setPixmap(QPixmap(QString::fromUtf8("../resources/homik3.png")));
        background_2->setScaledContents(true);
        background_2->setAlignment(Qt::AlignmentFlag::AlignLeading|Qt::AlignmentFlag::AlignLeft|Qt::AlignmentFlag::AlignVCenter);
        background_2->setWordWrap(false);
        background_2->setOpenExternalLinks(false);
        background_3 = new QLabel(endwindowgood);
        background_3->setObjectName("background_3");
        background_3->setEnabled(true);
        background_3->setGeometry(QRect(20, 20, 751, 551));
        background_3->setStyleSheet(QString::fromUtf8("Qlabel {\n"
"    border: none;\n"
"    background: none;\n"
"}"));
        background_3->setFrameShape(QFrame::Shape::NoFrame);
        background_3->setFrameShadow(QFrame::Shadow::Plain);
        background_3->setPixmap(QPixmap(QString::fromUtf8("../resources/paper-background.png")));
        background_3->setScaledContents(true);
        background_3->setAlignment(Qt::AlignmentFlag::AlignLeading|Qt::AlignmentFlag::AlignLeft|Qt::AlignmentFlag::AlignVCenter);
        background_3->setWordWrap(false);
        background_3->setOpenExternalLinks(false);
        enterButton = new QPushButton(endwindowgood);
        enterButton->setObjectName("enterButton");
        enterButton->setGeometry(QRect(270, 530, 261, 51));
        QFont font1;
        font1.setFamilies({QString::fromUtf8("MS Serif")});
        enterButton->setFont(font1);
        enterButton->setStyleSheet(QString::fromUtf8("QPushButton {\n"
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
        background->raise();
        background_3->raise();
        introText_2->raise();
        background_2->raise();
        enterButton->raise();

        retranslateUi(endwindowgood);

        QMetaObject::connectSlotsByName(endwindowgood);
    } // setupUi

    void retranslateUi(QWidget *endwindowgood)
    {
        endwindowgood->setWindowTitle(QCoreApplication::translate("endwindowgood", "endwindowgood", nullptr));
        background->setText(QString());
        introText_2->setText(QCoreApplication::translate("endwindowgood", "\320\237\320\276\320\267\320\264\321\200\320\260\320\262\320\273\321\217\321\216, \321\201 \320\262\320\260\320\274\320\270 \320\262\321\201\320\265 \321\205\320\276\321\200\320\276\321\210\320\276!", nullptr));
        background_2->setText(QString());
        background_3->setText(QString());
        enterButton->setText(QCoreApplication::translate("endwindowgood", "\320\262\320\265\321\200\320\275\321\203\321\202\321\214\321\201\321\217 \320\262 \320\275\320\260\321\207\320\260\320\273\320\276", nullptr));
    } // retranslateUi

};

namespace Ui {
    class endwindowgood: public Ui_endwindowgood {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_ENDWINDOWGOOD_H
