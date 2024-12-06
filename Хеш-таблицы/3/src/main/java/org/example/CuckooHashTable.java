package org.example;

import java.util.Random;

public class CuckooHashTable {
    private static final int DEFAULT_CAPACITY = 16;
    private static final double MAX_LOAD_FACTOR = 0.5;
    private static final int MAX_RETRIES = 16;

    private String[] table1;
    private String[] table2;
    private int size;
    private final Random random;

    public CuckooHashTable() {
        this(DEFAULT_CAPACITY);
    }

    public CuckooHashTable(int capacity) {
        table1 = new String[capacity];
        table2 = new String[capacity];
        size = 0;
        random = new Random();
    }

    private int hash1(String key) {
        return Math.abs(key.hashCode()) % table1.length;
    }

    private int hash2(String key) {
        return Math.abs((key.hashCode() * 31) ^ random.nextInt()) % table2.length;
    }

    public void insert(String key) {
        if (loadFactor() > MAX_LOAD_FACTOR) {
            rehash();
        }

        if (insertHelper(key, MAX_RETRIES)) {
            size++;
        }
    }

    private boolean insertHelper(String key, int retries) {
        if (retries == 0) {
            rehash();
            return insertHelper(key, MAX_RETRIES);
        }

        int index1 = hash1(key);
        if (table1[index1] == null) {
            table1[index1] = key;
            return true;
        }

        String displacedKey = table1[index1];
        table1[index1] = key;

        int index2 = hash2(displacedKey);
        if (table2[index2] == null) {
            table2[index2] = displacedKey;
            return true;
        }

        key = table2[index2];
        table2[index2] = displacedKey;

        return insertHelper(key, retries - 1);
    }

    public boolean contains(String key) {
        int index1 = hash1(key);
        if (table1[index1] != null && table1[index1].equals(key)) {
            return true;
        }

        int index2 = hash2(key);
        return table2[index2] != null && table2[index2].equals(key);
    }

    public void remove(String key) {
        int index1 = hash1(key);
        if (table1[index1] != null && table1[index1].equals(key)) {
            table1[index1] = null;
            size--;
            return;
        }

        int index2 = hash2(key);
        if (table2[index2] != null && table2[index2].equals(key)) {
            table2[index2] = null;
            size--;
        }
    }

    private double loadFactor() {
        return (double) size / (table1.length + table2.length);
    }

    private void rehash() {
        String[] oldTable1 = table1;
        String[] oldTable2 = table2;

        int newCapacity = table1.length * 2;
        table1 = new String[newCapacity];
        table2 = new String[newCapacity];
        size = 0;

        for (String key : oldTable1) {
            if (key != null) {
                insert(key);
            }
        }

        for (String key : oldTable2) {
            if (key != null) {
                insert(key);
            }
        }
    }

    public int size() {
        return size;
    }
}
