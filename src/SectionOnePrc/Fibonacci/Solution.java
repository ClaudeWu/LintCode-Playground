package SectionOnePrc.Fibonacci;

/*
 * LintCode 366. Fibonacci
 * Find the Nth number in Fibonacci sequence.
 * A Fibonacci sequence is defined as follow:
 * The first two numbers are 0 and 1.
 * The i th number is the sum of i-1 th number and i-2 th number.
 * The first ten numbers in Fibonacci sequence is:
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 ...
 */

public class Solution {
    public int solution1(int n) {
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

    public int solution2(int n) {
        if (n <= 1) {
            return 0;
        }

        if (n == 2) {
            return 1;
        }
        return solution2(n - 1) + solution2(n - 2);
    }

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
