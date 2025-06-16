package org.example;

public class RedBlackBST<K extends Comparable<K>, V> {

    private class Node {
        K key;
        V value;
        Node left;
        Node right;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private Node root;

    private boolean isRed(Node h) {
        if (h == null) return false;
        if (h.left == null || h.right == null) return false;
        return h.left.key.compareTo(h.right.key) > 0;
    }

    private Node rotateLeft(Node h) {
        Node x = h.right;
        h.right = x.left;
        x.left = h;
        return x;
    }

    private Node rotateRight(Node h) {
        Node x = h.left;
        h.left = x.right;
        x.right = h;
        return x;
    }

    private Node flipColors(Node h) {
        if (h.left != null && h.right != null) {
            Node temp = h.left;
            h.left = h.right;
            h.right = temp;
        }
        return h;
    }

    private int height(Node h) {
        if (h == null) return 0;
        return 1 + Math.max(height(h.left), height(h.right));
    }

    private boolean isBalanced(Node h) {
        if (h == null) return true;
        int leftHeight = height(h.left);
        int rightHeight = height(h.right);
        return Math.abs(leftHeight - rightHeight) <= 1
                && isBalanced(h.left)
                && isBalanced(h.right);
    }

    private Node balance(Node h) {
        if (h == null) return null;

        if (isRed(h.right) && !isRed(h.left)) {
            h = rotateLeft(h);
        }
        if (isRed(h.left) && isRed(h.left.left)) {
            h = rotateRight(h);
        }
        if (isRed(h.left) && isRed(h.right)) {
            h = flipColors(h);
        }

        if (!isBalanced(h)) {
            int leftHeight = height(h.left);
            int rightHeight = height(h.right);

            if (leftHeight > rightHeight + 1) {
                h = rotateRight(h);
            } else if (rightHeight > leftHeight + 1) {
                h = rotateLeft(h);
            }

            if (!isBalanced(h)) {
                if (isBalanced(h.left)) {
                    h = rotateRight(h);
                } else if (isBalanced(h.right)) {
                    h = rotateLeft(h);
                }
            }
        }
        return h;
    }

    public void put(K key, V value) {
        root = put(root, key, value);
        if (isRed(root)) {
            root = flipColors(root);
        }
    }

    private Node put(Node h, K key, V value) {
        if (h == null) return new Node(key, value);

        int cmp = key.compareTo(h.key);
        if (cmp < 0) {
            h.left = put(h.left, key, value);
        } else if (cmp > 0) {
            h.right = put(h.right, key, value);
        } else {
            h.value = value;
        }

        return balance(h);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        buildString(root, sb, "", false);
        return sb.toString();
    }

    private void buildString(Node node, StringBuilder sb, String prefix, boolean isLeft) {
        if (node == null) return;
        buildString(node.right, sb, prefix + (isLeft ? "│   " : "    "), false);
        sb.append(prefix).append(isLeft ? "└── " : "┌── ").append(node.key).append("\n");
        buildString(node.left, sb, prefix + (isLeft ? "    " : "│   "), true);
    }
}
