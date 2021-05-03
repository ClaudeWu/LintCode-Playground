package WarmUp.FizzBuzz;

import java.util.*;

/**
 * LintCode 9.Fizz Buzz
 * Link: https://www.lintcode.com/problem/9/
 * LeetCode 412.Fizz Buzz
 * Link: https://leetcode.com/problems/fizz-buzz/
 *
 * Given an integer n, return a string array answer (1-indexed) where:
 *  answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
 *  answer[i] == "Fizz" if i is divisible by 3.
 *  answer[i] == "Buzz" if i is divisible by 5.
 *  answer[i] == i if non of the above conditions are true.
 *
 * Example 1:
 *  Input: n = 3
 *  Output: ["1","2","Fizz"]
 *
 * Example 2:
 *  Input: n = 5
 *  Output: ["1","2","Fizz","4","Buzz"]
 *
 * Example 3:
 *  Input: n = 15
 *  Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
 */

public class Solution {
    private final String DEFAULT_VALUE1 = "fizz buzz";
    private final String DEFAULT_VALUE2 = "fizz";
    private final String DEFAULT_VALUE3 = "buzz";

    // version-1 O(n)space
    public List<String> solution1(int n) {
        ArrayList<String> res = new ArrayList<String>();
        // check corner case
        if(n <= 0) {
            return res;
        }

        for(int i = 1; i <= n; i++) {
            if(i % 15 == 0) {
                res.add(DEFAULT_VALUE1);
                continue;
            }

            if(i % 3 == 0) {
                res.add(DEFAULT_VALUE2);
                continue;
            }

            if(i % 5 == 0) {
                res.add(DEFAULT_VALUE3);
                continue;
            }

            res.add(String.valueOf(i));
        }
        return res;
    }

    // version-2 O(n)space
    public List<String> solution2(int n) {
        ArrayList<String> res = new ArrayList<String>();
        // check corner case
        if(n <= 0) {
            return res;
        }

        for(int i = 1; i <= n; i++) {
            if(i % 3 == 0) {
                if(i % 5 == 0) {
                    res.add("fizz buzz");
                } else {
                    res.add("fizz");
                }
            } else if(i % 5 == 0) {
                res.add("buzz");
            } else {
                res.add(String.valueOf(i));
            }
        }
        return res;
    }
}
