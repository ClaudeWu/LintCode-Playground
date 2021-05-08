package Tree.FirstPositionOfTarget;

/**
 * LintCode 14.First Position of Target
 * URL: https://www.lintcode.com/problem/14/
 *
 * Given a sorted array (ascending order) and a target number,
 * find the first index of this number in O(log n)O(logn) time complexity.
 * If the target number does not exist in the array, return -1..
 *
 * Example 1:
 *  Input: tuple = [1,4,4,5,7,7,8,9,9,10], target = 1
 *  Output: 0
 *  Explanation: The first index of 1 is 0.
 *
 * Example 2:
 *  Input: tuple = [1, 2, 3, 3, 4, 5, 10], target = 3
 *  Output: 2
 *  Explanation: The first index of 3 is 2.
 *
 * Example 3:
 *  Input: tuple = [1, 2, 3, 3, 4, 5, 10], target = 6
 *  Output: -1
 *  Explanation: There is no 6 in the array，return -1
 *
 * Challenge
 *  If the count of numbers is bigger than 2^32, can your code work properly?
 *
 */

public class Solution {
    /**
     * @param nums: The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public int binarySearch(int[] nums, int target) {
        // write your code here
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int start = 0;
        int end = nums.length - 1;

        while (start + 1 < end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] < target) {
                start = mid;
            } else if (nums[mid] > target) {
                end = mid;
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
}
