package Tree.FindPeakElement;

/**
 * LintCode 75.Find Peak Element
 * URL: https://www.lintcode.com/problem/183/
 * LeetCode 162.Find Peak Element
 * URL: https://leetcode.com/problems/find-peak-element/
 *
 * There is an integer array which has the following features:
 *  The numbers in adjacent positions are different.
 *  A[0] < A[1] && A[A.length - 2] > A[A.length - 1].
 *  We define a position P is a peak if:
 *
 *      A[P] > A[P-1] && A[P] > A[P+1]
 *
 *  Find a peak element in this array. Return the index of the peak.
 *  It's guaranteed the array has at least one peak.
 *  The array may contain multiple peeks, find any of them.
 *  The array has at least 3 numbers in it.
 *
 * Example 1:
 *  Input: A = [1, 2, 1, 3, 4, 5, 7, 6]
 *  Output: 1
 *  Explanation: Returns the index of any peak element. 6 is also correct.
 *
 * Example 2:
 *  Input: A = [1,2,3,4,1]
 *  Output: 3
 *  Explanation: return the index of peek.
 *
 * Challenge
 *  Time complexity O(logN)
 *
 */

public class Solution {
    /**
     * @param A: An integers array.
     * @return: return any of peek positions.
     */
    // solution-1
    public int findPeak(int[] A) {
        // check corner case
        if (A == null || A.length < 3) {
            return 0;
        }

        if (A.length == 3) {
            return 1;
        }

        // regular case
        int start = 0;
        int end = A.length - 2;

        while (start + 1 < end) {

            int mid = start + (end - start) / 2;

            if (A[mid] > A[mid - 1]) {
                start = mid;
            } else if (A[mid] > A[mid + 1]) {
                end = mid;
            } else {
                end = mid;
            }
        }

        if (A[start] < A[end]) {
            return end;
        } else {
            return start;
        }
    }

    // solution-2
    public int findPeak2(int[] A) {
        // check corner case
        if (A == null || A.length < 3) {
            return 0;
        }

        if (A.length == 3) {
            return 1;
        }

        // regular case
        int start = 0;
        int end  = A.length - 2;

        while (start + 1 < end) {

            int mid = start + (end - start) / 2;

            if (A[mid] > A[mid - 1] && A[mid] > A[mid + 1]) {
                return mid;
            }

            if (A[mid] > A[mid - 1]) {
                start = mid;
            }

            if (A[mid] > A[mid + 1]) {
                end = mid;
            }

            if (A[mid] < A[mid - 1] && A[mid] < A[mid + 1]) {
                end = mid;
            }
        }

        if (A[start] < A[end]) {
            return end;
        } else {
            return start;
        }
    }
}
