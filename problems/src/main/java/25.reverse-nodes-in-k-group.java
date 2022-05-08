import java.util.ArrayList;

/*
 * @lc app=leetcode id=25 lang=java
 *
 * [25] Reverse Nodes in k-Group
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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode result = new ListNode(0, head);
        int i = 1;
        List<ListNode> tmp = new ArrayList<>();
        while(head != null){
            tmp.add(head);
            if(i % k == 0){
                int left = 0;
                int right = tmp.size()-1;
                while(left < right){
                    int val = tmp.get(left).val;
                    tmp.get(left).val = tmp.get(right).val;
                    tmp.get(right).val = val;
                    left++;
                    right--;
                }
                tmp = new ArrayList<>();
            }
            head = head.next;
            i++;
        }
        return result.next;
        
    }
}
// @lc code=end

