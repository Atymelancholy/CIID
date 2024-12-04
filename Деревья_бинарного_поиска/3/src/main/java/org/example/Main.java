package org.example;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.setRoot(1);
        Node root = tree.getRoot();

        tree.addLeft(root, 2);
        tree.addRight(root, 3);

        tree.addLeft(root.getLeft(), 4);
        tree.addRight(root.getLeft(), 5);

        tree.addLeft(root.getRight(), 6);
        tree.addRight(root.getRight(), 7);

        tree.printLevel();
    }
}
