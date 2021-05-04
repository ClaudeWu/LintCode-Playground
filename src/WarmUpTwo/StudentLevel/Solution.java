package WarmUpTwo.StudentLevel;

/**
 * LintCode 218.Student Level
 * Link: https://www.lintcode.com/problem/218/
 *
 * Two public attributes name(string) and score(int).
 * A constructor expect a name as a parameter.
 * A method getLevel to get the level(char) of the student.
 * score - level table:
 *
 * A: score >= 90
 * B: score >= 80 and < 90
 * C: score >= 60 and < 80
 * D: score < 60
 *
 * Java:
 *     Student student = new Student("Zuck");
 *     student.score = 10;
 *     student.getLevel(); // should be 'D'
 *     student.score = 60;
 *     student.getLevel(); // should be 'C'
 *
 * Python:
 *     student = Student("Zuck")
 *     student.score = 10
 *     student.getLevel() # should be 'D'
 *     student.score = 60
 *     student.getLevel() # should be 'C'
 *
 */

public class Solution {
    /**
     * Declare two public attributes name(string) and score(int).
     */
    public String name;
    public Integer score;

    /**
     * Declare a constructor expect a name as a parameter.
     */
    public Solution(String name) {
        this.name = name;
    }

    /**
     * Declare a public method `getLevel` to get the level(char) of this student.
     */
    public char getLevel() {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 60) {
            return 'C';
        } else {
            return 'D';
        }
    }
}
