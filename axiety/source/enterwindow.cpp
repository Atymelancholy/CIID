#include "../header/enterwindow.h"
#include "ui_enterWindow.h"

enterWindow::enterWindow(QWidget *parent) :
        QWidget(parent), ui(new Ui::enterWindow) {
    ui->setupUi(this);
}

enterWindow::~enterWindow() {
    delete ui;
}
