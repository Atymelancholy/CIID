#ifndef UNTITLED7_ENDWINDOWNOTBAD_H
#define UNTITLED7_ENDWINDOWNOTBAD_H

#include <QWidget>


QT_BEGIN_NAMESPACE
namespace Ui { class endwindownotbad; }
QT_END_NAMESPACE

class endwindownotbad : public QWidget {
Q_OBJECT

public:
    explicit endwindownotbad(QWidget *parent = nullptr);

    ~endwindownotbad() override;

private:
    Ui::endwindownotbad *ui;
};


#endif
