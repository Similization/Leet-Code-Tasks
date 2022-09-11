package FirstSteps.Test5;

public class Task876 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        Solution solution = new Solution();
        System.out.println(solution.middleNode(node1));
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

// 1 2 3 4 5 null
// 1 s f
// 1 2 s 4 f

// 1 2 3 4 5 6 null
// 1 s f
// 1 2 s 4 f
// 1 2 3 s 5 6 f
class Solution {
    public ListNode middleNode(ListNode head) {
        var fastList = head;
        var slowList = head;

        while (fastList != null && fastList.next != null) {
            fastList = fastList.next.next;
            slowList = slowList.next;
        }
        return slowList;
    }
}
