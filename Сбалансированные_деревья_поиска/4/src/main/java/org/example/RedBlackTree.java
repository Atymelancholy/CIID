package org.example;

class RedBlackTree {
    private static final boolean RED = true;
    private static final boolean BLACK = false;

    private static class Node {
        int key;
        Node left, right, parent;
        boolean color;

        Node(int key) {
            this.key = key;
            this.color = RED;
        }
    }

    private Node root;

    public void insert(int key) {
        Node newNode = new Node(key);
        if (root == null) {
            root = newNode;
            root.color = BLACK;
            return;
        }

        Node parent = null;
        Node current = root;

        while (current != null) {
            parent = current;
            if (key < current.key) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        if (key < parent.key) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }

        newNode.parent = parent;
        fixInsert(newNode);
    }

    private void fixInsert(Node node) {
        while (node != root && node.parent.color == RED) {
            if (node.parent == node.parent.parent.left) {
                Node uncle = node.parent.parent.right;
                if (uncle != null && uncle.color == RED) {
                    node.parent.color = BLACK;
                    uncle.color = BLACK;
                    node.parent.parent.color = RED;
                    node = node.parent.parent;
                } else {
                    if (node == node.parent.right) {
                        node = node.parent;
                        rotateLeft(node);
                    }
                    node.parent.color = BLACK;
                    node.parent.parent.color = RED;
                    rotateRight(node.parent.parent);
                }
            } else {
                Node uncle = node.parent.parent.left;
                if (uncle != null && uncle.color == RED) {
                    node.parent.color = BLACK;
                    uncle.color = BLACK;
                    node.parent.parent.color = RED;
                    node = node.parent.parent;
                } else {
                    if (node == node.parent.left) {
                        node = node.parent;
                        rotateRight(node);
                    }
                    node.parent.color = BLACK;
                    node.parent.parent.color = RED;
                    rotateLeft(node.parent.parent);
                }
            }
        }
        root.color = BLACK;
    }

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
        } else if (node == node.parent.right) {
            node.parent.right = leftChild;
        } else {
            node.parent.left = leftChild;
        }
        leftChild.right = node;
        node.parent = leftChild;
    }

    public int countRedNodes() {
        return countRedNodes(root);
    }

    private int countRedNodes(Node node) {
        if (node == null) {
            return 0;
        }
        int count = (node.color == RED) ? 1 : 0;
        count += countRedNodes(node.left);
        count += countRedNodes(node.right);
        return count;
    }

    public void printTree() {
        printTree(root, "", true);
    }

    private void printTree(Node node, String indent, boolean isRight) {
        if (node == null) {
            return;
        }

        System.out.println(indent + (isRight ? "└── " : "├── ") + (node.color == RED ? "R" : "B") + ":" + node.key);
        printTree(node.left, indent + (isRight ? "    " : "│   "), false);
        printTree(node.right, indent + (isRight ? "    " : "│   "), true);
    }
}
