import javax.swing.tree.TreeNode;

/**
 * Created by Leart Doko on 10/23/2015.
 * Maximum Depth of a Binary Tree
 */
public class Problem104 {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;

        return Math.max(maxBranch(root.left), maxBranch(root.right)) + 1;
    }

    public int maxBranch(TreeNode root) {
        if (root == null) return 0;
        int depth = 1;
        if (root.left == null && root.right == null) {
            return depth;
        } else {
            depth += Math.max(maxBranch(root.left), maxBranch(root.right));
        }
        return depth;
    }

    /**
     * Definition for a binary tree node.
     */
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
