/********************************************************************************
** Form generated from reading UI file 'endwindownotbad.ui'
**
** Created by: Qt User Interface Compiler version 6.7.2
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_ENDWINDOWNOTBAD_H
#define UI_ENDWINDOWNOTBAD_H

#include <QtCore/QVariant>
#include <QtWidgets/QApplication>
#include <QtWidgets/QLabel>
#include <QtWidgets/QPushButton>
#include <QtWidgets/QVBoxLayout>
#include <QtWidgets/QWidget>

QT_BEGIN_NAMESPACE

class Ui_endwindownotbad
{
public:
    QLabel *introText_2;
    QLabel *introText_6;
    QWidget *layoutWidget;
    QVBoxLayout *verticalLayout_2;
    QLabel *introText_4;
    QLabel *introText_3;
    QLabel *introText_5;
    QLabel *background;
    QLabel *background_2;
    QPushButton *enterButton;

    void setupUi(QWidget *endwindownotbad)
    {
        if (endwindownotbad->objectName().isEmpty())
            endwindownotbad->setObjectName("endwindownotbad");
        endwindownotbad->resize(800, 600);
        introText_2 = new QLabel(endwindownotbad);
        introText_2->setObjectName("introText_2");
        introText_2->setGeometry(QRect(40, 0, 721, 81));
        QFont font;
        font.setFamilies({QString::fromUtf8("MS Serif")});
        font.setPointSize(20);
        font.setBold(false);
        introText_2->setFont(font);
        introText_2->setStyleSheet(QString::fromUtf8("QLabel{\n"
"    border: none;\n"
"    background: none;\n"
"    color: rgb(123, 156, 100);\n"
"}\n"
""));
        introText_6 = new QLabel(endwindownotbad);
        introText_6->setObjectName("introText_6");
        introText_6->setGeometry(QRect(130, 200, 701, 21));
        QFont font1;
        font1.setFamilies({QString::fromUtf8("MS Serif")});
        font1.setPointSize(15);
        font1.setBold(false);
        introText_6->setFont(font1);
        introText_6->setStyleSheet(QString::fromUtf8("QLabel{\n"
"    border: none;\n"
"    background: none;\n"
"    color: rgb(123, 156, 100);\n"
"}\n"
""));
        layoutWidget = new QWidget(endwindownotbad);
        layoutWidget->setObjectName("layoutWidget");
        layoutWidget->setGeometry(QRect(40, 80, 706, 80));
        verticalLayout_2 = new QVBoxLayout(layoutWidget);
        verticalLayout_2->setObjectName("verticalLayout_2");
        verticalLayout_2->setContentsMargins(0, 0, 0, 0);
        introText_4 = new QLabel(layoutWidget);
        introText_4->setObjectName("introText_4");
        QFont font2;
        font2.setFamilies({QString::fromUtf8("MS Serif")});
        font2.setPointSize(17);
        font2.setBold(false);
        introText_4->setFont(font2);
        introText_4->setStyleSheet(QString::fromUtf8("QLabel{\n"
"    border: none;\n"
"    background: none;\n"
"    color: rgb(123, 156, 100);\n"
"}"));

        verticalLayout_2->addWidget(introText_4);

        introText_3 = new QLabel(layoutWidget);
        introText_3->setObjectName("introText_3");
        introText_3->setFont(font2);
        introText_3->setStyleSheet(QString::fromUtf8("QLabel{\n"
"    border: none;\n"
"    background: none;\n"
"    color: rgb(123, 156, 100);\n"
"}"));

        verticalLayout_2->addWidget(introText_3);

        introText_5 = new QLabel(layoutWidget);
        introText_5->setObjectName("introText_5");
        introText_5->setFont(font2);
        introText_5->setStyleSheet(QString::fromUtf8("QLabel{\n"
"    border: none;\n"
"    background: none;\n"
"    color: rgb(123, 156, 100);\n"
"}"));

        verticalLayout_2->addWidget(introText_5);

        background = new QLabel(endwindownotbad);
        background->setObjectName("background");
        background->setEnabled(true);
        background->setGeometry(QRect(210, 250, 371, 281));
        background->setStyleSheet(QString::fromUtf8("Qlabel {\n"
"    border: none;\n"
"    background: none;\n"
"}"));
        background->setFrameShape(QFrame::Shape::NoFrame);
        background->setFrameShadow(QFrame::Shadow::Plain);
        background->setPixmap(QPixmap(QString::fromUtf8("../resources/homik2.png")));
        background->setScaledContents(true);
        background->setAlignment(Qt::AlignmentFlag::AlignLeading|Qt::AlignmentFlag::AlignLeft|Qt::AlignmentFlag::AlignVCenter);
        background->setWordWrap(false);
        background->setOpenExternalLinks(false);
        background_2 = new QLabel(endwindownotbad);
        background_2->setObjectName("background_2");
        background_2->setEnabled(true);
        background_2->setGeometry(QRect(-10, 0, 811, 621));
        background_2->setStyleSheet(QString::fromUtf8("Qlabel {\n"
"    border: none;\n"
"    background: none;\n"
"}"));
        background_2->setFrameShape(QFrame::Shape::NoFrame);
        background_2->setFrameShadow(QFrame::Shadow::Plain);
        background_2->setPixmap(QPixmap(QString::fromUtf8("../resources/paper-background.png")));
        background_2->setScaledContents(true);
        background_2->setAlignment(Qt::AlignmentFlag::AlignLeading|Qt::AlignmentFlag::AlignLeft|Qt::AlignmentFlag::AlignVCenter);
        background_2->setWordWrap(false);
        background_2->setOpenExternalLinks(false);
        enterButton = new QPushButton(endwindownotbad);
        enterButton->setObjectName("enterButton");
        enterButton->setGeometry(QRect(270, 540, 261, 51));
        QFont font3;
        font3.setFamilies({QString::fromUtf8("MS Serif")});
        enterButton->setFont(font3);
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
        background_2->raise();
        introText_2->raise();
        introText_6->raise();
        layoutWidget->raise();
        background->raise();
        enterButton->raise();

        retranslateUi(endwindownotbad);

        QMetaObject::connectSlotsByName(endwindownotbad);
    } // setupUi

    void retranslateUi(QWidget *endwindownotbad)
    {
        endwindownotbad->setWindowTitle(QCoreApplication::translate("endwindownotbad", "endwindownotbad", nullptr));
        introText_2->setText(QCoreApplication::translate("endwindownotbad", "\320\240\320\265\320\272\320\276\320\274\320\265\320\275\320\264\320\260\321\206\320\270\320\270 \320\277\320\276 \321\203\320\277\321\200\320\260\320\262\320\273\320\265\320\275\320\270\321\216 \321\201\321\200\320\265\320\264\320\275\320\265\320\271 \321\202\321\200\320\265\320\262\320\276\320\266\320\275\320\276\321\201\321\202\321\214\320\270", nullptr));
        introText_6->setText(QCoreApplication::translate("endwindownotbad", "\320\237\321\200\320\270\321\201\320\273\321\203\321\210\320\260\320\271\321\202\320\265\321\201\321\214, \320\277\320\276\320\266\320\260\320\273\321\203\320\271\321\201\321\202\320\260, \320\275\320\265 \320\261\321\203\320\264\321\214\321\202\320\265 \320\272\320\260\320\272 \321\215\321\202\320\276\321\202 \321\205\320\276\320\274\321\217\321\207\320\272\320\270", nullptr));
        introText_4->setText(QCoreApplication::translate("endwindownotbad", "- \320\237\321\200\320\260\320\272\321\202\320\270\320\272\321\203\320\271\321\202\320\265 \321\204\320\270\320\267\320\270\321\207\320\265\321\201\320\272\321\203\321\216 \320\260\320\272\321\202\320\270\320\262\320\275\320\276\321\201\321\202\321\214 \320\264\320\273\321\217 \321\201\320\275\321\217\321\202\320\270\321\217 \321\201\321\202\321\200\320\265\321\201\321\201\320\260.", nullptr));
        introText_3->setText(QCoreApplication::translate("endwindownotbad", "- \320\241\321\202\320\260\321\200\320\260\320\271\321\202\320\265\321\201\321\214 \320\270\320\267\320\261\320\265\320\263\320\260\321\202\321\214 \320\277\320\265\321\200\320\265\320\263\321\200\321\203\320\267\320\272\320\270 \320\270\320\275\321\204\320\276\321\200\320\274\320\260\321\206\320\270\320\265\320\271.", nullptr));
        introText_5->setText(QCoreApplication::translate("endwindownotbad", "- \320\230\321\201\320\277\320\276\320\273\321\214\320\267\321\203\320\271\321\202\320\265 \321\202\320\265\321\205\320\275\320\270\320\272\320\270 \321\200\320\260\321\201\321\201\320\273\320\260\320\261\320\273\320\265\320\275\320\270\321\217, \321\202\320\260\320\272\320\270\320\265 \320\272\320\260\320\272 \320\271\320\276\320\263\320\260 \320\270\320\273\320\270 \321\200\320\260\321\201\321\201\320\273\320\260\320\261\320\273\321\217\321\216\321\211\320\260\321\217 \320\274\321\203\320\267\321\213\320\272\320\260.", nullptr));
        background->setText(QString());
        background_2->setText(QString());
        enterButton->setText(QCoreApplication::translate("endwindownotbad", "\320\262\320\265\321\200\320\275\321\203\321\202\321\214\321\201\321\217 \320\262 \320\275\320\260\321\207\320\260\320\273\320\276", nullptr));
    } // retranslateUi

};

namespace Ui {
    class endwindownotbad: public Ui_endwindownotbad {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_ENDWINDOWNOTBAD_H
