import java.util.ArrayDeque;
import java.util.Deque;

/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        Deque<Character> dq = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char brackets = s.charAt(i);
            if(brackets == '(' || brackets == '[' || brackets == '{'){
                dq.push(brackets);
            }else if(brackets == ')' || brackets == ']' || brackets == '}'){
                if(dq.isEmpty()){
                    return false;
                }else if(dq.getFirst() == '(' && brackets == ')'){
                    dq.pop();
                }else if(dq.getFirst() == '{' && brackets == '}'){
                    dq.pop();
                }else if(dq.getFirst() == '[' && brackets == ']'){
                    dq.pop();
                }else{
                    return false;
                }
            }
        }
        return dq.isEmpty();
    }
}
// @lc code=end

