package BinaryTree.EqualTreePartition;

import java.util.HashMap;
import java.util.Map;

/**
 * LintCode 864.Equal Tree Partition
 * URL: https://www.lintcode.com/problem/864/description
 *
 * Given a binary tree with n nodes, your task is to check if it's possible to partition the tree to two trees which
 * have the equal sum of values after removing exactly one edge on the original tree
 *
 * Example 1:
 * Input: {5,10,10,#,#,2,3}
 * Output: true
 * Explanation:
 *   origin:
 *      5
 *     / \
 *    10 10
 *      /  \
 *     2    3
 *   two subtrees:
 *      5       10
 *     /       /  \
 *    10      2    3
 *
 * Example 2:
 * Input: {1,2,10,#,#,2,20}
 * Output: false
 * Explanation:
 *   origin:
 *      1
 *     / \
 *    2  10
 *      /  \
 *     2    20
 *
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
     * @param root: a TreeNod
     * @return: return a boolean
     */

    Map<Integer, Integer> map = new HashMap<>();

    public boolean checkEqualTree(TreeNode root) {
        int sum = dfs(root);
        if (sum == 0) {
            return map.get(0) > 1;
        }

        return sum % 2 == 0 && map.containsKey(sum / 2);
    }

    public int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int sum = root.val + dfs(root.left) + dfs(root.right);
        int tmp = 1;

        if (map.containsKey(sum)) {
            tmp = map.get(sum) + 1;
        }

        map.put(sum, tmp);
        return sum;
    }
}
