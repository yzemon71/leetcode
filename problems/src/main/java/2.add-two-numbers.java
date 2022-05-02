/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> tmp_ans = new ArrayList<>();
        int flag = 0;
        while (true) {
            if (l1 == null && l2 == null) {
                if (flag == 1){
                    tmp_ans.add(flag);
                }
                break;
            } else if (l1 == null) {
                l1 = new ListNode();
            } else if (l2 == null){
                l2 = new ListNode();
            }

            int sum = l1.val + l2.val + flag;
            flag = sum / 10;
            sum = sum % 10;
            tmp_ans.add(sum);

            l1 = l1.next;
            l2 = l2.next;
        }

        Collections.reverse(tmp_ans);
        ListNode ans = new ListNode(tmp_ans.remove(0));
        for (Integer integer : tmp_ans) {
            ans = new ListNode(integer, ans);
        }
        return ans;
    }
}
// @lc code=end

