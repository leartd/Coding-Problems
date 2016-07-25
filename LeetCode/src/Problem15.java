import java.util.*;

/**
 * Created by Leart Doko on 10/25/2015.
 */
public class Problem15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> setOfAnswers = new HashSet<List<Integer>>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || nums[i] > nums[i - 1] || nums[i] < 0) {
                int start = i + 1;
                int end = nums.length - 1;

                while (start < end) {
                    if (nums[i] + nums[start] + nums[end] == 0) {
                        ArrayList<Integer> answer = new ArrayList<Integer>();
                        answer.add(nums[i]);
                        answer.add(nums[start]);
                        answer.add(nums[end]);
                        Collections.sort(answer);
                        setOfAnswers.add(answer);
                        end--;
                        start++;
                        while (start < end && nums[end] == nums[end + 1]) {
                            end--;
                        }
                        while (start < end && nums[start] == nums[start - 1]) {
                            start++;
                        }
                    } else if (nums[i] + nums[start] + nums[end] < 0) {
                        start++;
                    } else {
                        end--;
                    }
                }
            }
        }
        return new ArrayList<List<Integer>>(setOfAnswers);
    }
}
