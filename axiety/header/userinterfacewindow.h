#ifndef UNTITLED7_USERINTERFACEWINDOW_H
#define UNTITLED7_USERINTERFACEWINDOW_H

#include <QWidget>

#include <QMainWindow>
#include <QStackedWidget>
#include "UserManager.h"

QT_BEGIN_NAMESPACE
namespace Ui { class UserInterfaceWindow; }
QT_END_NAMESPACE

class UserInterfaceWindow : public QWidget {
Q_OBJECT

public:
    explicit UserInterfaceWindow(QWidget *parent = nullptr);

    ~UserInterfaceWindow() override;

private:
    Ui::UserInterfaceWindow *ui;
    UserManager userManager;
    QString currentUser;
};

#endif

