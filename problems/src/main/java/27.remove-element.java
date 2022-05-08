/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        int[] tmp = nums;
        int index = 0;
        int removeCount = 0;
        for (int i : tmp) {
            if(i == val){
                removeCount++;
                continue;
            }
            nums[index] = i;
            index++;
        }
        return nums.length - removeCount;
    }
}
// @lc code=end

