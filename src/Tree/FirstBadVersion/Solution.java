package Tree.FirstBadVersion;

/**
 * LintCode 74.First Bad Version
 * URL: https://www.lintcode.com/problem/74
 *
 * The code base version is an integer start from 1 to n. One day, someone committed a bad version in the code case,
 * so it caused this version and the following versions are all failed in the unit tests. Find the first bad version.
 * You can call isBadVersion to help you determine which version is the first bad one.
 * The details interface can be found in the code's annotation part.
 *
 * Please read the annotation in code area to get the correct way to call isBadVersion in different language.
 * For example, Java is SVNRepo.isBadVersion(v)
 *
 * Example:
 *  Input: n = 5, first bad version is 4
 *
 *  Output: 4
 *
 * Explanation: isBadVersion(3) -> false
 *              isBadVersion(5) -> true
 *              isBadVersion(4) -> true
 *              Therefore, it can be determined that the fourth version is the first incorrect version.
 *
 * Challenge
 *  You should call isBadVersion as few as possible.
 *
 */

/**
 * public class SVNRepo {
 *     public static boolean isBadVersion(int k);
 * }
 * you can use SVNRepo.isBadVersion(k) to judge whether
 * the kth code version is bad or not.
 */

public class Solution {
    /**
     * @param n: An integer
     * @return: An integer which is the first bad version.
     */
    public int findFirstBadVersion(int n) {
        // check corner case
        if (n == 0 || n == 1) {
            return n;
        }

        // defnitaion
        int start = 1;
        int end = n;

        // check regualr case
        while (start + 1 < end) {

            int mid = start + (end - start) / 2;

            if (SVNRepo.isBadVersion(mid)) {
                end = mid;
            } else {
                start = mid;
            }
        }

        if (SVNRepo.isBadVersion(start)) {
            return start;
        }

        if (SVNRepo.isBadVersion(end)) {
            return end;
        }

        return n;
    }
}
