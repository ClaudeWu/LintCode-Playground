package SectionOnePrc.RootOfEquation;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String test1 = Arrays.toString(s.rootOfEquation(1.0, -2.0, 1.0));
        String test2 = Arrays.toString(s.rootOfEquation(1.0, 8.0, 15.0));
        String test3= Arrays.toString(s.rootOfEquation(-4.0, 56.0, 288.0));
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
    }
}
