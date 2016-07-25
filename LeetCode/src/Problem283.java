/**
 * Created by Leart Doko on 10/23/2015.
 */
public class Problem283 {
    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                continue;
            }
            //find next non-zero number
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] != 0) {
                    nums[i] = nums[j];
                    nums[j] = 0;
                    break;
                }
            }
        }
    }
}
