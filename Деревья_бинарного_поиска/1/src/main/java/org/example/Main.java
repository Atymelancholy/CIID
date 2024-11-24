package org.example;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Main {
    static Logger logger = Logger.getLogger(Main.class.getName());

    static class Result {
        int internalPath = 0;
        int externalPath = 0;
    }

    public static Result calculatePaths(TreeNode node, int depth) {
        Result result = new Result();

        if (node == null) {
            result.externalPath = depth;
            return result;
        }

        Result left = calculatePaths(node.left, depth + 1);
        Result right = calculatePaths(node.right, depth + 1);

        result.internalPath = left.internalPath + right.internalPath + depth;
        result.externalPath = left.externalPath + right.externalPath;

        return result;
    }

    public static void main(String[] args) {
        TreeNode tree = new TreeNode(
                new TreeNode(
                        new TreeNode(null, null),
                        null
                ),
                new TreeNode(
                        null,
                        new TreeNode(null, null)
                )
        );

        Result result = calculatePaths(tree, 0);

        int i = result.internalPath;
        int e = result.externalPath;
        int n = 5;

        logger.log(Level.INFO,"Internal Path Length (I): {0}", new Object[]{i});
        logger.log(Level.INFO,"External Path Length (E): {}", new Object[]{e});
        logger.log(Level.INFO,"E - I: {}", new Object[]{(e - i)});
        logger.log(Level.INFO,"Expected Difference: 2N = {}", new Object[]{(2 * n)});
    }
}
