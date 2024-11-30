#include "../header/endwindownotbad.h"
#include "ui_endwindownotbad.h"


endwindownotbad::endwindownotbad(QWidget *parent) :
        QWidget(parent), ui(new Ui::endwindownotbad) {
    ui->setupUi(this);
}

endwindownotbad::~endwindownotbad() {
    delete ui;
}
