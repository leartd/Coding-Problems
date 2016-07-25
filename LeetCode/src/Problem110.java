/**
 * Created by Leart Doko on 7/25/2016.
 */
public class Problem110 {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        int result = maxDepth(root);
        if (result == -1) {
            return false;
        }
        return true;
    }


    public int maxDepth(TreeNode root) {
        int depth = 0;
        if (root != null) {
            depth++;

            int leftTree = 0;
            int rightTree = 0;

            leftTree = maxDepth(root.left);
            rightTree = maxDepth(root.right);

            if (Math.abs(leftTree - rightTree) > 1 || leftTree == -1 || rightTree == -1) {
                return -1;
            } else {
                depth += leftTree >= rightTree ? leftTree : rightTree;
            }
        }
        return depth;
    }
}
