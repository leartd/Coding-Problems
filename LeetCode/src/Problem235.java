/**
 * Created by Leart Doko on 10/23/2015.
 */
public class Problem235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root != null && p != null && q != null) {
            if (root == p || root == q) {
                return root;
            }
            boolean found = false;
            while (!found) {
                if (root == p) {
                    found = true;
                    break;
                }
                if (root == q) {
                    found = true;
                    break;
                }
                if (p.val <= root.val && q.val <= root.val) {
                    root = root.left;
                } else if (p.val > root.val && q.val > root.val) {
                    root = root.right;
                } else {
                    found = true;
                }
            }
            return root;
        } else {
            return null;
        }
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
