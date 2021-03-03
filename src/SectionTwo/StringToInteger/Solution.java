package SectionTwo.StringToInteger;
/*
 * LintCode 241. String to Integer
 * Given a string, convert it to an integer.
 * You may assume the string is a valid integer number
 * that can be presented by a signed 32bit integer (-231 ~ 231-1).
 *
 *
 * Example 1:
 *  Input:  "123"
 *  Output: 123
 * Explanation:
 * return the Integer.
 *
 * Example 2:
 *  Input:  "2"
 *  Output: 2
 * Explanation:
 * return the Integer.
 *
 * URL: https://www.lintcode.com/problem/241
 */
/*
 * 思路: 1. 设置一个boolean判断input里的 - 号
 *      2. 如果第一个cahr是 - 号则取出后负号以后的string
 *      3. 将取出的string转化为integer
 *      4. 如为负数则将其转成负数
 */
public class Solution {
    /**
     * @param target: A string
     * @return: An integer
     */
    public int stringToInteger(String target) {
        // definition
        int res = 0;

        // check corner case
        if (target.isEmpty() || target == null) {
            return res;
        }

        // remove empty string from start and end
        target.trim();

        // Negative checker
        boolean isNegative = false;

        // if the first char is '-', set checker to true
        if (target.charAt(0) == '-') {
            isNegative = true;
            // remove '-'
            target = target.substring(1);
        }

        // convert each char to integer
        for (int i = 0; i < target.length(); i++) {
            res = res * 10 + (target.charAt(i) - '0');
        }

        // set to negative
        if (isNegative) {
            res = -res;
        }

        // result
        return res;
    }
}
