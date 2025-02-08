package org.example;

import static org.example.Result.calculatePaths;

public class Main {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(7);
        tree.insert(19);
        tree.insert(11);
        tree.insert(18);

        Result result = calculatePaths(tree);
        int i = result.internalPath;
        int e = result.externalPath;
        int n = result.totalNodes;

        System.out.println("Длина внутреннего пути (I): " + i);
        System.out.println("Длина внешнего пути (E): " + e);
        System.out.println("E - I: " + (e - i));
        System.out.println("Ожидаемая разница: 2N = " + (2 * n));

        System.out.println("\nВывод бинарного дерева:");
        tree.printTree();
    }
}
