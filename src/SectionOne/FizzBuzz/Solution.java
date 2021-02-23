package SectionOne.FizzBuzz;

import java.util.*;

public class Solution {
    private final String DEFAULT_VALUE1 = "fizz buzz";
    private final String DEFAULT_VALUE2 = "fizz";
    private final String DEFAULT_VALUE3 = "buzz";

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
