/**
 * lintCode 1127. Add Bold Tag in String
 *
 * Given a string s and a list of strings dict,
 * you need to add a closed pair of bold tag and to wrap the substrings in s that exist in dict.
 * If two such substrings overlap, you need to wrap them together by only one pair of closed bold tag.
 * Also, if two substrings wrapped by bold tags are consecutive, you need to combine them.
 *
 * Example
 *  Input:
 *      s = "abcxyz123"
 *      dict = ["abc","123"]
 *  Output:
 *      "<b>abc</b>xyz<b>123</b>"
 *  Input:
 *      s = "aaabbcc"
 *      dict = ["aaa","aab","bc"]
 *  Output:
 *      "<b>aaabbc</b>c"
 */
/**
 *  思路: 1. 设置一个boolean来判断s是否在dict数组中, 如果存在则遍历s
 *       2. 遍历的每一个string当作起始位置, 如果能够匹配则用string.length()来更新string的长度
 *       3. 如果start小于end则将bold[start]赋值true
 *       4. 用while找出连续为true的个数然后在string的左右两遍加上<b></b>
 */
package SectionTwo.AddBoldTagInString;

public class Solution {
    /**
     * @param s: a string
     * @param dict: a list of strings
     * @return: return a string
     */
    public String addBoldTag(String s, String[] dict) {
        // definition
        int size = s.length();
        boolean[] bold = new boolean[size];

        // corner case
        if (s == null || dict == null) {
            return s;
        }

        if (size == 0 || dict.length == 0) {
            return s;
        }

        // bold checker
        for (int start = 0, end = 0; start < size; start++) {
            for (String string: dict) {
                if (!s.startsWith(string, start)) {
                    continue;
                }

                end = Math.max(end, start + string.length());
            }
            bold[start] = end > start;
        }

        // definition
        StringBuilder res = new StringBuilder();

        // normal case
        for (int i = 0; i < size; i++) {
            if (!bold[i]) {
                res.append(s.charAt(i));
                continue;
            }

            int j = i;
            while (j < size && bold[j]) {
                j++;
            }

            res.append("<b>" + s.substring(i , j) + "</b>");
            i = j - 1;
        }

        return res.toString();
    }
}
