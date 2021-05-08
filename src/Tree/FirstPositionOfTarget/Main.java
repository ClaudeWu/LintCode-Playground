package Tree.FirstPositionOfTarget;

public class Main {
    public static void main(String[] args) {

        int[] test1 = {1,4,4,5,7,7,8,9,9,10};
        int[] test2 = {1, 2, 3, 3, 4, 5, 10};
        int[] test3 = {1, 2, 3, 3, 4, 5, 10};

        int target1 = 1;
        int target2 = 3;
        int target3 = 6;

        Solution s = new Solution();

        System.out.println(s.binarySearch(test1, target1));
        System.out.println(s.binarySearch(test2, target2));
        System.out.println(s.binarySearch(test3, target3));
    }
}
