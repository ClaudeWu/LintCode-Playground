package BinaryTree.BinaryTreeLeafSum;

import java.util.Stack;

/**
 * LintCode 481.Binary Tree Leaf Sum
 * URL: https://www.lintcode.com/problem/481/
 *
 * Given a binary tree, calculate the sum of leaves.
 *
 * Example 1:
 *  Input：{1,2,3,4}
 *  Output：7
 *  Explanation：
 *         1
 *        / \
 *       2   3
 *      /
 *     4
 *          3+4=7
 *
 * Example 2:
 *  Input：{1,#,3}
 *  Output：3
 *  Explanation：
 *         1
 *          \
 *           3
 */

public class Solution {
    /**
     * Divide & Conquer
     */
    public int leafSum(TreeNode root) {
        // corner case
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return root.val;
        }

        int left = leafSum(root.left);
        int right = leafSum(root.right);
        return left + right;

    }

    /**
     * Non-recursion
     * @param root
     * @return
     */
    public int leafSum2(TreeNode root) {
        // corner case
        if (root == null) {
            return 0;
        }

        Stack<TreeNode> stack = new Stack<>();
        int sum = 0;

        stack.push(root);

        while (!stack.isEmpty()) {
            root = stack.pop();

            if (root.left == null && root.right == null) {
                sum += root.val;
            }

            if (root.left != null) {
                stack.push(root.left);
            }

            if (root.right != null) {
                stack.push(root.right);
            }
        }

        return sum;
    }
}

class TreeNode {
    public int val;
    public TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}