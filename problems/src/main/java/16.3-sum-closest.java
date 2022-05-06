import java.util.Arrays;

/*
 * @lc app=leetcode id=16 lang=java
 *
 * [16] 3Sum Closest
 */

// @lc code=start
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int result = 10001;
        for (int i = 0; i < nums.length-2; i++) {
            for (int left = i+1, right = nums.length-1; left < right;) {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum > target){
                    right--;
                }else if(sum < target){
                    left++;
                }else{
                    return target;
                }
                if(Math.abs(target - sum) < Math.abs(target - result)){
                    result = sum;
                }
            }
            
        }

        return result;
    }
}
// @lc code=end

