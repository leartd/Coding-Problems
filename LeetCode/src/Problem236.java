/**
 * Created by Leart Doko on 7/25/2016.
 */
public class Problem236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }

        if (root.equals(p) || root.equals(q)) {
            // if at least one matched, no need to continue
            // this is the LCA for this root
            return root;
        }

        TreeNode l = lowestCommonAncestor(root.left, p, q);
        TreeNode r = lowestCommonAncestor(root.right, p, q);

        if (l != null && r != null) {
            return root;
        }

        return l != null ? l : r;
    }
}
