import java.util.HashSet;

/**
 * Created by Leart Doko on 7/8/2016.
 */
public class Problem260 {
    public int[] singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int val: nums){
            if(set.contains(val)){
                set.remove(val);
            }else{
                set.add(val);
            }
        }

        int[] ret = new int[2];
        int itr = 0;
        for(Integer val: set){
            if(itr < 2){
                ret[itr] = val;
            }
            itr++;
        }
        return ret;
    }
}
