package FirstSteps.Test2;

public class Task2 {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(2);
        ListNode listNode5 = new ListNode(1);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;

        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(listNode1));
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
    boolean isPalindrome(StringBuilder s) {
        int n = s.length();
        for (int i = 0; i < (n/2); ++i) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public boolean isPalindrome(ListNode head) {
        StringBuilder stringBuilder = new StringBuilder();
        ListNode listNode = head;
        while(listNode != null) {
            stringBuilder.append(listNode.val);
            listNode = listNode.next;
        }
        return isPalindrome(stringBuilder);
    }
}
