package org.example;

public class Main {

    public static int findSubstring(String text, String pattern) {
        int textLength = text.length();
        int patternLength = pattern.length();

        if (patternLength == 0) {
            return 0;
        }

        if (patternLength > textLength) {
            return -1;
        }

        for (int i = textLength - patternLength; i >= 0; i--) {
            boolean match = true;
            for (int j = patternLength - 1; j >= 0; j--) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    match = false;
                    break;
                }
            }

            if (match) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String text = "В старой церкви не поют святые гимны";
        String pattern = "поют";

        int position = findSubstring(text, pattern);

        if (position != -1) {
            System.out.println("Подстрока найдена на позиции: " + position);
        } else {
            System.out.println("Подстрока не найдена.");
        }
    }
}
