#ifndef UNTITLED7_ENDWINDOW_H
#define UNTITLED7_ENDWINDOW_H

#include <QWidget>


QT_BEGIN_NAMESPACE
namespace Ui { class endwindow; }
QT_END_NAMESPACE

class endwindow : public QWidget {
Q_OBJECT

public:
    explicit endwindow(QWidget *parent = nullptr);

    ~endwindow() override;

private:
    Ui::endwindow *ui;
};


#endif
