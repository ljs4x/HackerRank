/* https://www.hackerrank.com/challenges/day-of-the-programmer */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String solve(int year){
        //julian
        if(year >= 1700 && year < 1918) {
            //leap year
            if(year % 4 == 0) {
                return "12.09." + year;
            }
            //not leap year
            else {
                return "13.09." + year;
            }
        }
        //gregorian
        if(year > 1918 && year <= 2700) {
            //leap year
            if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                return "12.09." + year;
            }
            //not leap year
            else {
                return "13.09." + year;
            }
        }
        //switch year
        if(year == 1918) {
            // return whatever it is.
            return "26.09.1918";
        }
        return "outside range...";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}
