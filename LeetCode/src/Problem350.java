import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Leart Doko on 7/6/2016.
 */
public class Problem350 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> result;// = new ArrayList<Integer>();

        if (nums1.length < nums2.length) {
            result = search(nums1, nums2);
        } else {
            result = search(nums2, nums1);
        }

        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }
        return res;
    }

    public static ArrayList<Integer> search(int[] nums1, int[] nums2) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < nums1.length; i++) {
            if(i > 0 && nums1[i] == nums1[i-1]){
                continue;
            }
            int searchIndex = Arrays.binarySearch(nums2, nums1[i]);
            //find if searchIndex is the lowest index of that number in Nums2
//            while(searchIndex > 0)
            if (searchIndex > -1) {
                while (searchIndex > 0 && nums2[searchIndex] == nums2[searchIndex - 1]) {
                    searchIndex--;
                }
                boolean last = false;
                do{
                    result.add(nums1[i]);
                    if(i+1 <nums1.length && searchIndex+1 < nums2.length && nums1[i+1] == nums2[searchIndex+1]){
                        i++;
                        searchIndex++;
                    }else{
                        last = true;
                    }

                }while(last == false);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2};
        int b[] = {1, 1};
        System.out.println(Arrays.toString(intersect(a, b)));
    }
}
