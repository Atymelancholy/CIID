package org.example;

import java.util.ArrayList;
import java.util.List;

public class Result {
    int internalPath = 0;
    int externalPath = 0;
    int totalNodes = 0;

    public static Result calculatePaths(TreeNode root) {
        Result result = new Result();
        if (root == null) {
            return result;
        }

        List<TreeNode> nodes = new ArrayList<>();
        List<Integer> depths = new ArrayList<>();
        nodes.add(root);
        depths.add(0);

        int sumDepthsRightChildren = 0;
        int sumDepthsLeftChildren = 0;

        while (!nodes.isEmpty()) {
            TreeNode node = nodes.removeFirst();
            int depth = depths.removeFirst();

            result.totalNodes++;
            processNode(result, node, depth);

            if (node.right != null) {
                addChild(nodes, depths, node.right, depth);
                sumDepthsRightChildren += depth + 1;
            }

            if (node.left != null) {
                addChild(nodes, depths, node.left, depth);
                sumDepthsLeftChildren += depth + 1;
            }
        }

        result.internalPath = sumDepthsRightChildren + sumDepthsLeftChildren;
        return result;
    }

    private static void addChild(List<TreeNode> nodes, List<Integer> depths, TreeNode child, int depth) {
        nodes.add(child);
        depths.add(depth + 1);
    }

    private static void processNode(Result result, TreeNode node, int depth) {
        if (node.left == null && node.right == null) {
            result.externalPath += (depth + 1) * 2;
        } else if (node.left == null || node.right == null) {
            result.externalPath += (depth + 1);
        } else {
            result.internalPath += depth;
        }
    }
}
