package org.example;

class Node {
    int key;
    Node left;
    Node right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}