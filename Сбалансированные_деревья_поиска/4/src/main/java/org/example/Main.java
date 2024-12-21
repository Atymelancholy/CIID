package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] sizes = {10000, 100000, 1000000};
        Random random = new Random();

        for (int size : sizes) {
            RedBlackTree tree = new RedBlackTree();
            for (int i = 0; i < size; i++) {
                tree.insert(random.nextInt());
            }

            int redNodes = tree.countRedNodes();
            double redPercentage = 100.0 * redNodes / size;
            System.out.printf("For size %d, red nodes percentage: %.2f%%\n", size, redPercentage);

            // Пример вывода дерева для проверки работоспособности
            // Примечание: поменяйте заданные условием параметры size
            // System.out.println("\nСтруктура дерева:");
            // tree.printTree();
        }
    }
}
