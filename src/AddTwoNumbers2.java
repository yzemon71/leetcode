import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class AddTwoNumbers2 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> tmp_ans = new ArrayList<>();
        ListNode tmp1 = l1;
        ListNode tmp2 = l2;
        int flag = 0;
        while (true) {
            if (Objects.isNull(tmp1) && Objects.isNull(tmp2)) {
                if (flag == 1){
                    tmp_ans.add(flag);
                }
                break;
            } else if (Objects.isNull(tmp1)) {
                tmp1 = new ListNode();
            } else if (Objects.isNull(tmp2)){
                tmp2 = new ListNode();
            }

            int aa = tmp1.val + tmp2.val + flag;
            flag = 0;
            if (aa >= 10) {
                aa -= 10;
                flag = 1;
            }
            tmp_ans.add(aa);

            tmp1 = tmp1.next;
            tmp2 = tmp2.next;
        }

        System.out.println(tmp_ans);
        Collections.reverse(tmp_ans);
        ListNode ans = new ListNode(tmp_ans.remove(0));
        for (Integer integer : tmp_ans) {
            ans = new ListNode(integer, ans);
        }
        return ans;
    }
    public static void main(String[] args) {
        // Input: l1 = [2,4,3], l2 = [5,6,4]
        // Output: [7,0,8]
        // Explanation: 342 + 465 = 807.
        ListNode l1_3 = new ListNode(3);
        ListNode l1_4 = new ListNode(4,l1_3);
        ListNode l1 = new ListNode(2,l1_4);
        ListNode l2_4 = new ListNode(4);
        ListNode l2_6 = new ListNode(6,l2_4);
        ListNode l2 = new ListNode(5,l2_6);

        // Input: l1 = [0], l2 = [0]
        // Output: [0]
        // ListNode l1 = new ListNode(1);
        // ListNode l2 = new ListNode(9);

        // Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
        // Output: [8,9,9,9,0,0,0,1]
        // ListNode l1_6 = new ListNode(9);
        // ListNode l1_5 = new ListNode(9, l1_6);
        // ListNode l1_4 = new ListNode(9, l1_5);
        // ListNode l1_3 = new ListNode(9, l1_4);
        // ListNode l1_2 = new ListNode(9, l1_3);
        // ListNode l1_1 = new ListNode(9, l1_2);
        // ListNode l1 = new ListNode(9, l1_1);
        // ListNode l2_3 = new ListNode(9);
        // ListNode l2_2 = new ListNode(9, l2_3);
        // ListNode l2_1 = new ListNode(9, l2_2);
        // ListNode l2 = new ListNode(9, l2_1);

        ListNode ans = addTwoNumbers(l1, l2);
        while(true){
            System.out.println(ans.val);
            if(Objects.isNull(ans.next)){
                break;
            }
            ans = ans.next;
        }
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
