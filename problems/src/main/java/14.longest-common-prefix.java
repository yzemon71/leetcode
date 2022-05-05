/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1){
            return strs[0];
        }

        String result = strs[0];
        for (String s : strs) {
            while(s.indexOf(result) != 0){
                result = result.substring(0, result.length()-1);
                if(result.isEmpty()){
                    return "";
                }
            }
        }

        return result;
    }
}
// @lc code=end

