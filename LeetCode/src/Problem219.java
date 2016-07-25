import java.util.HashMap;

/**
 * Created by Leart Doko on 10/23/2015.
 */
public class Problem219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (memo.get(nums[i]) == null) {
                memo.put(nums[i], i);
            } else {
                if (i - memo.get(nums[i]) <= k) {
                    return true;
                } else {
                    memo.put(nums[i], i);
                }
            }
        }
        return false;
    }
}
