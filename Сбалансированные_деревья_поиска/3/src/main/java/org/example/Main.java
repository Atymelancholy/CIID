package org.example;

public class Main {
    public static void main(String[] args) {
        RedBlackTree tree = new RedBlackTree();

        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        System.out.println("Дерево после вставок:");
        System.out.println(tree);

        tree.insert(5);
        System.out.println("Дерево после вставки:");
        System.out.println(tree);

        tree.deleteMin();
        System.out.println("Дерево после удаления:");
        System.out.println(tree);
    }
}
