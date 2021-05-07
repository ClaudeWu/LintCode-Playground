package Tree.LastPositionOfTarget;

/**
 * LintCode 458.Last Position of Target
 * URL: https://www.lintcode.com/problem/458/
 *
 * Find the last position of a target number in a sorted array.
 * Return -1 if target does not exist.
 *
 * Example 1:
 *  Input: nums = [1,2,2,4,5,5], target = 2
 *  Output: 2
 *
 * Example 2:
 *  Input: nums = [1,2,2,4,5,5], target = 6
 *  Output: -1
 *
 */

public class Solution {
    /**
     * @param nums: An integer array sorted in ascending order
     * @param target: An integer
     * @return: An integer
     */
    public int lastPosition(int[] nums, int target) {
        // write your code here
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int lastPos = findLast(nums, target);

        return lastPos;
    }

    public int findLast(int[] nums, int target) {

        int index = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

            if (nums[mid] == target) {
                index = mid;
            }
        }
        return index;
    }
}
