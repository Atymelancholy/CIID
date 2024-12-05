package org.example;

import java.util.Random;

public class LinearProbingHashTable {
    private int[] table;
    private int size;

    public LinearProbingHashTable(int size) {
        this.size = size;
        table = new int[size];
        for (int i = 0; i < size; i++) {
            table[i] = -1;
        }
    }

    private int hash(int key) {
        return (key % size + size) % size;
    }

    public int insert(int key) {
        int index = hash(key);
        int probes = 1;

        while (table[index] != -1) {
            index = (index + 1) % size;
            probes++;
        }

        table[index] = key;
        return probes;
    }

    public double averageProbes(int numKeys) {
        int totalProbes = 0;

        Random rand = new Random();
        for (int i = 0; i < numKeys; i++) {
            int key = rand.nextInt();
            totalProbes += insert(key);
        }

        return (double) totalProbes / numKeys;
    }
}
