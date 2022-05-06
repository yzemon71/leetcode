import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * @lc app=leetcode id=18 lang=java
 *
 * [18] 4Sum
 */

// @lc code=start
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> r = new HashSet<>();
        if(nums.length < 4){
            return new ArrayList<>(r);
        }

        Arrays.sort(nums);

        for (int k = 0; k < nums.length-3; k++) {
            int tmpTarget = target - nums[k];
            for (int i = k+1; i < nums.length-2; i++) {
                for (int left = i+1, right = nums.length-1; left < right;) {
                    int sum = nums[i] + nums[left] + nums[right];
                    if(sum > tmpTarget){
                        right--;
                    }else if(sum < tmpTarget){
                        left++;
                    }else{
                        r.add(List.of(nums[k], nums[i], nums[left], nums[right]));
                        left++;
                    }
                }
            }            
        }


        return new ArrayList<>(r);
    }
}
// @lc code=end

