package SectionTwo.AddBoldTagInString;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        String string1 = "abcxyz123";
        String[] dict1 = {"abc","123"};

        System.out.println(s.addBoldTag(string1, dict1));
    }
}
