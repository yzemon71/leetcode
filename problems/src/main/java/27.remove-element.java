/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        list.removeAll(List.of(val));
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        return list.size();
    }
}
// @lc code=end

