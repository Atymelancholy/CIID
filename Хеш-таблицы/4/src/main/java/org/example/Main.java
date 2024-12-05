package org.example;

public class Main {

    public static void main(String[] args) {
        int[] testSizes = {1000, 10000, 100000, 1000000};

        for (int n : testSizes) {
            System.out.println("Для N = " + n + ":");

            LinearProbingHashTable hashTable = new LinearProbingHashTable(n);

            int numKeys = n / 2;
            double avgProbes = hashTable.averageProbes(numKeys);

            System.out.println("Средняя стоимость промахов: " + avgProbes);
            System.out.println();
        }
    }
}
