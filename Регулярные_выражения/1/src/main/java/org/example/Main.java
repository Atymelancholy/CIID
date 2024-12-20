package org.example;

public class Main {
    public static void main(String[] args) {
        String[] testCases = {
                "101",
                "111",
                "1001",
                "10101",
                "1010101"
        };

        for (String testCase : testCases) {
            boolean isValid = isValidBinaryString(testCase);
            System.out.printf("String: %s -> %b%n", testCase, isValid);
        }
    }

    public static boolean isValidBinaryString(String input) {
        if (input == null || input.isEmpty()) {
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

