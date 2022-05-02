import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * @lc app=leetcode id=4 lang=java
 *
 * [4] Median of Two Sorted Arrays
 */

// @lc code=start
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // init
        int[] concate = new int[nums1.length + nums2.length];
        // arrays join
        System.arraycopy(nums1, 0, concate, 0, nums1.length);
        System.arraycopy(nums2, 0, concate, nums1.length, nums2.length);
        // array sorted
        Arrays.sort(concate);
        // median
        int other = concate.length/2;
        if(concate.length % 2 == 0){
            return (concate[other-1] + concate[other]) / 2.0 ;
        } else {
            return (concate[other]);
        } 
    }
}
// @lc code=end

