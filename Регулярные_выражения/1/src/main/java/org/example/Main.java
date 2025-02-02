package org.example;

public class Main {
    public static void main(String[] args) {
        String[] testCases = {
                "101",
                "111",
                "1001",
                "10101",
                "1010101",
                "10a01",
                "20011",
                ""
        };

        for (String testCase : testCases) {
            boolean matchesRegex = testCase.matches("^(?=[01]*0[01]*0)(?!.*00)[01]+$");
            boolean isValid = isValidBinaryString(testCase);
            System.out.printf("%s -> регулярное выражение: %b, функция: %b%n", testCase, matchesRegex, isValid);
        }
    }

    public static boolean isValidBinaryString(String input) {
        if (input == null || input.isEmpty() || !input.matches("[01]+")) {
            return false;
        }

        if (countOccurrences(input, '0') < 2) {
            return false;
        }

        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == '0' && input.charAt(i + 1) == '0') {
                return false;
            }
        }

        return true;
    }

    private static int countOccurrences(String str, char ch) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == ch) {
                count++;
            }
        }
        return count;
    }
}
