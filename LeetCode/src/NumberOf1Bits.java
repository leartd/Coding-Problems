import java.util.*;

/**
 * Created by Leart Doko on 10/23/2015.
 */
public class NumberOf1Bits {
    // you need to treat n as an unsigned value
    public static int hammingWeight(long n) {
        List<List<Integer>> mainList = new ArrayList<List<Integer>>();
        int count = 0;
        for(int i = 0; i < 32 && n != 0; i++){
            if((n&1) == 1){
                System.out.print(1);
                count++;
            }else{
                System.out.print(0);
            }
            n = n >>> 1;
        }
        System.out.println();
        return count;
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
