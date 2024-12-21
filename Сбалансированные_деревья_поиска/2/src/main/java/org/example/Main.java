package org.example;

public class Main {
    public static void main(String[] args) {
        RedBlackBST<Integer, String> tree = new RedBlackBST<>();

        tree.put(10, "A");
        tree.put(20, "B");
        tree.put(15, "C");
        tree.put(5, "D");
        tree.put(1, "E");

        System.out.println("Это черно-красное: " + tree.isRedBlackTree());
        System.out.println("Структура дерева\n" + tree);
    }
}
