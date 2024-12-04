package org.example;

import java.util.Random;

public class PerformanceTest {

    private static final int NUMBER_OF_ELEMENTS = 100_000;

    public static void main(String[] args) {
        int[] testData = generateRandomData(NUMBER_OF_ELEMENTS);

        StandardBST standardTree = new StandardBST();
        runTests("Стандартное BST", standardTree, testData);

        ArrayBasedBST arrayTree = new ArrayBasedBST(NUMBER_OF_ELEMENTS);
        runTests("На массивах BST", arrayTree, testData);
    }

    private static int[] generateRandomData(int size) {
        Random random = new Random();
        int[] data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = random.nextInt(1_000_000);
        }
        return data;
    }

    private static void runTests(String treeName, Object tree, int[] data) {
        System.out.println("\nТестирование - " + treeName);

        long startTime = System.currentTimeMillis();
        if (tree instanceof StandardBST) {
            for (int key : data) {
                ((StandardBST) tree).insert(key);
            }
        } else if (tree instanceof ArrayBasedBST) {
            for (int key : data) {
                ((ArrayBasedBST) tree).insert(key);
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Время вставки: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        if (tree instanceof StandardBST) {
            for (int key : data) {
                ((StandardBST) tree).search(key);
            }
        } else if (tree instanceof ArrayBasedBST) {
            for (int key : data) {
                ((ArrayBasedBST) tree).search(key);
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("Время поиска: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();

        /*
         * Закомментирован, чтобы отключить вывод большого количества данных
         * на консоль.
         *
         *
        if (tree instanceof StandardBST) {
            ((StandardBST) tree).inOrderTraversal();
        } else if (tree instanceof ArrayBasedBST) {
            ((ArrayBasedBST) tree).inOrderTraversal();
        }
        */

        endTime = System.currentTimeMillis();
        System.out.println("Время прохождения: " + (endTime - startTime) + " ms");
    }
}
