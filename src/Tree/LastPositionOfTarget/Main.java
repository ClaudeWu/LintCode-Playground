package Tree.LastPositionOfTarget;

public class Main {
    public static void main(String[] args) {

        int[] test1 = {1,2,2,4,5,5};
        int[] test2 = {1,2,2,4,5,5};

        int target1 = 2;
        int target2 = 6;

        Solution s = new Solution();

        System.out.println(s.lastPosition(test1, target1));
        System.out.println(s.lastPosition(test2, target2));
    }
}
