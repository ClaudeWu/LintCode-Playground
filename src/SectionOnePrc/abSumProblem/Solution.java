package SectionOnePrc.abSumProblem;

public class Solution {
    /**
     * @param a: An integer
     * @param b: An integer
     * @return: The sum of a and b
     */
    public int aplusb(int a, int b) {
        // without return a + b
        if (b > 0) {
            while (b >0) {
                a++;
                b--;
            }
        }
        // for negative number
        if (b < 0) {
            while (b < 0) {
                a--;
                b++;
            }
        }

        return a;
    }
}
