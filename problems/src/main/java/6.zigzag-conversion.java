import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode id=6 lang=java
 *
 * [6] Zigzag Conversion
 */

// @lc code=start
class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1){
            return s;
        }

        List<StringBuilder> inputList = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            StringBuilder tmp = new StringBuilder();
            inputList.add(tmp);
        }

        int index = 0;
        boolean isWrap = false;
        for (int i = 0; i < s.length(); i++) {
            if(index == 0){
                isWrap = false;
            }else if(index == numRows-1){
                isWrap = true;
            }

            inputList.get(index).append(s.charAt(i));

            if(isWrap){
                index--;
            }else{
                index++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (StringBuilder row: inputList) {
            sb.append(row);
        }
        return sb.toString();
    }
}
// @lc code=end

