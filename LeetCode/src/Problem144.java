import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Leart Doko on 10/23/2015.
 */
public class Problem144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> results = new ArrayList<Integer>();

        Stack<TreeNode> tree = new Stack<TreeNode>();
        if (root != null) {
            tree.push(root);
        } else {
            return results;
        }

        while (!tree.isEmpty()) {
            TreeNode cur = tree.pop();
            results.add(cur.val);

            if (cur.right != null) {
                tree.push(cur.right);
            }

            if (cur.left != null) {
                tree.push(cur.left);
            }
        }

        return results;
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
