package org.example;

class RedBlackTree {

    private static final boolean RED = true;
    private static final boolean BLACK = false;

    private class Node {
        String key;
        Node left;
        Node right;
        Node parent;
        boolean color;

        Node(String key) {
            this.key = key;
            this.color = RED;
        }

        @Override
        public String toString() {
            return key + (color == RED ? "(R)" : "(B)");
        }
    }

    private Node root;

    private void rotateLeft(Node node) {
        Node rightChild = node.right;
        node.right = rightChild.left;
        if (rightChild.left != null) {
            rightChild.left.parent = node;
        }
        rightChild.parent = node.parent;
        if (node.parent == null) {
            root = rightChild;
        } else if (node == node.parent.left) {
            node.parent.left = rightChild;
        } else {
            node.parent.right = rightChild;
        }
        rightChild.left = node;
        node.parent = rightChild;
    }

    private void rotateRight(Node node) {
        Node leftChild = node.left;
        node.left = leftChild.right;
        if (leftChild.right != null) {
            leftChild.right.parent = node;
        }
        leftChild.parent = node.parent;
        if (node.parent == null) {
            root = leftChild;
        } else if (node == node.parent.left) {
            node.parent.left = leftChild;
        } else {
            node.parent.right = leftChild;
        }
        leftChild.right = node;
        node.parent = leftChild;
    }

    private void fixAfterInsertion(Node node) {
        while (node != root && isRed(node.parent)) {
            boolean isLeftChild = (node.parent == node.parent.parent.left);
            Node uncle = isLeftChild ? node.parent.parent.right : node.parent.parent.left;

            if (isRed(uncle)) {
                node = handleRedUncle(node, uncle);
            } else {
                node = rotateAndRecolor(node, isLeftChild);
            }
        }
        root.color = BLACK;
    }

    private boolean isRed(Node node) {
        return node != null && node.color == RED;
    }

    private Node handleRedUncle(Node node, Node uncle) {
        node.parent.color = BLACK;
        uncle.color = BLACK;
        node.parent.parent.color = RED;
        return node.parent.parent;
    }

    private Node rotateAndRecolor(Node node, boolean isLeftChild) {
        if ((isLeftChild && node == node.parent.right) || (!isLeftChild && node == node.parent.left)) {
            node = node.parent;
            if (isLeftChild) {
                rotateLeft(node);
            } else {
                rotateRight(node);
            }
        }
        node.parent.color = BLACK;
        node.parent.parent.color = RED;
        if (isLeftChild) {
            rotateRight(node.parent.parent);
        } else {
            rotateLeft(node.parent.parent);
        }
        return node;
    }


    public void insert(String key) {
        Node newNode = new Node(key);
        if (root == null) {
            root = newNode;
            root.color = BLACK;
            return;
        }

        Node current = root;
        Node parent = null;
        while (current != null) {
            parent = current;
            if (key.compareTo(current.key) < 0) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        newNode.parent = parent;
        if (key.compareTo(parent.key) < 0) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }

        fixAfterInsertion(newNode);
    }

    public void inOrder() {
        inOrder(root);
        System.out.println();
    }

    private void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node + " ");
            inOrder(node.right);
        }
    }

    public void printTree() {
        printTree(root, "", true);
    }

    private void printTree(Node node, String prefix, boolean isTail) {
        if (node != null) {
            System.out.println(prefix + (isTail ? "└── " : "├── ") + node);
            printTree(node.left, prefix + (isTail ? "    " : "│   "), false);
            printTree(node.right, prefix + (isTail ? "    " : "│   "), true);
        }
    }
}