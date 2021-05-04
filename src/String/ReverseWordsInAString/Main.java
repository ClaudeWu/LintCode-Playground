package String.ReverseWordsInAString;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        String test1 = "the sky is blue";
        String test2 = "hello world";

        System.out.println(s.reverseWords(test1));
        System.out.println(s.reverseWords(test2));
    }
}
