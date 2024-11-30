#ifndef UNTITLED7_ENDWINDOWGOOD_H
#define UNTITLED7_ENDWINDOWGOOD_H

#include <QWidget>


QT_BEGIN_NAMESPACE
namespace Ui { class endwindowgood; }
QT_END_NAMESPACE

class endwindowgood : public QWidget {
Q_OBJECT

public:
    explicit endwindowgood(QWidget *parent = nullptr);

    ~endwindowgood() override;

private:
    Ui::endwindowgood *ui;
};


#endif
