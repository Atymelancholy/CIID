#include "../header/userinterfacewindow.h"
#include "ui_UserInterfaceWindow.h"


UserInterfaceWindow::UserInterfaceWindow(QWidget *parent) :
        QWidget(parent), ui(new Ui::UserInterfaceWindow) {
    ui->setupUi(this);
}

UserInterfaceWindow::~UserInterfaceWindow() {
    delete ui;
}
