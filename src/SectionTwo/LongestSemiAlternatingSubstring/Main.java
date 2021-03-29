package SectionTwo.LongestSemiAlternatingSubstring;

public class Main {
    public static void main(String[] args) {

        Solution s = new Solution();

        String test1 = "baaabbabbb";
        String test2 = "babba";
        String test3 = "abaaaa";

        System.out.println(s.longestSemiAlternatingSubstring(test1));
        System.out.println(s.longestSemiAlternatingSubstring(test2));
        System.out.println(s.longestSemiAlternatingSubstring(test3));
    }
}
