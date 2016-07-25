import java.util.HashMap;

/**
 * Created by Leart Doko on 10/24/2015.
 */
public class Problem1 {
        public static int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
            int[] answer = new int[2];
            for(int i = 0; i < nums.length; i++){
                if(data.get(nums[i]) == null){
                    data.put(nums[i], i);
                }
                int difference = target - nums[i];
                if(data.get(difference) != null && data.get(difference) != i){
                    answer[0] = data.get(difference)+1;
                    answer[1] = i+1;
                    return answer;
                }
            }
            return answer;
        }
}
