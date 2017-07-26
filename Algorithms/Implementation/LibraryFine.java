/* https://www.hackerrank.com/challenges/library-fine */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d1 = in.nextInt();
        int m1 = in.nextInt();
        int y1 = in.nextInt();
        int d2 = in.nextInt();
        int m2 = in.nextInt();
        int y2 = in.nextInt();
        
        int yDiff = y1 - y2;
        int mDiff = m1 - m2;
        int dDiff = d1 - d2;
        
        if(yDiff > 0) {
            System.out.print("10000");
        }
        else if(yDiff == 0 && mDiff > 0) {
            System.out.print(500 * mDiff);
        }
        else if(mDiff == 0 && yDiff == 0 && dDiff > 0) {
            System.out.print(15 * dDiff);
        }
        else {
            System.out.print("0");
        }
        
    }
}
