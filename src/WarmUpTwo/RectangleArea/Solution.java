package WarmUpTwo.RectangleArea;

/**
 * LintCode 454.Rectangle Area
 * Link:  https://www.lintcode.com/problem/454/
 *
 * Implement a Rectangle class which include the following attributes and methods:
 * 1. Two public attributes width and height.
 * 2. A constructor which expects two parameters width and height of type int.
 * 3. A method getArea which would calculate the size of the rectangle and return.
 *
 * Example1:
 * Java:
 *     Rectangle rec = new Rectangle(3, 4);
 *     rec.getArea(); // should get 12，3*4=12
 *
 * Python:
 *     rec = Rectangle(3, 4)
 *     rec.getArea()
 *
 * Example2:
 * Java:
 *     Rectangle rec = new Rectangle(4, 4);
 *     rec.getArea(); // should get 16，4*4=16
 *
 * Python:
 *     rec = Rectangle(4, 4)
 *     rec.getArea()
 *
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
