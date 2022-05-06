import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode id=17 lang=java
 *
 * [17] Letter Combinations of a Phone Number
 */

// @lc code=start
class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits.length() == 0){
            return result;
        }

        Map<Character, List<String>> mp = new HashMap<>();
        mp.put('2', List.of("a","b","c"));
        mp.put('3', List.of("d","e","f"));
        mp.put('4', List.of("g","h","i"));
        mp.put('5', List.of("j","k","l"));
        mp.put('6', List.of("m","n","o"));
        mp.put('7', List.of("p","q","r", "s"));
        mp.put('8', List.of("t","u","v"));
        mp.put('9', List.of("w","x","y","z"));
        if(digits.length() == 1){
            return mp.get(digits.charAt(0));
        }

        int len = 1;
        List<List<String>> phone = new ArrayList<>();
        for (int i = 0; i < digits.length(); i++) {
            List<String> tmp = mp.get(digits.charAt(i));
            len *= tmp.size();
            phone.add(tmp);
        }

        for (int l = 0; l < len; l++) {
            int tmp = 1;
            StringBuilder sb = new StringBuilder();
            for (int i = digits.length()-1; i >= 0; i--) {
                List<String> hoge = mp.get(digits.charAt(i));
                sb.insert(0, hoge.get((l/tmp)%hoge.size()));
                tmp *= hoge.size();
            }
            result.add(sb.toString());
        }

        return result;
    }
}
// @lc code=end

