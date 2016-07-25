/**
 * Created by Leart Doko on 11/5/2015.
 */
public class Problem27 {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0){
            return 0;
        }

        int backList = nums.length-1;
        int length = nums.length;
        for(int i = 0; i < nums.length; i++){
            while(nums[i] == val && backList >= 0 && backList >= i){
                nums[i] = nums[backList];
                nums[backList] = val;
                backList--;
                length--;
            }
        }

        return length;
    }
}
