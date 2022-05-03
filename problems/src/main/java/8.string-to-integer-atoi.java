/*
* @lc app=leetcode id=8 lang=java
*
* [8] String to Integer (atoi)
*/

// @lc code=start
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public int myAtoi(String s) {
        Pattern p = Pattern.compile("^[ ]*[-+]?[0-9]+");
        Matcher m = p.matcher(s);
        int rev = 0;
        if(m.find()){
            String x = m.group().replace(" ", "");
            int sign = 1;
            if(x.charAt(0) == '-'){
                sign = -1;
                x = x.substring(1, x.length());
            } else if(x.charAt(0) == '+'){
                x = x.substring(1, x.length());
            }
    
            while (x.length() != 0) {
                int pop = sign * Character.getNumericValue(x.charAt(0));
                x = x.substring(1, x.length());
                if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return Integer.MAX_VALUE;
                if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return Integer.MIN_VALUE;
                rev = rev * 10 + pop;
            }
        }
        return rev;
    }
}
// @lc code=end

