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

    private void swapIfNeeded(Node h) {
        if (h != null && h.left != null && h.key.compareTo(h.left.key) < 0) {
            K tempKey = h.key;
            h.key = h.left.key;
            h.left.key = tempKey;

            V tempValue = h.value;
            h.value = h.left.value;
            h.left.value = tempValue;
        }
    }

    private Node balance(Node h) {
        swapIfNeeded(h);

        if (h.left != null && h.key.compareTo(h.left.key) < 0) {
            h = rotateRight(h);
        }

        if (h.right != null && h.key.compareTo(h.right.key) > 0) {
            h = rotateLeft(h);
        }

        return h;
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

    public void put(K key, V value) {
        root = put(root, key, value);
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
