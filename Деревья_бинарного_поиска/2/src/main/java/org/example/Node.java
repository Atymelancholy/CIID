package org.example;

class Node {
    int value;
    Node left;
    Node right;
    int count;

    public Node(int value) {
        this.value = value;
        this.left = this.right = null;
        this.count = 1;
    }
}