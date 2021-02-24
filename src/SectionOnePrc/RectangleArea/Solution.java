package SectionOnePrc.RectangleArea;

/*
 * LintCode 454. Rectangle Area
 * Implement a Rectangle class which include the following attributes and methods:
 * 1. Two public attributes width and height.
 * 2. A constructor which expects two parameters width and height of type int.
 * 3. A method getArea which would calculate the size of the rectangle and return.
 */

public class Solution {
    /*
     * Define two public attributes width and height of type int.
     */
    public int width, height;

    /*
     * Define a constructor which expects two parameters width and height here.
     */
    public Solution(int width, int height) {
        this.width = width;
        this.height = height;
    }

    /*
     * Define a public method `getArea` which can calculate the area of the
     * rectangle and return.
     */
    public int getArea() {
        if (this.width >= 0 && this.height >= 0) {
            return this.width * this.height;
        }
        return 0;
    }
}
