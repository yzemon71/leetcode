import java.util.HashMap;

/*
 * @lc app=leetcode id=19 lang=java
 *
 * [19] Remove Nth Node From End of List
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
    
    private int nodeCount = 1;
    private Map<Integer, Integer> nodeMap = new HashMap<>();
    private boolean isRemove = false;

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            return null;
        }
        
        return backtrack(head, 0, n);
    }

    public ListNode backtrack(ListNode node, int count, int target){
        nodeMap.put(count, node.val);

        if(node.next == null){
            if(target == 1){
                isRemove = true;
                return new ListNode(nodeMap.get(count-1));
            }
            return new ListNode(node.val);
        }

        nodeCount++;
        ListNode nodeNext = backtrack(node.next, count+1, target);
        
        if(nodeCount == count + target){
            isRemove = true;
            if(count-1 < 0){
                return nodeNext;
            }
            return new ListNode(nodeMap.get(count-1), nodeNext);
        }

        if(isRemove){
            if(count-1 < 0){
                return nodeNext;
            }
            return new ListNode(nodeMap.get(count-1), nodeNext);
        }
        return new ListNode(node.val, nodeNext);
    }
}
// @lc code=end

