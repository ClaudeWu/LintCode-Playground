package WarmUpTwo.SimpleCalculator;

/**
 * LintCode 478.Simple Calculator
 * Link: https://www.lintcode.com/problem/478/
 *
 * Given two integers a and b, an operator, choices:
 *   +, -, *, /
 * Calculate a <operator> b.
 *
 * Example 1:
 * 	Input:  a = 1, b = 2, operator = +
 * 	Output: 3
 *
 * 	Explanation:
 * 	return the result of : 1 + 2.
 *
 * Example 2:
 * 	Input:  a = 10, b = 20, operator = *
 * 	Output: 200
 *
 * 	Explanation:
 * 	return the result of: 10 * 20.
 *
 * Example 3:
 * 	Input:  a = 3, b = 2, operator = /
 * 	Output: 1
 *
 * 	Explanation:
 * 	return the result of: 3 / 2.
 *
 * Example 4:
 * 	Input:  a = 10, b = 11, operator = -
 * 	Output: -1
 *
 * 	Explanation:
 * 	return the result of: 10 - 11.
 *
 */

public class Solution {
    /**
     * @param a: An integer
     * @param operator: A character, +, -, *, /.
     * @param b: An integer
     * @return: The result
     */
    public int calculate(int a, char operator, int b) {
        // write your code here
        int res = 0;

        switch (operator) {

            case '+': {
                res = a + b;
                break;
            }

            case '-': {
                res = a - b;
                break;
            }

            case '*': {
                res = a * b;
                break;
            }

            case '/': {
                res = a / b;
                break;
            }
        }

        return res;
    }
}
