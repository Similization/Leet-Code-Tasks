package otherTasks.Task530;

public class Task530 {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(4);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(1);
        TreeNode t4 = new TreeNode(3);
        TreeNode t5 = new TreeNode(6);

        t1.left = t2;
        t1.right = t5;

        t2.left = t3;
        t2.right = t4;

        System.out.println(new Solution().getMinimumDifference(t1));
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
    int min = Integer.MAX_VALUE;
    TreeNode prev;
    public int getMinimumDifference(TreeNode root) {
        Min(root);
        return min;
    }

    public void Min(TreeNode root) {
        if (root == null) return;
        Min(root.left);
        if (prev != null) min = Math.min(min, root.val - prev.val);
        prev = root;
        Min(root.right);
    }
}