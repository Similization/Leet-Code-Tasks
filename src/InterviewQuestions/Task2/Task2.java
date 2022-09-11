package InterviewQuestions.Task2;

public class Task2 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode l11 = new ListNode(9);
        ListNode l12 = new ListNode(9);
//        ListNode l13 = new ListNode(1);

        ListNode l21 = new ListNode(9);
        ListNode l22 = new ListNode(9);
        ListNode l23 = new ListNode(9);

        l11.next = l12;
//        l12.next = l13;

        l21.next = l22;
        l22.next = l23;

        System.out.println(solution.addTwoNumbers(l11, l21));
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode lRes = null;
        ListNode lPos = null;
        int bigDig = 0;

        while (l1 != null || l2 != null) {
            int digSum = 0;

            if (l1 != null) {
                digSum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                digSum += l2.val;
                l2 = l2.next;
            }

            if (lRes == null) {
                lRes = new ListNode(digSum % 10);
                lPos = lRes;
            }
            else {
                lPos.next = new ListNode((digSum + bigDig) % 10);
                lPos = lPos.next;
            }
            bigDig = (digSum + bigDig) / 10;
        }

        if (bigDig != 0) {
            lPos.next = new ListNode(bigDig);
        }
        return lRes;
    }
}