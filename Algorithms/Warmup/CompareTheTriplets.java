/* https://www.hackerrank.com/challenges/compare-the-triplets */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class Solution {

    private static int aScore = 0;
    private static int bScore = 0;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        in.close();
        compareScores(a0, b0);
        compareScores(a1, b1);
        compareScores(a2, b2);
        System.out.println("" + aScore + " " + bScore);
    }
    
    public static void compareScores(int a, int b) {
        if(a > b) aScore++;
        else if(a < b) bScore++;
    }
}
