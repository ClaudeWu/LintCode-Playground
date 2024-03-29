package String.ReverseWordsInAString;

import java.util.ArrayList;
import java.util.List;

/**
 * LintCode 53.Reverse Words in a String
 * Link: https://www.lintcode.com/problem/53/
 * LeetCode 151.Reverse Words in a String
 * Link: https://leetcode.com/problems/reverse-words-in-a-string/
 *
 * Given an input string s, reverse the order of the words.
 * A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
 * Return a string of the words in reverse order concatenated by a single space.
 * Note that s may contain leading or trailing spaces or multiple spaces between two words.
 * The returned string should only have a single space separating the words. Do not include any extra spaces.
 *
 * Example 1:
 * Input: s = "the sky is blue"
 * Output: "blue is sky the"
 *
 * Example 2:
 * Input: s = "  hello world  "
 * Output: "world hello"
 * Explanation: Your reversed string should not contain leading or trailing spaces.
 *
 * Example 3:
 * Input: s = "a good   example"
 * Output: "example good a"
 * Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 *
 * Example 4:
 * Input: s = "  Bob    Loves  Alice   "
 * Output: "Alice Loves Bob"
 *
 * Example 5:
 * Input: s = "Alice does not even like bob"
 * Output: "bob like even not does Alice"
 *
 */

public class Solution {
    /*
     * @param s: A string
     * @return: A string
     */
    private final String SPARATOR = " ";

    public String reverseWords(String s) {
        // write your code here
        if (s == null || s.length() == 0 || s.isEmpty()) {
            return s;
        }

        String[] tokens = s.split(SPARATOR);
        int size = tokens.length;
        List<String> reversed = new ArrayList<String>();

        for (String token: tokens) {

            if (token == SPARATOR || token.isEmpty()) {
                continue;
            }

            reversed.add(0, token);
        }

        return String.join(SPARATOR, reversed);
    }
}
