package WarmUpTwo.abSumProblem;

/*
 * LintCode 1.A + B Problem
 * Link: https://www.lintcode.com/problem/a-b-problem/
 *
 * Write a function that add two numbers a and b, and return the answer as an integer(int).
 * Of course you can just return a + b to get accepted.
 * But Can you challenge not do it like that?(You should not use + or any arithmetic operators.)
 *
 * Example 1:
 *  Input: a = 1 b = 2
 *  Output: 3
 *  Explanation: a + b = 1 + 2 = 3
 *
 * Example 2:
 *  Input: a = -1 b = 1
 *  Output: 0
 *  Explanation: a + b = -1 + 1 = 0
 *
 */

public class Solution {
    /**
     * @param a: An integer
     * @param b: An integer
     * @return: The sum of a and b
     */
    public int aplusb(int a, int b) {
        // without return a + b
        if (b > 0) {
            while (b >0) {
                a++;
                b--;
            }
        }
        // for negative number
        if (b < 0) {
            while (b < 0) {
                a--;
                b++;
            }
        }

        return a;
    }
}
