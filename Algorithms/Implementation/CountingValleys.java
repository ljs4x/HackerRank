/* https://www.hackerrank.com/challenges/counting-valleys */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
         This was a new problem, usually in HackerRank we could just read input.next() and not worry about typing
         the first line of input was actually the number and the carriage return, "8/n", so I was getting a string where
         I was specifying for an int. Using input.nextInt() fixed it.
        */
        int stepCount = input.nextInt();
        int valleyCount = 0;
        int elevation = 0;
        String steps = input.next();
        boolean isNeg = false;
        for(int i = 0; i < stepCount; i++) {
            char step = steps.charAt(i);
            if(step == 'U') {
                elevation++;
            }
            if(step == 'D') {
                elevation--;
            }
            if(elevation < 0 && isNeg == false) {
                isNeg = true;
            }
            if(elevation == 0 && isNeg == true) {
                isNeg = false;
                valleyCount++;
            }
        }
        System.out.println(valleyCount);
    }
}