package org.example;

public class RedBlackBST<Key extends Comparable<Key>, Value> {
    private class Node {
        Key key;
        Value value;
        Node left, right;

        public Node(Key key, Value value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Key: " + key + ", Value: " + value;
        }
    }

    private Node root;

    private boolean isRed(Node x) {
        if (x == null || x.left == null || x.right == null) return false;
        return x.left.key.compareTo(x.right.key) > 0;
    }

    private void makeRed(Node x) {
        if (x == null || x.left == null || x.right == null) return;
        Node temp = x.left;
        x.left = x.right;
        x.right = temp;
    }

    private void makeBlack(Node x) {
        if (x == null || x.left == null || x.right == null) return;
        if (x.left.key.compareTo(x.right.key) > 0) {
            Node temp = x.left;
            x.left = x.right;
            x.right = temp;
        }
    }

    private Node rotateLeft(Node h) {
        Node x = h.right;
        h.right = x.left;
        x.left = h;
        makeRed(x);
        makeBlack(h);
        return x;
    }

    private Node rotateRight(Node h) {
        Node x = h.left;
        h.left = x.right;
        x.right = h;
        makeRed(x);
        makeBlack(h);
        return x;
    }

    private Node balance(Node h) {
        if (isRed(h.right)) h = rotateLeft(h);
        if (isRed(h.left) && isRed(h.left.left)) h = rotateRight(h);
        if (isRed(h.left) && isRed(h.right)) {
            makeRed(h);
            makeBlack(h.left);
            makeBlack(h.right);
        }
        return h;
    }

    public void put(Key key, Value value) {
        root = put(root, key, value);
        makeBlack(root);
    }

    private Node put(Node h, Key key, Value value) {
        if (h == null) return new Node(key, value);

        int cmp = key.compareTo(h.key);
        if (cmp < 0) h.left = put(h.left, key, value);
        else if (cmp > 0) h.right = put(h.right, key, value);
        else h.value = value;

        return balance(h);
    }

    public boolean isRedBlackTree() {
        return isRedBlackTree(root);
    }

    private boolean isRedBlackTree(Node x) {
        if (x == null) return true;
        if (isRed(x) && (isRed(x.left) || isRed(x.right))) return false;
        return isRedBlackTree(x.left) && isRedBlackTree(x.right);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        buildString(root, sb, "", true);
        return sb.toString();
    }

    private void buildString(Node node, StringBuilder sb, String prefix, boolean isTail) {
        if (node != null) {
            sb.append(prefix).append(isTail ? "└── " : "├── ").append(node.key).append("\n");
            buildString(node.left, sb, prefix + (isTail ? "    " : "│   "), false);
            buildString(node.right, sb, prefix + (isTail ? "    " : "│   "), true);
        }
    }
}

