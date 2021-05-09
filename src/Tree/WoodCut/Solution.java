package Tree.WoodCut;

/**
 * LintCode 183.Wood Cut
 * URL: https://www.lintcode.com/problem/183/
 *
 * Given n pieces of wood with length L[i] (integer array).
 * Cut them into small pieces to guarantee you could have equal or more than k pieces with the same length.
 * What is the longest length you can get from the n pieces of wood? Given L & k,
 * return the maximum length of the small pieces.
 *
 * The unit of length is centimeter.The length of the woods are all positive integers,
 * you couldn't cut wood into float length.If you couldn't get >= k pieces, return 0.
 *
 * Example 1:
 *  Input: L = [232, 124, 456], k = 7
 *  Output: 114
 *  Explanation: We can cut it into 7 pieces if any piece is 114cm long,
 *               however we can't cut it into 7 pieces if any piece is 115cm long.
 *
 * Example 2:
 *  Input: L = [1, 2, 3], k = 7
 *  Output: 0
 *  Explanation: It is obvious we can't make it.
 *
 * Challenge
 *  O(n log Len), where Len is the longest length of the wood.
 *
 */

public class Solution {
    /**
     * @param L: Given n pieces of wood with length L[i]
     * @param k: An integer
     * @return: The maximum length of the small pieces
     */
    public int woodCut(int[] L, int k) {
        // check corner case
        if (L == null || L.length == 0) {
            return 0;
        }

        int start = 1;
        int end = 0;
        int res = 0;

        for (int l : L) {
            end = Math.max(end, l);
        }

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (calculator(L, mid) >= k) {
                res = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return res;
    }

    private int calculator (int[] L, int length) {

        int sum = 0;

        for (int l : L) {
            sum += l / length;
        }

        return sum;
    }
}
