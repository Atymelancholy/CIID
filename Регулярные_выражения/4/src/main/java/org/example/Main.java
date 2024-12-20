package org.example;

public class Main {
    public static void main(String[] args) {
        String[] testStrings = {
                "(0)",
                "(1*)",
                "(0)(1*)",
                "(1(0))",
                "((0)1)",
                "(1(0)*)",
                "()((1*))"
        };

        for (String testString : testStrings) {
            boolean isValid = isValidBinaryString(testString);
            System.out.println("Строка: \"" + testString + "\" -> " + (isValid ? "Допустима" : "Недопустима"));
        }
    }

    public static boolean isValidBinaryString(String str) {
        int depth = 0;

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (!isValidCharacter(currentChar)) {
                return false;
            }

            if (currentChar == '(') {
                depth++;
                if (depth > 1) {
                    return false;
                }
            } else if (currentChar == ')') {
                depth--;
                if (depth < 0) {
                    return false;
                }
            }
        }

        return depth == 0;
    }

    private static boolean isValidCharacter(char c) {
        return c == '0' || c == '1' || c == '*' || c == '(' || c == ')';
    }
}
