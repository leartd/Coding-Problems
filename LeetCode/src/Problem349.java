import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Leart Doko on 7/6/2016.
 */
public class Problem349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> result;// = new ArrayList<Integer>();

        if(nums1.length < nums2.length){
            result = search(nums1, nums2);
        } else {
            result = search(nums2, nums1);
        }

        int [] res = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            res[i] = result.get(i);
        }
        return res;
    }

    public ArrayList<Integer> search(int[] nums1, int[] nums2) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i < nums1.length; i++){
            if(i > 0 && nums1[i] == nums1[i-1]){
                continue;
            }
            if(Arrays.binarySearch(nums2, nums1[i]) > -1){
                result.add(nums1[i]);
            }
        }
        return result;
    }
}
