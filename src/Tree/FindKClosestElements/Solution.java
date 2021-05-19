package Tree.FindKClosestElements;

import java.util.Arrays;

/**
 * LintCode 460.Find K Closest Elements
 * URL: https://www.lintcode.com/problem/460
 * LeetCode 658.Find K Closest Elements
 * URL: https://leetcode.com/problems/find-k-closest-elements/
 *
 * Given target, a non-negative integer k and an integer array A sorted in ascending order,
 * find the k closest numbers to target in A, sorted in ascending order by the difference between the number and target.
 * Otherwise, sorted in ascending order by number if the difference is same.
 *  1. The value k is a non-negative integer and will always be smaller than the length of the sorted array.
 *  2. Length of the given array is positive and will not exceed 10^4
 *  3. Absolute value of elements in the array will not exceed 10^4
 *
 * Example 1:
 *  Input: A = [1, 2, 3], target = 2, k = 3
 *  Output: [2, 1, 3]
 *
 * Example 2:
 *  Input: A = [1, 4, 6, 8], target = 3, k = 3
 *  Output: [4, 1, 6]
 *
 * Challenge
 *  O(logn + k) time
 *
 */

public class Solution {
    /**
     * @param A: an integer array
     * @param target: An integer
     * @param k: An integer
     * @return: an integer array
     */
    // solution-1  binary search
    public int[] kClosestNumbers(int[] A, int target, int k) {
        // definition
        int[] defultValue = new int[0];
        int[] result = defultValue;
        // check corner case
        if (A == null || A.length == 0 || k <= 0) {
            return result;
        }

        int size = A.length;
        result = new int[k];
        Arrays.fill(result, 0);

        int start = 0;
        int end = size - 1;

        while (start + 1 < end) {

            int mid = start + (end - start) / 2;

            if (A[mid] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }

        int index = 0;

        while (start >= 0 && end <= size - 1 && index < k) {
            result[index++] = Math.abs(A[start] - target) <= Math.abs(A[end] - target) ? A[start--] : A[end++];
        }

        while (start >= 0 && index < k) {
            result[index++] = A[start--];
        }

        while (end < size && index < k) {
            result[index++] = A[end++];
        }

        return result;
    }
}
