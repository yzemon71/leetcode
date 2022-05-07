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
        if(left == 0 && right == 0){
            return List.of(s);
        }

        List<String> result = new ArrayList<>();
        
        if( (left > 0 && right == 0) || (left > right) ){
            return result;
        }

        if(left > 0){
            result.addAll(backtrack(s+"(", left-1, right));
        }
        if(right > 0){
            result.addAll(backtrack(s+")", left, right-1));
        }

        return result;
    }
}
// @lc code=end


// fast
/**
 *public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack("(", n-1, n, result);
        return result;
    }
    
    public void backtrack(String s, int left, int right, List<String> result){
        if(left == 0 && right == 0){
            result.add(s);
            return;
        }
        
        if( (left > 0 && right == 0) || (left > right) ){
            return;
        }

        if(left > 0){
            backtrack(s+"(", left-1, right, result);
        }
        if(right > 0){
            backtrack(s+")", left, right-1, result);
        }
    }
 */