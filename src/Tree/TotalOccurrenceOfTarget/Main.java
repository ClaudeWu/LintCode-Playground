package Tree.TotalOccurrenceOfTarget;

public class Main {
    public static void main(String[] args) {
        int[] test1 = {1, 3, 3, 4, 5};
        int[] test2 = {2, 2, 3, 4, 6};
        int[] test3 = {1, 2, 3, 4, 5};

        int target1 = 3;
        int target2 = 4;
        int target3 = 6;

        Solution s = new Solution();

        System.out.println(s.totalOccurrence(test1, target1));
        System.out.println(s.totalOccurrence(test2, target2));
        System.out.println(s.totalOccurrence(test3, target3));

        System.out.println(s.totalOccurrence2(test1, target1));
        System.out.println(s.totalOccurrence2(test2, target2));
        System.out.println(s.totalOccurrence2(test3, target3));
    }
}
