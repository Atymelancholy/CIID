package org.example;

public class Main {

    public static boolean isBinaryTree(Node root){
        if(root == null) {
            return true;
        }
        else {
            int count = countNodes(root);

            return count == root.count && isBinaryTree(root.left) && isBinaryTree(root.right);
        }
    }

    public static int countNodes(Node root){
        if(root == null) {
            return 0;
        }
        else{
            return 1 + countNodes(root.left) + countNodes(root.right);
        }
    }

    public static void main(String[] args) {

        Node root = new Node(10, 5);
        root.left = new Node(5, 3);
        root.right = new Node(15, 1);
        root.left.left = new Node(3, 1);
        root.left.right  = new Node(7, 1);

        System.out.println(isBinaryTree(root)? "Дерево корректно" : "Дерево некорректно");

    }
}
