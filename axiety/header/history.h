#ifndef UNTITLED7_HISTORY_H
#define UNTITLED7_HISTORY_H

#include <QWidget>


QT_BEGIN_NAMESPACE
namespace Ui { class history; }
QT_END_NAMESPACE

class history : public QWidget {
Q_OBJECT

public:
    explicit history(QWidget *parent = nullptr);

    ~history() override;

private:
    Ui::history *ui;
};


#endif
