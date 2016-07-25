/**
 * Created by Leart Doko on 10/23/2015.
 */
public class Problem226 {
    public TreeNode invertTree(TreeNode root) {
        if (root != null) {

            TreeNode swap = root.left;
            root.left = root.right;
            root.right = swap;

            root.left = invertTree(root.left);
            root.right = invertTree(root.right);
            return root;
        } else {
            return null;
        }
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}

