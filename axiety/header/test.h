#ifndef UNTITLED7_TEST_H
#define UNTITLED7_TEST_H

#include <QWidget>


QT_BEGIN_NAMESPACE
namespace Ui { class test; }
QT_END_NAMESPACE

class test : public QWidget {
    Q_OBJECT

public:
    explicit test(QWidget *parent = nullptr);

    ~test() override;

private:
    Ui::test *ui;
};


#endif