package WarmUp.SwapTwoIntegersInArray;

/**
 * LintCode 484.Swap Two Integers in Array
 * Link: https://www.lintcode.com/problem/swap-two-integers-in-array/
 *
 * Given an array and two indexes, swap the integers on the two indices.
 *
 * Example 1:
 *  Input: `[1,2,3,4]` and index1 = `2`, index2 = `3`
 *  Output: `[1,2,4,3]`
 *  Explanation: You don't need return anything, just swap the integers in-place.
 *
 * Example 2:
 *  Input: `[1,2,2,2]` and index1 = `0`, index2 = `3`
 *  Output:`[2,2,2,1]`
 *  Explanation: You don't need return anything, just swap the integers in-place.
 *
 */

public class Solution {
    /**
     * @param A : An integer array
     * @param index1 : the first index
     * @param index2 : the second index
     * @return: nothing
     */
    public void solution1(int[] A, int index1, int index2) {
        // check corner case
        if (A == null || A.length == 0) {
            return;
        }
        // check corner case
        if (index1 < 0 || index1 >= A.length ||
            index2 < 0 || index2 >= A.length) {
            return;
        }

        int temp = A[index1];
        A[index1] = A[index2];
        A[index2] = temp;
    }
}
