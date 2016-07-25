/**
 * Created by Leart Doko on 10/23/2015.
 */
public class Problem100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q != null || p != null && q == null) {
            return false;
        }
        if (p == null && q == null) {
            return true;
        }

        if (p.val != q.val) {
            return false;
        } else {
            if (p.left == null && q.left != null || p.left != null && q.left == null) {
                return false;
            }

            if (p.right == null && q.right != null || p.right != null && q.right == null) {
                return false;
            }

            boolean leftBranches = isSameTree(p.left, q.left);
            boolean rightBranches = isSameTree(p.right, q.right);
            if (leftBranches == false || rightBranches == false)
                return false;
        }

        return true;
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
