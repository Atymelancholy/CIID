package org.example;

public class Main {
    public static void main(String[] args) {
        String binaryStr1 = "110";
        String binaryStr2 = "1010";

        if (isDivisibleBy2(binaryStr1)) {
            System.out.println(binaryStr1 + " делится на 2.");
        } else {
            System.out.println(binaryStr1 + " не делится на 2.");
        }

        if (isDivisibleBy3(binaryStr2)) {
            System.out.println(binaryStr2 + " делится на 3.");
        } else {
            System.out.println(binaryStr2 + " не делится на 3.");
        }

        if (isDivisibleBy123(binaryStr2)) {
            System.out.println(binaryStr2 + " делится на 123.");
        } else {
            System.out.println(binaryStr2 + " не делится на 123.");
        }
    }

    public static boolean isDivisibleBy2(String binary) {
        return binary.length() > 0 && binary.charAt(binary.length() - 1) == '0';
    }

    public static boolean isDivisibleBy3(String binary) {
        int remainder = 0;
        for (char bit : binary.toCharArray()) {
            remainder = (remainder * 2 + (bit - '0')) % 3;
        }
        return remainder == 0;
    }

    public static boolean isDivisibleBy123(String binary) {
        int remainder = 0;
        for (char bit : binary.toCharArray()) {
            remainder = (remainder * 2 + (bit - '0')) % 123;
        }
        return remainder == 0;
    }
}
