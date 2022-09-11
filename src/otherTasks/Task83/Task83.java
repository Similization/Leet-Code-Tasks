package otherTasks.Task83;

public class Task83 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(2);
        ListNode l4 = new ListNode(3);
        ListNode l5 = new ListNode(3);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        System.out.println(new Solution().deleteDuplicates(l1));
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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) { return null; }
        ListNode prevNumb = head;
        ListNode nextNumb = head;
        while (nextNumb != null) {
            if (nextNumb.val != prevNumb.val) {
                prevNumb.next = nextNumb;
                prevNumb = prevNumb.next;
            }
            nextNumb = nextNumb.next;
        }
        prevNumb.next = null;
        return head;
    }
}
