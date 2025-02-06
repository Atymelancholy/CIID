package org.example;

public class BinaryTree {
    Node root;

    public Node insert(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }
        if (value < node.value) {
            node.left = insert(node.left, value);
        } else {
            node.right = insert(node.right, value);
        }
        node.count = 1 + getCount(node.left) + getCount(node.right);
        return node;
    }

    private int getCount(Node node) {
        return (node == null) ? 0 : node.count;
    }

    public boolean isBinaryTree(Node node) {
        if (node == null) {
            return true;
        }
        int expectedCount = 1 + getCount(node.left) + getCount(node.right);
        if (node.count != expectedCount) {
            return false;
        }
        return isBinaryTree(node.left) && isBinaryTree(node.right);
    }

    public void printTree(Node root, String prefix, boolean isLeft) {
        if (root == null) {
            return;
        }
        printTree(root.right, prefix + (isLeft ? "│   " : "    "), false);
        System.out.println(prefix + (isLeft ? "└── " : "┌── ") + root.value);
        printTree(root.left, prefix + (isLeft ? "    " : "│   "), true);
    }
}