package Tree.SearchA2DMatrix;

public class Main {
    public static void main(String[] args) {

        Solution s = new Solution();

        int[][] test1 = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}};
        int[][] test2 = {{5}};

        System.out.println(s.searchMatrix(test1, 3));
        System.out.println(s.searchMatrix(test2, 2));
    }
}
