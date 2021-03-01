package SectionTwo.ReverseWords;

import java.util.*;

/*
 * LintCode 53. Reverse Words in a String
 * Given an input string, reverse the string word by word.
 *
 * Example 1:
 *  Input:  "the sky is blue"
 *  Output:  "blue is sky the"
 *
 * Explanation:
 * return a reverse the string word by word.
 *
 * Example 2:
 *  Input:  "hello world"
 *  Output:  "world hello"
 *
 * Explanation:
 * return a reverse the string word by word.
 *
 * URL: https://www.lintcode.com/problem/53/solution
 *
 * 思路: 1. 用split将每个单词分割
 *      2. 初始化一个list将分割的单词储存
 *      3. return结果的时候同时在每个单词之间插入" "
 *
 */

public class Solution {
    /*
     * @param s: A string
     * @return: A string
     */
    private final String SEPARATOR = " ";

    public String reverseWords1(String s) {

        // check corner case
        if (s == null || s.length() == 1 || s.isEmpty()) {
            return s;
        }

        // initialization
        String tokens[] = s.split(SEPARATOR);
        List<String> reversed = new ArrayList<String>();

        // regular case
        for (int i = tokens.length - 1; i >= 0; i--) {
            if (!tokens[i].equals("")) {
                reversed.add(tokens[i]);
            }
        }

        // result
        return String.join(SEPARATOR, reversed);
    }
}
