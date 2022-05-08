import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/*
 * @lc app=leetcode id=23 lang=java
 *
 * [23] Merge k Sorted Lists
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        List<Integer> vals = new ArrayList<>();
        for (int i = 0; i < lists.length; i++) {
            ListNode tmp = lists[i];
            while(tmp != null){
                vals.add(tmp.val);
                tmp = tmp.next;
            }
        }

        if(vals.size() == 0){
            return null;
        }

        Collections.sort(vals);

        ListNode result = new ListNode(vals.get(vals.size()-1));
        for (int i = vals.size()-2; i >= 0; i--) {
            result = new ListNode(vals.get(i), result);            
        }

        return result;
    }
}
// @lc code=end

