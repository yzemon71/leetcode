/*
 * @lc app=leetcode id=28 lang=java
 *
 * [28] Implement strStr()
 */

// @lc code=start
class Solution {
    public static int strStr(String haystack, String needle) {
        if(needle.equals(haystack)){
            return 0;
        }
        
        for (int i = 0; i <= haystack.length()-needle.length(); i++) {
            if(needle.equals(haystack.substring(i, i+needle.length()))){
                return i;
            }
        }
        return -1;
        // return haystack.indexOf(needle);
    }
}
// @lc code=end

