package otherTasks.Task101;

import java.util.Objects;

public class Task101 {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(2);
        TreeNode t2 = new TreeNode(3);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(5);
        TreeNode t7 = new TreeNode(4);
        TreeNode t8 = new TreeNode(8);
        TreeNode t9 = new TreeNode(9);
        TreeNode t10 = new TreeNode(9);
        TreeNode t11 = new TreeNode(8);

        t1.left = t2;
        t1.right = t3;

        t2.left = t4;
        t2.right = t5;

        t3.left = t6;
        t3.right = t7;

        t5.left = t8;
        t5.right = t9;

        t6.left = t10;
        t6.right = t11;

        System.out.println(new Solution().isSymmetric(t1));
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
    public String getNumLeft(TreeNode root) {
        if (root == null) { return " "; }
        if (root.left == null && root.right == null) { return "" + root.val; }
        return getNumLeft(root.left) + root.val + getNumRight(root.right);
    }

    public String getNumRight(TreeNode root) {
        if (root == null) { return " "; }
        if (root.left == null && root.right == null) { return "" + root.val; }
        return getNumRight(root.right) + root.val + getNumLeft(root.left);
    }

    public boolean isSymmetric(TreeNode root) {
        return Objects.equals(getNumLeft(root.left), getNumRight(root.right));
    }

    public boolean isSymmetric2(TreeNode root) {
        return root==null || isSymmetricHelp(root.left, root.right);
    }

    private boolean isSymmetricHelp(TreeNode left, TreeNode right){
        if(left==null || right==null)
            return left==right;
        if(left.val!=right.val)
            return false;
        return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right, right.left);
    }
}