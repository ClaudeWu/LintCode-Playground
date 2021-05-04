package String.CapitalizesTheFirstLetter;

/**
 * LintCode: 936.Capitalizes The First Letter
 * Link: https://www.lintcode.com/problem/capitalizes-the-first-letter/
 *
 * Given a sentence of English, update the first letter of each word to uppercase.
 * The given sentence may not be a grammatical sentence.
 * The length of the sentence does not exceed 100.
 *
 * Example 1:
 *  Input: s =  "i want to get an accepted"
 *  Output: "I Want To Get An Accepted"
 *
 * Example 2:
 *  Input: s =  "i jidls    mdijf  i  lsidj  i p l   "
 *  Output: "I Jidls    Mdijf  I  Lsidj  I P L   "
 *
 */

public class Solution {
    public String capitalizesFirst(String s) {
        // Write your code here
        if (s == null || s.isEmpty()) {
            return s;
        }

        StringBuilder sb = new StringBuilder();
        int size = s.length();
        boolean isCap = true;

        for (int i = 0; i < size; i++) {

            char letter = s.charAt(i);

            if (letter == ' ') {
                isCap = true;
                sb.append(letter);
                continue;
            }

            if (isCap) {
                char newChar = Character.toUpperCase(letter);
                sb.append(newChar);
                isCap = false;
                continue;
            }

            sb.append(letter);
        }

        return sb.toString();
    }
}
