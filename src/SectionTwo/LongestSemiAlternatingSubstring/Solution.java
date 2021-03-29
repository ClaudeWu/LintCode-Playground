package SectionTwo.LongestSemiAlternatingSubstring;

/**
 * LintCode 1819. Longest Semi Alternating Substring
 *
 * You are given a string SS of length NN containing only characters a and b.
 * A substring (contiguous fragment) of SS is called a semi-alternating substring
 * if it does not contain three identical consecutive characters.
 * In other words, it does not contain either aaa or bbb substrings.
 * Note that whole SS is its own substring.
 *
 * Example 1
 *  Input: "baaabbabbb"
 *  Output: 7
 *  Explanation: "aabbabb" is the longest semi-alternating substring.
 *
 * Example 2
 *  Input: "babba"
 *  Output: 5
 *  Explanation: Whole S is semi-alternating.
 *
 * Example 3
 *  Input: "abaaaa"
 *  Output: 4
 *  Explanation: "abaa" is the longest semi-alternating substring.
 *
 *  思路: 1. 设置双指针，i记录substring的头部, j记录substring的尾部
 *       2. 检测j - 2 与 j的string是否相等
 *       3. 当string为三次重复的时候，将i移动到j的前一个位置
 *
 * time complex: O(n)
 *
 */

public class Solution {
    /**
     * @param s: the string
     * @return: length of longest semi alternating substring
     */
    public int longestSemiAlternatingSubstring(String s) {
        // corner case
        if (s == null || s.length() == 0) {
            return 0;
        }

        if (s.length() < 3) {
            return 0;
        }

        // initialization
        int res = 0, count = 1;

        // regular case
        for (int i = 0, j = 0; j < s.length(); j++) {
            if (j > 0 && s.charAt(j) == s.charAt(j - 1)) {
                count++;
            } else {
                count = 1;
            }

            if (count == 3) {
                i = j - 1;
                count = 2;
            }

            // update res
            res = Math.max(res, j - i + 1);
        }

        return res;
    }
}
