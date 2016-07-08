/**
 * Created by Leart Doko on 7/8/2016.
 */
public class Problem112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        sum = sum - root.val;
        if (sum == 0 && root.left == null && root.right == null) return true;

        boolean left = hasPathSum(root.left, sum);
        boolean right = hasPathSum(root.right, sum);
        if (left || right) return true;

        return false;
    }
}
