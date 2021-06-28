package BinaryTree.BinaryTreeZigzagLevelOrderTraversal;

import java.util.*;

/**
 *  LintCode 71.Binary Tree Zigzag Level Order Traversal
 *  URL: https://www.lintcode.com/problem/71/description
 *
 *  Given a binary tree, return the zigzag level order traversal of its nodes' values.
 *  (ie, from left to right, then right to left for the next level and alternate between).
 *
 * Example 1:
 * Input:
 * tree = {1,2,3}
 *
 * Output:
 * [[1],[3,2]]
 *
 * Explanation:
 *     1
 *    / \
 *   2   3
 * it will be serialized {1,2,3}
 *
 * Example 2:
 * Input:
 * tree = {3,9,20,#,#,15,7}
 *
 * Output:
 * [[3],[20,9],[15,7]]
 * Explanation:
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * it will be serialized {3,9,20,#,#,15,7}
 */

class TreeNode {
    public int val;
    public TreeNode left, right;
    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

public class Solution {
    /**
     * @param root: A Tree
     * @return: A list of lists of integer include the zigzag level order traversal of its nodes' values.
     */
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> res = new ArrayList<List<Integer>>();

        if (root == null) {
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        // forward or backward marker
        boolean isForward = true;
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> subList = new ArrayList<Integer>();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                subList.add(node.val);

                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            // confirm the traverse direction by marker
            if (!isForward) {
                // reverse
                Collections.reverse(subList);
            }

            res.add(subList);
            // reset marker
            isForward = !isForward;
        }

        return res;
    }

}
