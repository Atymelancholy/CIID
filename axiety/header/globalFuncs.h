#ifndef LAB_2_GLOBALFUNCS_H
#define LAB_2_GLOBALFUNCS_H

#include <iostream>
#include "../header/UserManager.h"

void handleRegistration(UserManager& userManager);
bool handleLogin(UserManager& userManager, std::string& username);
void handleTesting();
void handleUserActions(UserManager& userManager, const std::string& username);

#endif
