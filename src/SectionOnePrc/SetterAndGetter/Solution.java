package SectionOnePrc.SetterAndGetter;

/*
 * LintCode
 * Implement a class School, including the following attributes and methods:
 * A private attribute name of type string.
 * A setter method setName which expect a parameter name of type string.
 * A getter method getName which expect no parameter and return the name of the school.
 */

public class Solution {
    /*
     * Declare a private attribute *name* of type string.
     */
    // write your code here
    private String name;

    /**
     * Declare a setter method `setName` which expect a parameter *name*.
     */
    // write your code here
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Declare a getter method `getName` which expect no parameter and return
     * the name of this school
     */
    // write your code here
    public String getName() {
        return this.name;
    }
}
