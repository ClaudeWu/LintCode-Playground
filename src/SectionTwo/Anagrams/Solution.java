package SectionTwo.Anagrams;

/**
 * LintCode 171. Anagrams
 *
 * Given an array of strings, return all groups of strings that are anagrams.
 *
 * Example 1:
 *  Input:["lint", "intl", "inlt", "code"]
 *  Output:["lint", "inlt", "intl"]
 *
 * Example 2:
 *  Input:["ab", "ba", "cd", "dc", "e"]
 *  Output: ["ab", "ba", "cd", "dc"]
 *
 * Two strings are anagram if they can be the same after change the order of characters.
 * All inputs will be in lower-case
 *
 * URL: https://www.lintcode.com/problem/171
 */
/**
 * 思路：
 * 1. 初始化一个Hash Map来储存list中的每种String以及相对应的Key
 * 2. 将每个String转换为char, 然后用sort()后获得的key来分类
 * 3. 判断Map中是包含每种String映射的Key, 若有则使用get抓取
 * 4. 将每种String以及对应的Key放入Map
 * 5. 使用Value()获取Map中的每组String, 返回符合条件的list
 */

import java.util.*;

public class Solution {
    public List<String> anagrams(String[] strs) {
        // define a list for store result
        List<String> res = new ArrayList<String>();

        // define a Hash Map for String classification
        Map<String, List<String>> map = new HashMap<>();

        // check corner case
        if (strs == null || strs.length == 0) {
            return res;
        }

        // traverse each string
        for (String str: strs) {

            // sort each string for mapping keys
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);

            // define a list for store all strings
            List<String> temp = new ArrayList<>();

            // check if map contains mapping keys
            if (map.containsKey(sortedStr)) {
                temp = map.get(sortedStr);
            }

            if (!map.containsKey(sortedStr)) {
                temp = new ArrayList<>();
            }

            // add strings and mapping keys into map
            temp.add(str);
            map.put(sortedStr, temp);
        }

        // remove words that only have one
        for (List<String> list: map.values()) {
            if (list.size() > 1) {
                res.addAll(list);
            }
        }

        // result
        return res;
    }
}
