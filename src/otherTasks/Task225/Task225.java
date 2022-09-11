package otherTasks.Task225;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Task225 {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println(myStack.empty());
        myStack.pop();
        System.out.println(myStack.top());
        myStack.pop();
        myStack.pop();
        System.out.println(myStack.empty());
    }
}

class MyStack {
    static class ListNode {
        int x;
        ListNode next;
        ListNode(int x) {
            this.x = x;
        }
    }
    private ListNode listNode;
    public MyStack() {
        listNode = null;
    }

    public void push(int x) {
        if (listNode == null) {
            listNode = new ListNode(x);
            return;
        }
        var newNode = new ListNode(x);
        newNode.next = listNode;
        listNode = newNode;
    }

    public int pop() {
        if (listNode == null) {
            return -1;
        }
        var top = listNode;
        listNode = listNode.next;
        return top.x;
    }

    public int top() {
        if (listNode == null) {
            return -1;
        }
        return listNode.x;
    }

    public boolean empty() {
        return listNode == null;
    }
}
