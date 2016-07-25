/**
 * Created by Leart Doko on 7/18/2016.
 */
public class Problem213 {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }

        if (nums.length == 2) {
            return nums[0] > nums[1] ? nums[0] : nums[1];
        }

        int[] memoFirst = new int[nums.length];
        int[] memoNoFirst = new int[nums.length];

        memoFirst[0] = nums[0];
        memoFirst[1] = nums[0];
        memoNoFirst[1] = nums[1];

        for (int i = 2; i < nums.length; i++) {
            if (i != nums.length - 1) {
                memoFirst[i] = memoFirst[i - 2] + nums[i] > memoFirst[i - 1] ?
                        memoFirst[i - 2] + nums[i] : memoFirst[i - 1];
            } else {
                memoFirst[nums.length - 1] = memoFirst[nums.length - 2] > memoFirst[nums.length - 1] ?
                        memoFirst[nums.length - 2] : memoFirst[nums.length - 1];
            }
            memoNoFirst[i] = memoNoFirst[i - 2] + nums[i] > memoNoFirst[i - 1] ?
                    memoNoFirst[i - 2] + nums[i] : memoNoFirst[i - 1];
        }

        return memoFirst[nums.length - 1] > memoNoFirst[nums.length - 1] ?
                memoFirst[nums.length - 1] : memoNoFirst[nums.length - 1];
    }
}
