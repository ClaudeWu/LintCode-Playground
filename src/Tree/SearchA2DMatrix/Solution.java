package Tree.SearchA2DMatrix;

/**
 * LintCode 28.Search a 2D Matrix (vest)
 * URL: https://www.lintcode.com/problem/28/description
 *
 * Write an efficient algorithm that searches for a target value in an m x n matrix.
 * This matrix has the following properties:
 * Integers in each row are sorted from left to right.
 * The first integer of each row is greater than the last integer of the previous row.
 * n × m < 50000
 *
 * Example 1:
 *  Input: matrix = [[5]],
 *         target = 2
 *
 *  Output: false
 *
 * Example 2:
 *  Input: matrix = [[1, 3, 5, 7],
 *                   [10, 11, 16, 20],
 *                   [23, 30, 34, 50]]
 *         target = 3
 *
 *  Output: true
 *
 * Explanation: The matrix includes 3, return true.
 *
 * Challenge
 *  O(log(n) + log(m)) time
 *
 */

public class Solution {
    /**
     * @param matrix: matrix, a list of lists of integers
     * @param target: An integer
     * @return: a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        // check corner case
        if (matrix == null || matrix.length == 0) {
            return false;
        }

        if (matrix[0] == null || matrix[0].length == 0) {
            return false;
        }

        // definition
        int n = matrix.length;
        int m = matrix[0].length;
        int start = 0;
        int end = n * m - 1;

        // regular case
        while (start + 1 < end) {

            int mid = start + (end - start) / 2;

            if (get(matrix, mid) < target) {
                start = mid;
            } else {
                end = mid;
            }
        }

        if (get(matrix, start) == target) {
            return true;
        }

        if (get(matrix, end) == target) {
            return true;
        }

        return false;
    }

    private int get(int[][] matrix, int index) {

        int x = index / matrix[0].length;
        int y = index % matrix[0].length;

        return matrix[x][y];
    }
}
