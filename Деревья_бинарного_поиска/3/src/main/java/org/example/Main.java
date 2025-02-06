package org.example;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(10);
        tree.insert(6);
        tree.insert(15);
        tree.insert(9);
        tree.insert(8);
        tree.insert(20);

        System.out.println("Обход дерева по уровням:");
        tree.printLevel();
        System.out.println("\nСхематическое изображение дерева:");
        tree.printTree();
    }
}