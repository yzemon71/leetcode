import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=22 lang=java
 *
 * [22] Generate Parentheses
 */

// @lc code=start
class Solution {
    public List<String> generateParenthesis(int n) {
        return backtrack("(", n-1, n);
    }
    
    public List<String> backtrack(String s, int left, int right){
        if(left == 0 && right == 0 && isValid(s)){
            return List.of(s);
        }

        List<String> result = new ArrayList<>();
        if(left > 0){
            result.addAll(backtrack(s+"(", left-1, right));
        }
        if(right > 0){
            result.addAll(backtrack(s+")", left, right-1));
        }

        return result;
    }

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

