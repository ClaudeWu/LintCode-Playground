package SectionOnePrc.JumpGame;

/*
 * LintCode 116. Jump Game
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.
 * Each element in the array represents your maximum jump length at that position.
 * Determine if you are able to reach the last index.
 *
 * Example 1
 *      Input : [2,3,1,1,4]
 *      Output : true
 *
 * Example 2
 *      Input : [3,2,1,0,4]
 *      Output : false
 *
 * URL: https://www.lintcode.com/problem/jump-game
 */

/*
 * 思路：
 * 1. 设置一个指针判断其index的值是否满足到达数组中最后一位及A.length - 1
 * 2. 在第一个指针前设置第二个指针判断其index的值是否为true以及否满足大于或等于i - j的差
 */
public class Solution {
    /**
     * @param A: A list of integers
     * @return: A boolean
     */
    public boolean canJump(int[] A) {

        // check corner case
        if (A.length == 0 || A.length == 1) {
            return true;
        }

        if (A == null) {
            return true;
        }

        // definition
        int size = A.length;
        boolean[] dp = new boolean[size];
        dp[0] = true;

        // computing
        for (int i = 1; i < size; i++) {
            dp[i] = false;
            for(int j = 0; j < i; j++) {
                if(dp[j] && A[j] >= i - j) {
                    dp[i] = true;
                }
            }
        }

        // result
        return dp[size - 1];
    }
}
