package InterviewQuestions.Task19;

public class Task19 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;

        // System.out.println(new Solution().removeNthFromEnd(l1, 1));
        System.out.println(new Solution().removeNthFromEnd(l3, 2));
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) {
            return null;
        }

        ListNode ptr = head;

        int length = 1;
        while (ptr.next != null) {
            ptr = ptr.next;
            ++length;
        }

        ptr = head;
        if (length - n == 0) {
            return head.next;
        }
        while ((length - n) > 1) {
            ptr = ptr.next;
            --length;
        }
        ptr.next = ptr.next.next;

        return head;
    }

    public ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode ptr = head;
        ListNode beforeDeleted = head;
        int passed = 0;
        while (ptr.next != null) {
            if (passed < n) {
                ++passed;
            } else {
                beforeDeleted = beforeDeleted.next;
            }
            ptr = ptr.next;
        }

        if (passed != n) {
            return head.next;
        }
        beforeDeleted.next = beforeDeleted.next.next;
        return head;
    }
}
