package Tree.SearchInRotatedSortedArray;

public class Main {
    public static void main(String[] args) {

        Solution s = new Solution();

        int[] test1 = {4, 5, 1, 2, 3};
        int[] test2 = {4, 5, 1, 2, 3};

        System.out.println(s.search(test1, 1));
        System.out.println(s.search(test2, 0));
    }
}
