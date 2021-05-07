package Tree.TotalOccurrenceOfTarget;

/**
 * LintCode 462.Total Occurrence of Target
 * URL: https://www.lintcode.com/problem/462/
 *
 * Given a target number and an integer array sorted in ascending order.
 * Find the total number of occurrences of target in the array.
 *
 * Example 1:
 *  Input: [1, 3, 3, 4, 5] and target = 3,
 *  Output: 2.
 *
 * Example 2:
 *  Input: [2, 2, 3, 4, 6] and target = 4,
 *  Output: 1.
 *
 * Example 3:
 *  Input: [1, 2, 3, 4, 5] and target = 6,
 *  Output: 0.
 *
 * Challenge
 *  Time complexity in O(logn)
 *
 */

public class Solution {
    /**
     * @param A: A an integer array sorted in ascending order
     * @param target: An integer
     * @return: An integer
     */
    // solution-1
    public int totalOccurrence(int[]A, int target) {
        // check corner case
        if (A == null || A.length == 0) {
            return 0;
        }

        int left = binarySearch(A, target, true);
        int right = binarySearch(A, target, false);

        if (left < 0) {
            return 0;
        }

        return right - left + 1;
    }

    // helper method
    public int binarySearch(int[] A, int target, boolean leftMost) {

        int low = 0;
        int high = A.length - 1;
        int index = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (target > A[mid]) {
                low = mid + 1;
            } else if (target < A[mid]) {
                high = mid - 1;
            } else {
                index = mid;
                if (leftMost) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }

        return index;
    }

    // solution-2
    public int totalOccurrence2(int[]A, int target) {
        // check corner case
        if (A == null || A.length == 0) {
            return 0;
        }

        int firstPos = findFirst(A, target);
        int lastPos = findLast(A, target, firstPos);

        if (firstPos == -1 && lastPos == -1) {
            return 0;
        }

        return lastPos - firstPos + 1;
    }

    // helper methods
    public int findFirst(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start + 1 < end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }

        if (nums[start] == target) {
            return start;
        }

        if (nums[end] == target) {
            return end;
        }

        return -1;
    }

    public int findLast(int[] nums, int target, int start) {
        //check corner case
        if (start == -1) {
            return -1;
        }

        //regular case
        int end = nums.length - 1;

        while (start + 1 < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > target) {
                end = mid;
            } else {
                start = mid;
            }
        }

        if (nums[start] == target) {
            return start;
        }

        if (nums[end] == target) {
            return end;
        }

        return -1;
    }
}
