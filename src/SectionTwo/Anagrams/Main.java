package SectionTwo.Anagrams;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        String[] test1 = {"lint", "intl", "inlt", "code"};
        String[] test2 = {"ab", "ba", "cd", "dc", "e"};

        System.out.println(s.anagrams(test1));
        System.out.println(s.anagrams(test2));
    }
}
