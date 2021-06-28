package BinaryTree.BinaryTreePaths;

import java.util.ArrayList;
import java.util.List;

/**
 * LintCode 480.Binary Tree Paths
 * URL: https://www.lintcode.com/problem/480/
 *
 * Given a binary tree, return all root-to-leaf paths.
 *
 * Example 1:
 *
 *  Input：{1,2,3,#,5}
 *  Output：["1->2->5","1->3"]
 *  Explanation：
 *     1
 *   /   \
 *  2     3
 *   \
 *    5
 *
 * Example 2:
 *
 *  Input：{1,2}
 *  Output：["1->2"]
 *  Explanation：
 *     1
 *   /
 *  2
 *
 */

public class Solution {
    /**
     * @param root: the root of the binary tree
     * @return: all root-to-leaf paths
     */

    // solution-1: recursion
    private final String SEPARATOR = "->";

    public List<String> binaryTreePaths(TreeNode root) {

        List<String> res = new ArrayList<>();
        //corner case
        if (root == null) {
            return res;
        }

        String path = String.valueOf(root.val);

        if (root.left == null && root.right == null) {
            res.add(path);
            return res;
        }

        if (root.left != null) {
            helper(res, path, root.left);
        }

        if (root.right != null) {
            helper(res, path, root.right);
        }

        return res;
    }

    // helper method
    private void helper(List<String> res, String path, TreeNode node) {

        path += SEPARATOR + String.valueOf(node.val);

        if (node.left == null && node.right == null) {
            res.add(path);
            return;
        }

        if (node.left != null) {
            helper(res, path, node.left);
        }

        if (node.right != null) {
            helper(res, path, node.right);
        }
    }

    // solution-2: recursion with divide conquer
    public List<String> binaryTreePaths2(TreeNode root) {

        List<String> res = new ArrayList<>();

        // corner case
        if (root == null) {
            return res;
        }

        int currentVal = root.val;
        if (root.left == null && root.right == null) {
            res.add(String.valueOf(currentVal));
            return res;
        }

        /**
         * regular case
         * divide
         */
        List<String> leftPath = binaryTreePaths2(root.left);
        List<String> rightPath = binaryTreePaths2(root.right);

        // conquer
        for (String path : leftPath) {
            res.add(currentVal + SEPARATOR + path);
        }

        for (String path : rightPath) {
            res.add(currentVal + SEPARATOR + path);
        }

        // return
        return res;
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
