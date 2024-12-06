package org.example;

public class Main {
    public static void main(String[] args) {
        CuckooHashTable hashTable = new CuckooHashTable();

        hashTable.insert("Hey");
        hashTable.insert("Wait");
        hashTable.insert("I've got a new complaint");

        System.out.println("Contains 'Hey' - " + hashTable.contains("Hey"));
        hashTable.remove("Hey");
        System.out.println("Contains 'Hey' after removal - " + hashTable.contains("Hey"));
        System.out.println("Size - " + hashTable.size());
    }
}
