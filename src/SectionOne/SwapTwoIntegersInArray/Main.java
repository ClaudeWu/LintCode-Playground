package SectionOne.SwapTwoIntegersInArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] A = {1,2,3,4};
        int[] B = {1,2,2,2};

        s.solution1(A,2, 3);
        s.solution1(B,0, 3);

        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
    }
}
