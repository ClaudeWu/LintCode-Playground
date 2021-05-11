package Tree.SearchInABigSortedArray;

/**
 * LintCode 447.Search in a Big Sorted Array
 * URL: https://www.lintcode.com/problem/search-in-a-big-sorted-array/
 *
 * Given a big sorted array with non-negative integers sorted by non-decreasing order.
 * The array is so big so that you can not get the length of the whole array directly,
 * and you can only access the kth number by ArrayReader.get(k) (or ArrayReader->get(k) for C++).
 * Find the first index of a target number. Your algorithm should be in O(log k),
 * where k is the first index of the target number.
 * Return -1, if the number doesn't exist in the array.
 *
 * If you accessed an inaccessible index (outside of the array), ArrayReader.get will return 2,147,483,647.
 *
 * Example 1:
 *  Input: [1, 3, 6, 9, 21, ...], target = 3
 *  Output: 1
 *
 * Example 2:
 *  Input: [1, 3, 6, 9, 21, ...], target = 4
 *  Output: -1
 *
 * Challenge
 *  O(logn) time, n is the first index of the given target num
 *
 */

public class Solution {
    /**
     * @param reader: An instance of ArrayReader.
     * @param target: An integer
     * @return: An integer which is the first index of target.
     */
    public int searchBigSortedArray(ArrayReader reader, int target) {
        // check corner case
        if (reader.get(0) == Integer.MAX_VALUE) {
            return -1;
        }

        if (reader.get(0) > target) {
            return -1;
        }

        if (reader.get(0) == target) {
            return 0;
        }

        // regular case
        int kth = 1;

        while (reader.get(kth - 1) < target) {
            kth *= 2;
        }

        int start = 0;
        int end = kth - 1;

        while (start + 1 < end) {

            int mid = start + (end - start) / 2;

            if (reader.get(mid) < target) {
                start = mid;
            } else {
                end = mid;
            }
        }

        if (reader.get(start) == target) {
            return start;
        }

        if (reader.get(end) == target) {
            return end;
        }

        return -1;
    }
}
