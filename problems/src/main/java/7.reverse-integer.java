import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        List<String> xList = new ArrayList<>();
        xList.addAll(Arrays.asList(String.valueOf(x).split("")));
        double result;

        if("-".equals(xList.get(0))){
            xList.remove(0);
            Collections.reverse(xList);
            xList.add(xList.size()-1, ".");
            xList.add(0,"-");
        }else{
            Collections.reverse(xList);
            xList.add(xList.size()-1, ".");
        }
        
        result = Double.valueOf(String.join("", xList));
        if(Integer.MIN_VALUE/10.0 <= result && result <= Integer.MAX_VALUE/10.0){
            xList.remove(xList.size()-2);
            return Integer.valueOf(String.join("", xList));
        }
        
        return 0;
    }
}
// @lc code=end

