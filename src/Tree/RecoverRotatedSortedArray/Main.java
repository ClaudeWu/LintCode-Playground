package Tree.RecoverRotatedSortedArray;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Solution s = new Solution();

        List test1 = Arrays.asList(4,5,1,2,3);
        List test2 = Arrays.asList(6,8,9,1,2);

        s.recoverRotatedSortedArray(test1);
        s.recoverRotatedSortedArray(test2);

        System.out.println(test1.toString());
        System.out.println(test2.toString());
    }
}
