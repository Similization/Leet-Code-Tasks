package InterviewQuestions.Task21;

public class Task21 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);

        ListNode l5 = new ListNode(3);
        ListNode l6 = new ListNode(4);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;

        l5.next = l6;

        System.out.println(new Solution().mergeTwoLists2(l5, l1));
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode resultList = null;
        ListNode ptr;
        ListNode help = null;

        while (list1 != null || list2 != null) {
            if (list1 == null) {
                ptr = list2;
                list2 = list2.next;
            } else if (list2 == null) {
                ptr = list1;
                list1 = list1.next;
            } else {
                if (list1.val < list2.val) {
                    ptr = list1;
                    list1 = list1.next;
                } else {
                    ptr = list2;
                    list2 = list2.next;
                }
            }

            if (resultList == null) {
                resultList = ptr;
                help = resultList;
            } else {
                help.next = ptr;
                help = help.next;
            }
        }
        return resultList;
    }

    public ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        ListNode resultList = null;
        ListNode ptr = null;

        if (list1.val < list2.val) {
            resultList = list1;
            list1 = list1.next;
        } else {
            resultList = list2;
            list2 = list2.next;
        }
        ptr = resultList;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                ptr.next = list1;
                list1 = list1.next;
            } else {
                ptr.next = list2;
                list2 = list2.next;
            }
            ptr = ptr.next;
        }

        while (list1 != null) {
            ptr.next = list1;
            ptr = ptr.next;
            list1 = list1.next;
        }

        while (list2 != null) {
            ptr.next = list2;
            ptr = ptr.next;
            list2 = list2.next;
        }

        return resultList;
    }
}