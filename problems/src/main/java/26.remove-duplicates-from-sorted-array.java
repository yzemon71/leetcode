import java.util.ArrayList;

/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 1;
        int hikaku = nums[0];
        int max = nums[nums.length-1];
        for (int i = 1; i < nums.length; i++) {
            if(hikaku != nums[i]){
                nums[index] = nums[i];
                hikaku = nums[i];
                index++;
            }
            if(max == nums[i]){
                break;
            }
        }
        return index;
    }
}
// @lc code=end

