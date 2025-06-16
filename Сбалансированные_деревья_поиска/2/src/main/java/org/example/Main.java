package org.example;

public class Main {
    public static void main(String[] args) {
        RedBlackBST<Integer, String> tree = new RedBlackBST<>();

        tree.put(10, "A");
        tree.put(15, "B");
        tree.put(20, "C");

        System.out.println("Структура дерева\n" + tree);
    }
}
