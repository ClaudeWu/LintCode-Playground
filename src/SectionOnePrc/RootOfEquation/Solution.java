package SectionOnePrc.RootOfEquation;

/*
 * Given an equation: ax2 + bx + c = 0. Find the root of the equation.
 * If there are two roots, return a list with two roots in it.
 * If there are only one root, return a list with only one root in it.
 * If there are no root for the given equation, return an empty list.
 *
 *Example 1:
        Input: a = 1, b = -2, c = 1
        Output: [1]
        Explanation:
        The equation has a root and returns to [1].

 * Example 2:
        Input: a = 1, b = -3, c = 2
        Output: [1,2]
        Explanation:
        The equation has two roots, returning [1,2] and the first number should be smaller than the second.
 *
 */

public class Solution {
    /**
     * @param a: parameter of the equation
     * @param b: parameter of the equation
     * @param c: parameter of the equation
     * @return: a double array, contains at most two root
     */
    public double[] rootOfEquation(double a, double b, double c) {
        double determinant = b * b - 4 * a * c;
        // no root if b^2 - 4ac small than 0
        if (determinant < 0) {
            return new double[0];
        }

        // one root if b^2 - 4ac equal 0
        if (determinant == 0) {
            double[] root = new double[1];
            root[0] = -b / (2 * a);
            return root;
        }

        // two roots for b^2 - 4ac grater than 0
        double[] roots = new double[2];
        roots[0] = (-b + Math.sqrt(determinant)) / (a * 2);
        roots[1] = (-b - Math.sqrt(determinant)) / (a * 2);

        // swap results if roots[1] > roots[0]
        if (roots[1] > roots[0]) {
            double temp = roots[0];
            roots[0] = roots[1];
            roots[1] = temp;
        }
        return roots;
    }
}
