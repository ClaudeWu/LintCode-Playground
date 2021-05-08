package Tree.ClosestNumberInSortedArray;

/**
 * LintCode 459.Closest Number in Sorted Array
 * URL: https://www.lintcode.com/problem/459/
 *
 * Given a target number and an integer array A sorted in ascending order,
 * find the index i in A such that A[i] is closest to the given target.
 * Return -1 if there is no element in the array.
 *
 * Example 1:
 *  Input: [1, 2, 3] , target = 2
 *  Output: 1.
 *
 * Example 2:
 *  Input: [1, 4, 6], target = 3
 *  Output: 1.
 *
 * Example 3:
 *  Input: [1, 4, 6], target = 5,
 *  Output: 1 or 2.
 *
 * Challenge
 *  Time complexity in O(logn)
 *
 */

public class Solution {
    /**
     * @param A: an integer array sorted in ascending order
     * @param target: An integer
     * @return: an integer
     */
    public int closestNumber(int[] A, int target) {
        // write your code here
        if (A == null || A.length == 0) {
            return -1;
        }

        int index = findIndex(A, target);

        if (index == 0) {
            return 0;
        }

        if (index == A.length) {
            return A.length - 1;
        }

        if (target - A[index - 1] < A[index] - target) {
            return index - 1;
        }

        return index;
    }

    private int findIndex(int[] A, int target) {

        int start = 0;
        int end = A.length - 1;

        while (start + 1 < end) {

            int mid = start + (end - start) / 2;

            if (A[mid] < target) {
                start = mid;
            } else if (A[mid] > target) {
                end = mid;
            } else {
                end = mid;
            }
        }

        if (A[start] >= target) {
            return start;
        }

        if (A[end] >= target) {
            return end;
        }

        return A.length;
    }
}
