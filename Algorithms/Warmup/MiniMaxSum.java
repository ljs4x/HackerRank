/* https://www.hackerrank.com/challenges/mini-max-sum */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        long[] longArray = {a,b,c,d,e};
        long min = 0;
        long max = 0;
        Arrays.sort(longArray);
        for(int i = 1; i <= 4; i++) {
            max += longArray[i];
        }
        for(int i = 0; i <= 3; i++) {
            min += longArray[i];
        }
        System.out.print(min + " " + max);
    }
}
