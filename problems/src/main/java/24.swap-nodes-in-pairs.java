/*
 * @lc app=leetcode id=24 lang=java
 *
 * [24] Swap Nodes in Pairs
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
    public ListNode swapPairs(ListNode head) {
        ListNode result = new ListNode(0, head);
        int i = 0;
        ListNode tmp = null;
        while(head != null){
            if((i % 2)-1 == 0){
                int val = tmp.val;
                tmp.val = head.val;
                head.val = val;
                tmp = null;
            }
            tmp = head;
            head = head.next;
            i++;
        }
        return result.next;

    }
}
// @lc code=end

