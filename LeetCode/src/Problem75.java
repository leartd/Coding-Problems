/**
 * Created by Leart Doko on 7/25/2016.
 */
public class Problem75 {
    public void sortColors(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int j = i - 1;
            int temp = nums[i];
            while (j >= 0 && temp < nums[j]) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = temp;
        }
    }
}
