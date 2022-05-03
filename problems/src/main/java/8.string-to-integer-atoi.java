/*
* @lc app=leetcode id=8 lang=java
*
* [8] String to Integer (atoi)
*/

// @lc code=start
class Solution {
    public int myAtoi(String s) {
        int strLen = s.length();
        if(strLen == 0){
            return 0;
        }

        int index = 0;
        while(index < strLen && s.charAt(index) == ' '){
            index++;
        }

        int sign = 1;
        if(index < strLen && s.charAt(index) == '-'){
            sign = -1;
            index++;
        } else if(index < strLen && s.charAt(index) == '+'){
            index++;
        }

        int rev = 0;
        while (index < strLen && '0' <= s.charAt(index) && s.charAt(index) <= '9') {
            int pop = sign * Character.getNumericValue(s.charAt(index));
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return Integer.MAX_VALUE;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return Integer.MIN_VALUE;
            rev = rev * 10 + pop;
            index++;
        }
        return rev;
    }
}
// @lc code=end

