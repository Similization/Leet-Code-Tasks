package otherTasks.Task203;

public class Task203 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(1);
        ListNode l4 = new ListNode(1);
        ListNode l5 = new ListNode(1);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        System.out.println(new Solution().removeElements(l1, 1));
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
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        var ptr1 = head;
        while (ptr1 != null && ptr1.next != null) {
            if (ptr1.next.val == val) {
                ptr1.next = ptr1.next.next;
            } else {
                ptr1 = ptr1.next;
            }
        }
        return head;
    }
}