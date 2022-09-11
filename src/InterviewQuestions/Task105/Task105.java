package InterviewQuestions.Task105;

import java.util.Arrays;
import java.util.HashMap;

public class Task105 {
    public static void main(String[] args) {
        new Solution().buildTree2(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7});
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length < 2) {
            return preorder.length == 0 ? null : new TreeNode(preorder[0]);
        }
        TreeNode root = new TreeNode(preorder[0]);
        int rootPos = 0;
        for (; rootPos < inorder.length; ++rootPos) {
            if (inorder[rootPos] == preorder[0]) {
                break;
            }
        }
        root.left = buildTree(Arrays.copyOfRange(preorder, 1, rootPos + 1),
                Arrays.copyOfRange(inorder, 0, rootPos));
        root.right = buildTree(Arrays.copyOfRange(preorder, rootPos + 1, preorder.length),
                Arrays.copyOfRange(inorder, rootPos + 1, inorder.length));
        return root;
    }

    HashMap<Integer, Integer> inorderTree;
    int index = 0;

    public TreeNode treeFromArr(int[] arr, int left, int right) {
        if (left > right) return null;
        var root = arr[index++];
        TreeNode treeNode = new TreeNode(root);
        treeNode.left = treeFromArr(arr, left, inorderTree.get(root) - 1);
        treeNode.right = treeFromArr(arr, inorderTree.get(root) + 1, right);
        return treeNode;
    }

    // 3-0, 9-1, 20-2, 15-3, 7-4
    public TreeNode buildTree2(int[] preorder, int[] inorder) {
        inorderTree = new HashMap<>(inorder.length);
        for (int i = 0; i < inorder.length; ++i) {
            inorderTree.put(inorder[i], i);
        }
        return treeFromArr(preorder, 0, preorder.length - 1);
    }
}