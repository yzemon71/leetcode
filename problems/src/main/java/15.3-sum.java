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

        for (int i = 0; i < nums.length; i++) {
            int comp;
            Map<Integer, Integer> mp = new HashMap<>();
            for (int j = i+1; j < nums.length; j++) {
                comp = (nums[i] + nums[j]) * -1;
                if(mp.containsKey(comp)){
                    List<Integer> tmp = new ArrayList<>();
                    tmp.add(nums[i]);
                    tmp.add(nums[mp.get(comp)]);
                    tmp.add(nums[j]);
                    Collections.sort(tmp);
                    r.add(tmp);
                }
                mp.put(nums[j], j);
            }
        }
        
        return new ArrayList<>(r);
    }
}
// @lc code=end

