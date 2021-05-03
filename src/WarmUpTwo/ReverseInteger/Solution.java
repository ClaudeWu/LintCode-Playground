package WarmUpTwo.ReverseInteger;

/*
 * LintCode 413.Reverse Integer
 * Link: https://www.lintcode.com/problem/413/
 * LeetCode 7.Reverse Integer
 * Link: https://leetcode.com/problems/reverse-integer/
 *
 * Reverse digits of an integer.
 * Returns 0 when the reversed integer overflows (signed 32-bit integer).
 *
 * Example 1:
 *      Input: 123
 *      Output: 321
 * Example 2:
 *      Input: -123
 *      Output: -321
 *
 */

public class Solution {
    /**
     * @param n: the integer to be reversed
     * @return: the reversed integer
     *
     * Solution1 will be over flow when n = 1534236469
     * Cannot convert String "9646324351" to int
     */

    // solution-1 String Builder
    public int solution1(int n) {

        String nums = String.valueOf(n);
        char[] chars = nums.toCharArray();
        StringBuilder sb = new StringBuilder();
        int realnum  = 0;

        if (n > 0) {

            for (int i = chars.length - 1; i >= 0; i--) {
                sb.append(chars[i]);
            }

            realnum = Integer.parseInt(sb.toString());
        }

        if(n < 0) {

            for (int i = chars.length - 1; i >= 0; i--) {
                sb.append(chars[i]);
            }

            sb.deleteCharAt(sb.length() - 1);
            realnum = Integer.parseInt(sb.toString()) * -1;
        }

        return realnum;
    }

    // solution-2 Module
    public int solution2(int n) {

        int reversNum = 0;

        while (n != 0) {

            int temp = reversNum * 10 + n % 10;
            n /= 10;

            // check if the number is 32-bit
            if(temp / 10 != reversNum) {
                reversNum = 0;
                break;
            }

            reversNum = temp;
        }

        return reversNum;
    }
}
