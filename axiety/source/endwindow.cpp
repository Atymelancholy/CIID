#include "../header/endwindow.h"
#include "ui_endwindow.h"


endwindow::endwindow(QWidget *parent) :
        QWidget(parent), ui(new Ui::endwindow) {
    ui->setupUi(this);
}

endwindow::~endwindow() {
    delete ui;
}
