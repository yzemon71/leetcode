import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> r = new HashSet<>();
        if(nums.length == 0){
            return new ArrayList<>(r);
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length-2; i++) {
            if(nums[i] > 0){
                break;
            }
            if(i != 0 && nums[i] == nums[i-1]){
                continue;
            }
            int target = nums[i] * -1;
            for (int left = i+1, right = nums.length-1; left < right;) {
                int sum = nums[left] + nums[right];
                if(sum > target){
                    right--;
                }else if(sum < target){
                    left++;
                }else{
                    r.add(List.of(nums[i], nums[left], nums[right]));
                    left++;
                    while(left < right && nums[left] == nums[left-1]){
                        left++;
                    }
                }
            }
        }

        return new ArrayList<>(r);
    }
}
// @lc code=end

