#ifndef UNTITLED7_ENTERWINDOW_H
#define UNTITLED7_ENTERWINDOW_H

#include <QWidget>


QT_BEGIN_NAMESPACE
namespace Ui { class enterWindow; }
QT_END_NAMESPACE

class enterWindow : public QWidget {
Q_OBJECT

public:
    explicit enterWindow(QWidget *parent = nullptr);

    ~enterWindow() override;

private:
    Ui::enterWindow *ui;
};

#endif
