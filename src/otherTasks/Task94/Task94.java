package otherTasks.Task94;

import java.util.ArrayList;
import java.util.List;

public class Task94 {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t4 = null;
        TreeNode t5 = new TreeNode(2);

        t2.left = new TreeNode(3);
        t1.right = t2;
        t1.left = null;

        System.out.println(new Solution().inorderTraversal(t1));
        System.out.println(new Solution().inorderTraversal(t4));
        System.out.println(new Solution().inorderTraversal(t5));
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    List<Integer> res = new ArrayList<>();
    public void getVal(TreeNode node) {
        if (node == null) { return; }
        getVal(node.left);
        res.add(node.val);
        getVal(node.right);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        getVal(root);
        return res;
    }
}