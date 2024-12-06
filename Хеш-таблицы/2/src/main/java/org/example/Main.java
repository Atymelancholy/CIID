package org.example;

public class Main {
    public static void main(String[] args) {
        int m = 3;
        SeparateChainingHashST<Character, Integer> hashTable = new SeparateChainingHashST<>(m);

        char[] keys = {'E', 'A', 'S', 'Y', 'Q', 'U', 'T', 'I', 'O', 'N'};
        for (int i = 0; i < keys.length; i++) {
            hashTable.put(keys[i], i);
        }

        hashTable.printTable();

        System.out.println("Среднее количество проб для совпадений: " + hashTable.averageProbesForHits());
        System.out.println("Среднее количество проб на промахи: " + hashTable.averageProbesForMisses());
    }
}
