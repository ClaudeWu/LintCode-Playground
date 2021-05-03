package WarmUpTwo.Fibonacci;

/*
 * LintCode 366.Fibonacci
 * Link: https://www.lintcode.com/problem/fibonacci/
 *
 * Find the Nth number in Fibonacci sequence.
 * A Fibonacci sequence is defined as follow:
 * The first two numbers are 0 and 1.
 * The i th number is the sum of i-1 th number and i-2 th number.
 * The first ten numbers in Fibonacci sequence is:
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 ...n m
 *
 * Example 1:
 *  Input:  1
 *  Output: 0
 *  Explanation: return the first number in  Fibonacci sequence
 *
 * Example 2:
 *  Input:  2
 *  Output: 1
 *  Explanation: return the second number in  Fibonacci sequence
 *
 */

import java.util.Arrays;

public class Solution {

    // solution-1
    public int solution1(int n) {
        // check corner case
        if (n == 1) {
            return 0;
        }

        if (n == 2) {
            return 1;
        }

        // definition
        int dp[] = new int[n];

        // initialization
        Arrays.fill(dp, 0);

        // computing
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        // result
        return dp[n - 1];
    }

    // solution-2
    public int solution2(int n) {

        if (n <= 1) {
            return 0;
        }

        int a = 0, b = 1;

        for (int i = 0; i < n - 1; i++) {
            int c = a + b;
            a = b;
            b = c;
        }

        return a;
    }

    // solution-3
    public int solution3(int n) {

        int[] fib = new int[n + 2];
        int i;
        fib[0] = 0;
        fib[1] = 1;

        for (i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib[n - 1];
    }
}
