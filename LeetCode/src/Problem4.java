/**
 * Created by Leart Doko on 7/8/2016.
 */
public class Problem4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums1Length = nums1.length;
        int nums2Length = nums2.length;

        double median1 = 0;
        if(nums1Length != 0){
            if(nums1Length%2 == 1){
                median1 = nums1[nums1Length/2];
            } else {
                double a = nums1[nums1Length/2];
                double b = nums1[(nums1Length-1)/2];
                median1 = (a + b)/2;
            }
        }

        double median2 = 0;
        if(nums2Length != 0){
            if(nums2Length%2 == 1){
                median2 = nums2[nums2Length/2];
            } else {
                double a = nums2[nums2Length/2];
                double b = nums2[(nums2Length-1)/2];
                median2 = (a + b)/2;
            }
        }

        return (median1+median2)/2;
    }

    public static void main (String[] args){
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
