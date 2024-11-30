cmake_minimum_required(VERSION 3.26)
project(untitled7)

set(CMAKE_CXX_STANDARD 23)
set(CMAKE_AUTOMOC ON)
set(CMAKE_AUTORCC ON)
set(CMAKE_AUTOUIC ON)
set(CMAKE_PREFIX_PATH "C:\\Qt\\6.7.2\\mingw_64")

find_package(Qt6 COMPONENTS
        Core
        Gui
        Widgets
        REQUIRED)

add_executable(untitled7 source/main.cpp
        source/AnxietyTest.cpp
        header/AnxietyTest.h
        source/AnxietyCopingSuggestions.cpp
        header/AnxietyCopingSuggestions.h
        source/SituationalAnxietyTest.cpp
        header/SituationalAnxietyTest.h
        source/PersonalAnxietyTest.cpp
        header/PersonalAnxietyTest.h
        source/UserManager.cpp
        header/UserManager.h
        source/globalFuncs.cpp
        header/globalFuncs.h
        header/AnxietyTest.h
        header/AnxietyCopingSuggestions.h
        header/globalFuncs.h
        header/PersonalAnxietyTest.h
        header/SituationalAnxietyTest.h
        header/UserManager.h
        source/mainwindow.cpp
        header/mainwindow.h
        source/mainwindow.ui
        source/enterwindow.cpp
        header/enterwindow.h
        source/enterwindow.ui
        source/userinterfacewindow.cpp
        header/userinterfacewindow.h
        source/userinterfacewindow.ui
        source/endwindow.cpp
        header/endwindow.h
        source/endwindow.ui
        source/endwindowgood.cpp
        header/endwindowgood.h
        source/endwindowgood.ui
        source/endwindownotbad.cpp
        header/endwindownotbad.h
        source/endwindownotbad.ui
        source/test.cpp
        header/test.h
        source/test.ui
        source/history.cpp
        header/history.h
        source/history.ui)
target_link_libraries(untitled7
        Qt::Core
        Qt::Gui
        Qt::Widgets
)

if (WIN32 AND NOT DEFINED CMAKE_TOOLCHAIN_FILE)
    set(DEBUG_SUFFIX)
    if (MSVC AND CMAKE_BUILD_TYPE MATCHES "Debug")
        set(DEBUG_SUFFIX "d")
    endif ()
    set(QT_INSTALL_PATH "${CMAKE_PREFIX_PATH}")
    if (NOT EXISTS "${QT_INSTALL_PATH}/bin")
        set(QT_INSTALL_PATH "${QT_INSTALL_PATH}/..")
        if (NOT EXISTS "${QT_INSTALL_PATH}/bin")
            set(QT_INSTALL_PATH "${QT_INSTALL_PATH}/..")
        endif ()
    endif ()
    if (EXISTS "${QT_INSTALL_PATH}/plugins/platforms/qwindows${DEBUG_SUFFIX}.dll")
        add_custom_command(TARGET ${PROJECT_NAME} POST_BUILD
                COMMAND ${CMAKE_COMMAND} -E make_directory
                "$<TARGET_FILE_DIR:${PROJECT_NAME}>/plugins/platforms/")
        add_custom_command(TARGET ${PROJECT_NAME} POST_BUILD
                COMMAND ${CMAKE_COMMAND} -E copy
                "${QT_INSTALL_PATH}/plugins/platforms/qwindows${DEBUG_SUFFIX}.dll"
                "$<TARGET_FILE_DIR:${PROJECT_NAME}>/plugins/platforms/")
    endif ()
    foreach (QT_LIB Core Gui Widgets)
        add_custom_command(TARGET ${PROJECT_NAME} POST_BUILD
                COMMAND ${CMAKE_COMMAND} -E copy
                "${QT_INSTALL_PATH}/bin/Qt6${QT_LIB}${DEBUG_SUFFIX}.dll"
                "$<TARGET_FILE_DIR:${PROJECT_NAME}>")
    endforeach (QT_LIB)
endif ()
