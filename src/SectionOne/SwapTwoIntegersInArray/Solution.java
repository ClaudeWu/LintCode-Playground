package SectionOne.SwapTwoIntegersInArray;

public class Solution {
    /**
     * @param A : An integer array
     * @param index1 : the first index
     * @param index2 : the second index
     * @return: nothing
     */
    public void solution1(int[] A, int index1, int index2) {
        // check corner case
        if (A == null || A.length == 0) {
            return;
        }
        // check corner case
        if (index1 < 0 || index1 >= A.length ||
            index2 < 0 || index2 >= A.length) {
            return;
        }

        int temp = A[index1];
        A[index1] = A[index2];
        A[index2] = temp;
    }

}
