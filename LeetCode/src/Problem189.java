import java.util.Arrays;

/**
 * Created by Leart Doko on 11/9/2015.
 */
public class Problem189 {
    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverseSection(nums, nums.length - k, nums.length);
        reverseSection(nums, 0, nums.length - k);
        reverseSection(nums, 0, nums.length);
    }

    public static void reverseSection(int[]nums, int start, int finish){
        for(int i = 0; i < (finish-start)/2; i++){
            int temp = nums[i+start];
            nums[i+start] = nums[finish-i-1];
            nums[finish-i-1] = temp;
        }
    }

    public static void main(String [] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7 };
        rotate(arr, 2);
        System.out.println(Arrays.toString(arr));
    }
}
