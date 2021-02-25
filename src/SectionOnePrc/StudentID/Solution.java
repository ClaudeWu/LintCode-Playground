package SectionOnePrc.StudentID;

/*
 * LintCode 455. Student ID
 * Implement a class Class with the following attributes and methods:
 * A public attribute students which is a array of Student instances.
 * A constructor with a parameter n, which is the total number of students in this class. The constructor should create n Student instances and initialized with student id from 0 ~ n-1
 */
class Student {
    public int id;

    public Student(int id) {
        this.id = id;
    }
}

public class Solution {
    /**
     * Declare a public attribute `students` which is an array of `Student`
     * instances
     */
    public Student[] students;

    /**
     * Declare a constructor with a parameter n which is the total number of
     * students in the *class*. The constructor should create n Student
     * instances and initialized with student id from 0 ~ n-1
     */
    public Solution(int n) {
        // check corner case
        if (n < 0) {
            return;
        }

        this.students = new Student[n];
        for(int i = 0; i < n; i++) {
            this.students[i] = new Student(i);
        }
    }
}

