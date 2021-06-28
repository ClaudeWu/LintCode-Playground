package BinaryTree.BinaryTreeLevelSum;

import java.util.LinkedList;
import java.util.Queue;

/**
 * LintCode 482.Binary Tree Level Sum
 * URL: https://www.lintcode.com/problem/482/
 *
 * Given a binary tree and an integer which is the depth of the target level.
 *
 * Calculate the sum of the nodes in the target level.
 *
 * Example 1:
 *  Input：{1,2,3,4,5,6,7,#,#,8,#,#,#,#,9},2
 *  Output：5
 *  Explanation：
 *          1
 *        /   \
 *       2     3
 *      / \   / \
 *     4   5 6   7
 *        /       \
 *       8         9
 *                      2+3=5
 *
 * Example 2:
 *  Input：{1,2,3,4,5,6,7,#,#,8,#,#,#,#,9},3
 *  Output：22
 *  Explanation：
 *          1
 *        /   \
 *       2     3
 *      / \   / \
 *     4   5 6   7
 *        /       \
 *       8         9
 *                     4+5+6+7=22
 */

public class Solution {
    /**
     * @param root: the root of the binary tree
     * @param level: the depth of the target level
     * @return: An integer
     * @method: BFS
     */
    public int levelSum(TreeNode root, int level) {
        // corner case
        if (root == null) {
            return 0;
        }

        // definition
        Queue<TreeNode> queue = new LinkedList<>();
        int count = 1;
        int sum = 0;

        queue.offer(root);

        // regular case
        while (!queue.isEmpty() && count < level) {
            int size = queue.size();
            count++;

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }

        if (count == level) {
            while (!queue.isEmpty()) {
                sum += queue.poll().val;
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
