package SectionOnePrc.SimpleCalculator;

/*
 * LintCode 478. Simple Calculator
 * Given two integers a and b, an operator, choices:
 *          +, -, *, /
 * Calculate a <operator> b.
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
