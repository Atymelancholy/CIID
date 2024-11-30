#include "../header/endwindowgood.h"
#include "ui_endwindowgood.h"


endwindowgood::endwindowgood(QWidget *parent) :
        QWidget(parent), ui(new Ui::endwindowgood) {
    ui->setupUi(this);
}

endwindowgood::~endwindowgood() {
    delete ui;
}
