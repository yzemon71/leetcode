import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> vals = new ArrayList<>();
        if(list1 == null && list2 == null){
            return null;
        }
        
        while(list1 != null){
            vals.add(list1.val);
            list1 = list1.next;
        }
        while(list2 != null){
            vals.add(list2.val);
            list2 = list2.next;
        }

        if(vals.size() == 1){
            return new ListNode(vals.get(0));
        }

        Collections.sort(vals);
        ListNode result = new ListNode(vals.get(vals.size()-1));

        for (int i = vals.size()-2; i >= 0 ; i--) {
            result = new ListNode(vals.get(i), result);
        }

        return result;
    }
}
// @lc code=end

