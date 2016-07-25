import java.util.*;

/**
 * Created by Leart Doko on 7/25/2016.
 */
public class Problem107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> mainList = new ArrayList<List<Integer>>();
        if (root == null) {
            return mainList;
        }
        int currentRow = 1;
        int nextRow = 0;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        ArrayList<Integer> temp = new ArrayList<Integer>();
        while (!queue.isEmpty()) {
            TreeNode tempNode = queue.remove();
            temp.add(tempNode.val);

            if (tempNode.left != null) {
                queue.add(tempNode.left);
                nextRow++;
            }
            if (tempNode.right != null) {
                queue.add(tempNode.right);
                nextRow++;
            }

            currentRow--;
            if (currentRow == 0) {
                currentRow = nextRow;
                nextRow = 0;
                mainList.add(temp);
                temp = new ArrayList<Integer>();
            }

        }

        Collections.reverse(mainList);
        return mainList;
    }
}
