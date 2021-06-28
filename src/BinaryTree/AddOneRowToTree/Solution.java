package BinaryTree.AddOneRowToTree;

/**
 * LintCode 1122.Add One Row to Tree
 * URL: https://www.lintcode.com/problem/1122/description
 *
 * Given the root of a binary tree, then value v and depth d,
 * you need to add a row of nodes with value v at the given depth d. The root node is at depth 1.
 *
 * The adding rule is: given a positive integer depth d, for each NOT null tree nodes N in depth d-1,
 * create two tree nodes with value v as N's left subtree root and right subtree root.
 * And N's original left subtree should be the left subtree of the new left subtree root,
 * its original right subtree should be the right subtree of the new right subtree root.
 * If depth d is 1 that means there is no depth d-1 at all,
 * then create a tree node with value v as the new root of the whole original tree,
 * and the original tree is the new root's left subtree.
 *
 * Example1
 * Input:
 * A binary tree as following:
 *        4
 *      /   \
 *     2     6
 *    / \   /
 *   3   1 5
 * v = 1
 * d = 2
 * Output:
 *        4
 *       / \
 *      1   1
 *     /     \
 *    2       6
 *   / \     /
 *  3   1   5
 *
 * Example2
 * Input:
 * A binary tree as following:
 *        4
 *      /   \
 *     2     6
 *    / \   /
 *   3   1 5
 * v = 2
 * d = 1
 * Output:
 *          2
 *   	/
 *        4
 *      /   \
 *     2     6
 *    / \   /
 *   3   1 5
 */

// Definition of TreeNode:
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
     * @param root: the root of binary tree
     * @param v: a integer
     * @param d: a integer
     * @return: return a TreeNode
     */
    // solution-1
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        // corner case
        if (root == null) {
            return null;
        }

        if (d == 0 || d == 1) {
            TreeNode newroot = new TreeNode(v);
            newroot.left = d == 1 ? root : null;
            newroot.right = d == 0 ? root : null;
            return newroot;
        }

        if (root != null && d >= 2) {
            root.left = addOneRow(root.left, v, d > 2 ? d - 1 : 1);
            root.right = addOneRow(root.right, v, d > 2 ? d - 1 : 0);
        }

        return root;
    }

    //solution-2
    public TreeNode addOneRow2(TreeNode root, int v, int d) {
        // corner case
        if (root == null) {
            return null;
        }

        TreeNode node = new TreeNode(v);

        if (d == 1) {
            node.left = root;
            return node;
        }

        if (d == 2) {
            TreeNode t = root.left;
            root.left = new TreeNode(v);
            root.left.left = t;

            t = root.right;
            root.right = new TreeNode(v);
            root.right.right = t;
            return root;
        }

        root.left = addOneRow2(root.left, v, d - 1);
        root.right = addOneRow2(root.right, v, d - 1);
        return root;
    }
}
