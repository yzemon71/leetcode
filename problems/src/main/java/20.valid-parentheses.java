import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        Deque<Character> dq = new ArrayDeque<>();
        Map<Character, Character> mp = new HashMap<>();
        mp.put('(', ')');
        mp.put('{', '}');
        mp.put('[', ']');
        for (int i = 0; i < s.length(); i++) {
            char brackets = s.charAt(i);
            if(mp.containsKey(brackets)){
                dq.push(brackets);
            }else if(!dq.isEmpty() && mp.get(dq.getFirst()) == brackets){
                dq.pop();
            }else{
                return false;
            }
        }
        return dq.isEmpty();
    }
}
// @lc code=end

