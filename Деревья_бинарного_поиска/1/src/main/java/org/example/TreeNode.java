package org.example;

public class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int value) {
        this.value = value;
        left = right = null;
    }

    public void insert(int value) {
        TreeNode current = this;
        boolean inserted = false;

        while (!inserted) {
            if (value < current.value) {
                if (current.left == null) {
                    current.left = new TreeNode(value);
                    inserted = true;
                } else {
                    current = current.left;
                }
            } else {
                if (current.right == null) {
                    current.right = new TreeNode(value);
                    inserted = true;
                } else {
                    current = current.right;
                }
            }
        }
    }

    public void printTree() {
        printTree(this, "", true);
    }

    private void printTree(TreeNode node, String prefix, boolean isLeft) {
        if (node == null) return;

        printTree(node.right, prefix + (isLeft ? "│   " : "    "), false);
        System.out.println(prefix + (isLeft ? "└── " : "┌── ") + node.value);
        printTree(node.left, prefix + (isLeft ? "    " : "│   "), true);
    }
}