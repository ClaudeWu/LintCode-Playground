package SectionOnePrc.ReverseInteger;

/*
 * LintCode 413. Reverse Integer
 * Reverse digits of an integer.
 * Returns 0 when the reversed integer overflows (signed 32-bit integer).
 *
 * Example 1:
 *      Input: 123
 *      Output: 321
 * Example 2:
 *      Input: -123
 *      Output: -321
 */

public class Solution {
    /**
     * @param n: the integer to be reversed
     * @return: the reversed integer
     *
     * Solution1 will be over flow when n = 1534236469
     * Cannot convert String "9646324351" to int
     */
    public int solution1(int n) {
        // solution with String Builder
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

    public int solution2(int n) {
        // solution with Module
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
