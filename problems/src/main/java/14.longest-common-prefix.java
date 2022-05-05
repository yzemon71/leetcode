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
            int len = result.length();
            StringBuilder sb = new StringBuilder();
            if(result.length() > s.length()){
                len = s.length();
            }
            for (int i = 0; i < len; i++) {
                if(result.charAt(i) == s.charAt(i)){
                    sb.append(result.charAt(i));
                }else{
                    break;
                }
            }
            if(sb.length() == 0){
                return "";
            }else{
                result = sb.toString();
            }
        }

        return result;
    }
}
// @lc code=end

