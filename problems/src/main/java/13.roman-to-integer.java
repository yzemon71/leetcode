import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        Map<String, Integer> mp = new HashMap<>();
        mp.put("M",1000);
        mp.put("CM",900);
        mp.put("D",500);
        mp.put("CD",400);
        mp.put("C",100);
        mp.put("XC",90);
        mp.put("L",50);
        mp.put("XL",40);
        mp.put("X",10);
        mp.put("IX",9);
        mp.put("V",5);
        mp.put("IV",4);
        mp.put("I",1);

        int result = 0;
        int i = 0;
        while(i < s.length()){
            StringBuilder sb = new StringBuilder();
            sb.append(s.charAt(i));
            int tmp = mp.get(sb.toString());
            if(i != s.length()-1){
                sb.append(s.charAt(i+1));
            }
            if(mp.get(sb.toString()) != null){
                tmp = mp.get(sb.toString());
                i++;
            }
            result += tmp;
            i++;
        }
        return result;        
    }
}
// @lc code=end

