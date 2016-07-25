import java.util.HashMap;

/**
 * Created by Leart Doko on 7/25/2016.
 */
public class Problem169 {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> list = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (list.get(nums[i]) == null) {
                list.put(nums[i], 1);
            } else {
                int newSum = list.get(nums[i]) + 1;
                list.put(nums[i], newSum);
            }
            if (list.get(nums[i]) > nums.length / 2) {
                return nums[i];
            }
        }
        return 0;
    }
}
