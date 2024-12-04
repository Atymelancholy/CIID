package org.example;

import java.util.LinkedList;
import java.util.Queue;

class BinaryTree {
    private Node root;

    public void setRoot(int key) {
        root = new Node(key);
    }

    public Node getRoot() {
        return root;
    }

    public void addLeft(Node parent, int key) {
        if (parent != null) {
            parent.setLeft(new Node(key));
        }
    }

    public void addRight(Node parent, int key) {
        if (parent != null) {
            parent.setRight(new Node(key));
        }
    }

    public void printLevel() {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();
            System.out.print(currentNode.getKey() + " ");

            if (currentNode.getLeft() != null) {
                queue.add(currentNode.getLeft());
            }
            if (currentNode.getRight() != null) {
                queue.add(currentNode.getRight());
            }
        }
        System.out.println();
    }
}
