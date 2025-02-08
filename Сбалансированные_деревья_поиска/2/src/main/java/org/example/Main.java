package org.example;

public class Main {
    public static void main(String[] args) {
        RedBlackBST<Integer, String> tree = new RedBlackBST<>();

        tree.put(15, "A");
        tree.put(20, "B");
        tree.put(10, "C");
        tree.put(5, "D");
        tree.put(16, "E");
        tree.put(25, "F");
        tree.put(12, "J");

        System.out.println("Структура дерева\n" + tree);
    }
}
