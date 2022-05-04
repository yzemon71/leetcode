/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        if(0 <= x && x <= 9){
            return true;
        }
        if(x < 0){
            return false;
        }

        int numLen = String.valueOf(x).length();
        int left = numLen-1;
        int right = 1;
        while(left >= right){
            int tmpL = (int)Math.pow(10, left);
            int tmpR = (int)Math.pow(10, right);
            if(x / tmpL == x % tmpR / (tmpR / 10)){
                x -= x / tmpL * tmpL;
                x -= x % tmpR;
                left--;
                right++;
            }else{
                return false;
            }
        }

        return true;
    }
}
// @lc code=end

