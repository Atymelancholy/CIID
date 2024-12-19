package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main analysis = new Main();
        analysis.run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);

        int n = getInput(scanner, "Введите длину строки (N): ");
        int m = getInput(scanner, "Введите длину шаблона (M): ");

        if (!isValidInput(n, m)) {
            System.out.println("Длина шаблона (M) не может быть больше длины строки (N).");
            return;
        }

        String binaryString = generateBinaryString(n);
        System.out.println("Сгенерированная строка: " + binaryString);

        String pattern = extractPattern(binaryString, m);
        System.out.println("Шаблон для поиска: " + pattern);

        int occurrences = countOccurrences(binaryString.substring(0, n - m), pattern);
        System.out.println("Количество вхождений шаблона в других местах строки: " + occurrences);
    }

    private int getInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    private boolean isValidInput(int n, int m) {
        return m <= n;
    }

    private String generateBinaryString(int n) {
        Random random = new Random();
        StringBuilder binaryString = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            binaryString.append(random.nextInt(2)); // 0 или 1
        }
        return binaryString.toString();
    }

    private String extractPattern(String binaryString, int m) {
        return binaryString.substring(binaryString.length() - m);
    }

    private int countOccurrences(String text, String pattern) {
        int count = 0;
        int index = text.indexOf(pattern);
        while (index != -1) {
            count++;
            index = text.indexOf(pattern, index + 1);
        }
        return count;
    }
}
