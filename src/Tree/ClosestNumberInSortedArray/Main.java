package Tree.ClosestNumberInSortedArray;

public class Main {
    public static void main(String[] args) {

        int[] test1 = {1, 2, 3};
        int[] test2 = {1, 4, 6};
        int[] test3 = {1, 4, 6};

        int target1 = 2;
        int target2 = 3;
        int target3 = 5;

        Solution s = new Solution();

        System.out.println(s.closestNumber(test1, target1));
        System.out.println(s.closestNumber(test2, target2));
        System.out.println(s.closestNumber(test3, target3));

        System.out.println(s.closestNumber2(test1, target1));
        System.out.println(s.closestNumber2(test2, target2));
        System.out.println(s.closestNumber2(test3, target3));

    }
}
