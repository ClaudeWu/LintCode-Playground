package WarmUp.Reverse3DigitInteger;

/**
 * LintCode 37.Reverse 3-digit Integer
 * Link: https://www.lintcode.com/problem/reverse-3-digit-integer/
 *
 * Reverse a 3-digit integer.
 * You can assume the given number is larger or equal to 100 but smaller than 1000.
 *
 * Example 1:
 *  Input:
 *      number = 123
 *  Output:
 *      321
 *
 * Example 2:
 *  Input:
 *      number = 900
 * Output:
 *      9
 */

public class Solution {
    // version-1: Modulo
    public int solution1(int number) {
        //getting ones digit
        int num1 = number % 10;
        //getting tens digit
        int num2 = (number % 100) / 10;
        //getting hundreds digit
        int num3 = number / 100;
        //find sum of three numbers (reversed)
        return num1 * 100 + num2 * 10 + num3;
    }

    // version-2: while loop + Modulo
    public int solution2(int number) {
         int reversed = 0;
         while(number != 0) {
             // getting ones, tens and hundreds digit
             int digit = number % 10;
             // revers number
             reversed = reversed * 10 + digit;
             // getting rest of digits
             number /= 10;
         }
         //return reversed number
         return reversed;
    }

    // version-3: int/string conversion
    /*
     * follow up: what if the number is negative?
     * 思路: 如果 chars[i] 是 '-' 的话, 将其放到 str[0] 的位置
     * 转换成 int 输出
     */
    public int solution3(int number) {
        String num = String.valueOf(number);
        char[] chars = num.toCharArray();
        String str = "";
        //flag when detect continuously 0;
        boolean flag = false;
        for(int i = chars.length - 1; i >= 0; i--) {
            // if the end is not 0 then not add to str
            if(chars[i] != '0' || flag) {
                flag = true;
                str += chars[i];
            }
        }
        return Integer.parseInt(str);
    }
}
