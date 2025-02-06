package org.example;

import java.util.LinkedList;
import java.util.Queue;

class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    public void insert(int key) {
        root = insertRec(root, key);
    }

    private Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }

    public void printLevel(Node node) {
        if (node == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.key + " ");

            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }

    public void printLevel() {
        printLevel(root);
    }
    public void printTree() {
        printTree(root, "", true);
    }

    private void printTree(Node root, String prefix, boolean isLeft) {
        if (root == null) {
            return;
        }

        printTree(root.right, prefix + (isLeft ? "│   " : "    "), false);
        System.out.println(prefix + (isLeft ? "└── " : "┌── ") + root.key);
        printTree(root.left, prefix + (isLeft ? "    " : "│   "), true);
    }
}
