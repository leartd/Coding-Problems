import java.util.HashMap;

/**
 * Created by Leart Doko on 7/25/2016.
 */
public class Problem136 {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> list = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(list.get(nums[i]) == null){
                list.put(nums[i], 1);
            }
            else{
                list.put(nums[i], list.get(nums[i])+1);
            }
        }

        for(Integer key : list.keySet()){
            if(list.get(key) == 1){
                return key;
            }
        }
        return 0;
    }
}
