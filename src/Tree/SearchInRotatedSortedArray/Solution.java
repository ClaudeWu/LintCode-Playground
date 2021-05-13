package Tree.SearchInRotatedSortedArray;

/**
 * LintCode 62.Search in Rotated Sorted Array (vest)
 * URL: https://www.lintcode.com/problem/62
 * LeetCode 33.Search in Rotated Sorted Array (vest)
 * URL: https://leetcode.com/problems/search-in-rotated-sorted-array/
 *
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * You are given a target value to search. If found in the array return its index, otherwise return -1.
 * You may assume no duplicate exists in the array.
 *
 * Example 1:
 *  Input: array = [4, 5, 1, 2, 3], target = 1
 *  Output: 2
 *  Explanation: 1 is indexed at 2 in the array.
 *
 * Example 1:
 *  Input: array = [4, 5, 1, 2, 3], target = 0
 *  Output: -1
 *  Explanation: 0 is not in the array. Returns -1.
 *
 * Challenge
 *  O(logN) time
 *
 */

public class Solution {
    public int search(int[] A, int target) {
        //check corner case
        if (A == null || A.length == 0) {
            return -1;
        }

        // definition
        int start = 0;
        int end = A.length - 1;

        // check regular case
        while (start + 1 < end) {

            int mid = start + (end - start) / 2;

            if (A[start] < A[mid]) {
                // situation-1
                if (A[start] <= target && A[mid] >= target) {
                    end = mid;
                } else {
                    start = mid;
                }
            } else {
                // situation-2
                if (A[end] >= target && A[mid] <= target) {
                    end = mid;
                } else {
                    start = mid;
                }
            }
        }

        if (A[start] == target) {
            return start;
        }

        if (A[end] == target) {
            return end;
        }

        return -1;
    }
}
