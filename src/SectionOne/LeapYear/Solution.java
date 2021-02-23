package SectionOne.LeapYear;

public class Solution {
    public boolean solution1(int n) {
        // check corner case
        if(n <= 1583) {
            return false;
        }

        return (n % 4 == 0 && n % 100 != 0 || n % 400 == 0);
    }

    public boolean solution2(int n) {
        // check corner case
        if(n <= 1583) {
            return false;
        }

        if(n % 4 == 0 && n % 100 != 0) {
            return true;
        }

        if(n % 400 == 0) {
            return true;
        }
        return false;
    }
}
