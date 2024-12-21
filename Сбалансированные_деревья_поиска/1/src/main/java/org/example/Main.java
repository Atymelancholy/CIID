package org.example;

public class Main {
    public static void main(String[] args) {
        RedBlackTree tree = new RedBlackTree();
        String[] keys = {"E", "A", "S", "Y", "Q", "U", "T", "I", "O", "N"};

        for (String key : keys) {
            tree.insert(key);
        }
        
        tree.inOrder();

        System.out.println("\nСтруктура дерева:");
        tree.printTree();
    }
}
