package Tree.FindPeakElement;

public class Main {
    public static void main(String[] args) {

        int[] test1 = {1, 2, 1, 3, 4, 5, 7, 6};
        int[] test2 = {1, 2, 3, 4, 1};

        Solution s = new Solution();

        System.out.println(s.findPeak(test1));
        System.out.println(s.findPeak(test2));
        System.out.println(s.findPeak2(test1));
        System.out.println(s.findPeak2(test2));
    }
}
