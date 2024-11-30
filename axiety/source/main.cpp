#include <QApplication>
#include <QPushButton>
#include <iostream>
#include <fstream>
#include <sstream>
#include <unordered_map>
#include "../header/AnxietyTest.h"
#include "../header/AnxietyCopingSuggestions.h"
#include "../header/UserManager.h"
#include "../header/SituationalAnxietyTest.h"
#include "../header/PersonalAnxietyTest.h"
#include "../header/globalFuncs.h"
#include "../header/mainwindow.h"

using namespace std;

int main(int argc, char *argv[]) {
    system("chcp 65001");

    QApplication app(argc, argv);
    mainwindow mainWindow;
    mainWindow.show();
    return QApplication::exec();
}
