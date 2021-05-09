package Tree.WoodCut;

public class Main {
    public static void main(String[] args) {

        int[] test1 = {232, 124, 456};
        int[] test2 = {1, 2, 3};

        int k1 = 7;
        int k2 = 7;

        Solution s = new Solution();

        System.out.println(s.woodCut(test1, k1));
        System.out.println(s.woodCut(test2, k2));
    }
}
