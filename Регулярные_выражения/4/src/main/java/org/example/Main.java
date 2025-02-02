package org.example;

import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        String[] testStrings = {
                "(0)",
                "(1*)",
                "(0)(1*)",
                "(1(0))",
                "((0)1)",
                "(1(0)*)",
                "()((1*))",
                "(2)"
        };

        for (String testString : testStrings) {
            boolean isValid = isValidBinaryString(testString);
            System.out.println("Строка: \"" + testString + "\" -> " + (isValid ? "Допустима" : "Недопустима"));
        }
    }

    public static boolean isValidBinaryString(String str) {
        String regex = "^(\\([*01]*?\\))*$";
        return Pattern.matches(regex, str);
    }
}
