package WarmUp.LeapYear;

/**
 * LintCode 766.Leap Year
 * Link: https://www.lintcode.com/problem/leap-year/
 *
 * Determine whether year n is a leap year.return true if n is a leap year.
 *
 * A leap year (also known as an intercalary year or bissextile year) is a calendar year containing one additional day.
 * if a year is divisible by 4 and not divisible by 100 or divisible by 400,it is a leap year.
 *                                                                                                     --wikipedia
 *
 * Example 1:
 *  Input : n = 2008
 *  Output : true
 *
 * Example 2:
 *  Input : n = 2018
 *  Output : false
 *
 */

public class Solution {
    public boolean solution1(int n) {
        // check corner case
        if(n <= 1583) {
            return false;
        }

        return (n % 4 == 0 && n % 100 != 0 || n % 400 == 0);
    }
}
