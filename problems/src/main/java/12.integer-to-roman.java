/*
 * @lc app=leetcode id=12 lang=java
 *
 * [12] Integer to Roman
 */

// @lc code=start
class Solution {
    public String intToRoman(int num) {
        int[] digit = {0,0,0,0};
        for (int i = 0; i < digit.length; i++) {
            digit[i] = num%10;
            num /= 10;
        }
        return roman("M", "", "", digit[3]) + 
            roman("C", "D", "M", digit[2]) + 
            roman("X", "L", "C", digit[1]) + 
            roman("I", "V", "X", digit[0]);

    }
    public String roman(String one, String five, String ten, int num){
        String result = "";
        switch (num) {
            case 1:
                result = one;
                break;
            case 2:
                result = one + one;
                break;
            case 3:
                result = one + one + one;
                break;
            case 4:
                result = one + five;
                break;
            case 5:
                result = five;
                break;
            case 6:
                result = five + one;
                break;
            case 7:
                result = five + one + one;
                break;
            case 8:
                result = five + one + one + one;
                break;
            case 9:
                result = one + ten;
                break;
            default:
                result = "";
                break;
        }
        return result;
    }
}
// @lc code=end

