package org.example;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 5);
        tree.root = tree.insert(tree.root, 15);
        tree.root = tree.insert(tree.root, 8);
        tree.root = tree.insert(tree.root, 7);

        System.out.println("Пример N1");
        tree.root.left.count = 3;
        System.out.println(tree.isBinaryTree(tree.root));

        System.out.println("Пример N2");
        tree.root.left.count = 13;
        System.out.println(tree.isBinaryTree(tree.root));

        tree.printTree(tree.root, "", true);
    }
}