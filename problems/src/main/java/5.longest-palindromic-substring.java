/*
 * @lc app=leetcode id=5 lang=java
 *
 * [5] Longest Palindromic Substring
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {
        // first
        if(s.length() == 1){
            return s;
        }
        if(s.length() == 2){
            if(s.charAt(0) == s.charAt(1)){
                return s;
            }
            return s.substring(0, 1);
        }

        // logic
        String palindrome = "";
        for (int i = 0; i < s.length()-1; i++) {
            // 1:1
            int left = i;
            int rigth = i;
            String tmpPalindrome = s.substring(left, rigth+1);
            left -= 1;
            rigth += 1;
            while (0 <= left && rigth < s.length()) {
                if(s.charAt(left) == s.charAt(rigth)){
                    tmpPalindrome = s.substring(left, rigth+1);
                    left -= 1;
                    rigth += 1;
                }else{
                    break;
                }
            }
            if(palindrome.length() < tmpPalindrome.length()){
                palindrome = tmpPalindrome;
            }

            // 2:2
            left = i;
            rigth = i+1;
            if(s.charAt(left) == s.charAt(rigth)){
                tmpPalindrome = s.substring(left, rigth+1);
                left -= 1;
                rigth += 1;
                while (0 <= left && rigth < s.length()) {
                    if(s.charAt(left) == s.charAt(rigth)){
                        tmpPalindrome = s.substring(left, rigth+1);
                        left -= 1;
                        rigth += 1;
                    }else{
                        break;
                    }
                }
                if(palindrome.length() < tmpPalindrome.length()){
                    palindrome = tmpPalindrome;
                }
            }

        }

        return palindrome;        
    }


}
// @lc code=end

