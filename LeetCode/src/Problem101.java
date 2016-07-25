import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Leart Doko on 7/25/2016.
 */
public class Problem101 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        if (root.left == null && root.right == null) {
            return true;
        }

        Queue<TreeNode> leftTree = new LinkedList<TreeNode>();
        Queue<TreeNode> rightTree = new LinkedList<TreeNode>();

        leftTree.add(root);
        rightTree.add(root);
        while (!leftTree.isEmpty() && !rightTree.isEmpty()) {
            TreeNode leftSubtree = leftTree.remove();
            TreeNode rightSubtree = rightTree.remove();
            if (leftSubtree != null && rightSubtree != null) {
                if (leftSubtree.val != rightSubtree.val) {
                    return false;
                }
                leftTree.add(leftSubtree.left);
                leftTree.add(leftSubtree.right);

                rightTree.add(rightSubtree.right);
                rightTree.add(rightSubtree.left);

            } else if (leftSubtree == null && rightSubtree == null) {
                continue;
            } else {
                return false;
            }
        }
        if (leftTree.size() == rightTree.size()) {
            return true;
        } else {
            return false;
        }
    }
}
