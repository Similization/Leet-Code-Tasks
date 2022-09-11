package otherTasks.Task206;

import java.util.List;
import java.util.Stack;

public class Task206 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(6);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        System.out.println(new Solution().reverseList(l1));
    }
}
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) { return null; }
        Stack<ListNode> listNodes = new Stack<>();
        while (head != null) {
            listNodes.add(head);
            head = head.next;
        }
        ListNode list = listNodes.pop();
        ListNode helper = list;
        while (!listNodes.empty()) {
            helper.next = listNodes.pop();
            helper = helper.next;
        }
        helper.next = null;
        return list;
    }
    public ListNode reverseList2(ListNode head) {
        ListNode newHead = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }

}
