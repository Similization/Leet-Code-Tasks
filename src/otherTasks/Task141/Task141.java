package otherTasks.Task141;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task141 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(2);
        ListNode l4 = new ListNode(3);
        ListNode l5 = new ListNode(4);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        System.out.println(new Solution().hasCycle(l1));
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
    public boolean hasCycle(ListNode head) {
        List<ListNode> listNodes = new ArrayList<>();
        while (head != null) {
            if (!listNodes.contains(head)) {
                listNodes.add(head);
            } else {
                return true;
            }
            head = head.next;
        }
        return false;
    }
    public boolean hasCycle2(ListNode head) {
        Set<ListNode> listNodes = new HashSet<>();
        while (head != null) {
            if (!listNodes.contains(head)) {
                listNodes.add(head);
            } else {
                return true;
            }
            head = head.next;
        }
        return false;
    }
    public boolean hasCycle3(ListNode head) {
        ListNode walker = head;
        ListNode runner = head;
        while(runner!=null && runner.next!=null) {
            walker = walker.next;
            runner = runner.next.next;
            if(walker==runner) return true;
        }
        return false;
    }
}
