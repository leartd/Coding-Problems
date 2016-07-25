/**
 * Created by Leart Doko on 7/18/2016.
 */
public class Problem198 {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }

        int[] memo = new int[nums.length];
        memo[0] = nums[0];
        memo[1] = nums[0] > nums[1] ? nums[0] : nums[1];

        for (int i = 2; i < nums.length; i++) {
            memo[i] = memo[i - 2] + nums[i] > memo[i - 1] ? memo[i - 2] + nums[i] : memo[i - 1];
        }

        return memo[nums.length - 1];
    }
}
