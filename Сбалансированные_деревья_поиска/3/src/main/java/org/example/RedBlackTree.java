package org.example;

class RedBlackTree {
    private static final boolean RED = true;
    private static final boolean BLACK = false;

    private static class Node {
        int key;
        boolean color;
        Node left;
        Node right;
        Node parent;

        Node(int key) {
            this.key = key;
            this.color = RED;
        }

        @Override
        public String toString() {
            return (color == RED ? "(R) " : "(B) ") + key;
        }
    }

    private Node root;

    public void insert(int key) {
        Node node = new Node(key);
        root = bstInsert(root, node);
        fixInsert(node);
    }

    public void deleteMin() {
        if (root == null) {
            return;
        }
        Node min = getMin(root);
        deleteNode(min);
    }

    private Node getMin(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    private Node bstInsert(Node root, Node node) {
        if (root == null) {
            return node;
        }

        if (node.key < root.key) {
            root.left = bstInsert(root.left, node);
            root.left.parent = root;
        } else if (node.key > root.key) {
            root.right = bstInsert(root.right, node);
            root.right.parent = root;
        }

        return root;
    }

    private void deleteNode(Node node) {
        if (node.left == null || node.right == null) {
            transplant(node, node.left != null ? node.left : node.right);
        } else {
            Node successor = getMin(node.right);
            if (successor.parent != node) {
                transplant(successor, successor.right);
                successor.right = node.right;
                successor.right.parent = successor;
            }
            transplant(node, successor);
            successor.left = node.left;
            successor.left.parent = successor;
            successor.color = node.color;
        }
    }

    private void transplant(Node u, Node v) {
        if (u.parent == null) {
            root = v;
        } else if (u == u.parent.left) {
            u.parent.left = v;
        } else {
            u.parent.right = v;
        }
        if (v != null) {
            v.parent = u.parent;
        }
    }

    private void fixInsert(Node node) {
        while (node != root && node.parent.color == RED) {
            if (node.parent == node.parent.parent.left) {
                handleLeftCase(node);
            } else {
                handleRightCase(node);
            }
        }
        root.color = BLACK;
    }

    private void handleLeftCase(Node node) {
        Node uncle = node.parent.parent.right;
        if (isRed(uncle)) {
            recolor(node.parent, uncle, node.parent.parent);
        } else {
            if (node == node.parent.right) {
                node = node.parent;
                rotateLeft(node);
            }
            recolorAfterRotation(node.parent, node.parent.parent);
            rotateRight(node.parent.parent);
        }
    }

    private void handleRightCase(Node node) {
        Node uncle = node.parent.parent.left;
        if (isRed(uncle)) {
            recolor(node.parent, uncle, node.parent.parent);
        } else {
            if (node == node.parent.left) {
                node = node.parent;
                rotateRight(node);
            }
            recolorAfterRotation(node.parent, node.parent.parent);
            rotateLeft(node.parent.parent);
        }
    }

    private boolean isRed(Node node) {
        return node != null && node.color == RED;
    }

    private void recolor(Node parent, Node uncle, Node grandparent) {
        parent.color = BLACK;
        uncle.color = BLACK;
        grandparent.color = RED;
    }

    private void recolorAfterRotation(Node parent, Node grandparent) {
        parent.color = BLACK;
        grandparent.color = RED;
    }

    private void rotateLeft(Node node) {
        Node right = node.right;
        node.right = right.left;
        if (right.left != null) {
            right.left.parent = node;
        }
        right.parent = node.parent;
        if (node.parent == null) {
            root = right;
        } else if (node == node.parent.left) {
            node.parent.left = right;
        } else {
            node.parent.right = right;
        }
        right.left = node;
        node.parent = right;
    }

    private void rotateRight(Node node) {
        Node left = node.left;
        node.left = left.right;
        if (left.right != null) {
            left.right.parent = node;
        }
        left.parent = node.parent;
        if (node.parent == null) {
            root = left;
        } else if (node == node.parent.right) {
            node.parent.right = left;
        } else {
            node.parent.left = left;
        }
        left.right = node;
        node.parent = left;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        buildString(root, sb, "", true);
        return sb.toString();
    }

    private void buildString(Node node, StringBuilder sb, String prefix, boolean isTail) {
        if (node != null) {
            sb.append(prefix).append(isTail ? "└── " : "├── ").append(node).append("\n");
            buildString(node.left, sb, prefix + (isTail ? "    " : "│   "), false);
            buildString(node.right, sb, prefix + (isTail ? "    " : "│   "), true);
        }
    }
}