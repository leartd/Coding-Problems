/**
 * Created by Leart Doko on 10/23/2015.
 */
public class Problem26 {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) return nums.length;
        int count = 1;
        int firstMistake = -1;
        int firstCorrect = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[firstCorrect]) {
                if (firstMistake == -1) {
                    firstMistake = i;
                }
            } else {
                if (firstMistake == -1) {
                    firstCorrect = i;
                } else {
                    nums[firstMistake] = nums[i];
                    firstCorrect = firstMistake;
                    firstMistake++;
                }
                count++;
            }
        }
        return count;
    }
}
