package otherTasks.Task100;

public class Task100 {
    public static void main(String[] args) {
        TreeNode treeNode11 = new TreeNode(1);
        TreeNode treeNode12 = new TreeNode(2);
        TreeNode treeNode13 = new TreeNode(3);

        TreeNode treeNode21 = new TreeNode(1);
        TreeNode treeNode22 = new TreeNode(2);
        TreeNode treeNode23 = new TreeNode(3);

        treeNode11.left = treeNode12;
        treeNode11.right = treeNode13;

        treeNode21.left = treeNode22;
        treeNode21.right = treeNode23;

        System.out.println(new Solution().isSameTree(treeNode11, treeNode21));
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
    public boolean changeNode(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        } else if (node1 == null || node2 == null) {
            return false;
        }
        return changeNode(node1.left, node2.left) && node1.val == node2.val && changeNode(node1.right, node2.right);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        return changeNode(p, q);
    }
}
