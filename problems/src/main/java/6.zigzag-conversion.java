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

        List<String> inputList = Arrays.asList(s.split(""));
        Map<Integer,List<String>> mp = new HashMap<>();
        for (int i = 0; i < numRows; i++) {
            mp.put(i, new ArrayList<>());
        }

        int index = 0;
        boolean isWrap = false;
        for (int i = 0; i < inputList.size(); i++) {
            if(index == 0){
                isWrap = false;
            }else if(index == numRows-1){
                isWrap = true;
            }
            
            List<String> tmpList = mp.get(index);
            tmpList.add(inputList.get(i));
            mp.put(index, tmpList);

            if(isWrap){
                index--;
            }else{
                index++;
            }
        }

        List<String> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            result.addAll(mp.get(i));
        }
        return String.join("", result);
    }
}
// @lc code=end

