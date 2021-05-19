package Tree.FindKClosestElements;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Solution s = new Solution();
        Solution2 s2 = new Solution2();

        int[] test1 = {1, 2, 3};
        int[] test2 = {1, 4, 6, 8};

        int[] result1 = s.kClosestNumbers(test1, 2, 3);
        int[] result2 = s.kClosestNumbers(test2, 3, 3);
        int[] result3 = s2.kClosestNumbers(test1, 2, 3);
        int[] result4 = s2.kClosestNumbers(test2, 3, 3);

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
        System.out.println(Arrays.toString(result3));
        System.out.println(Arrays.toString(result4));

    }
}
