/* https://www.hackerrank.com/challenges/diagonal-difference */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int diagonal1 = 0;
        int diagonal2 = 0;
        for(int i = 0; i < a.length; i++) {
            diagonal1 += a[i][i];
        }
        for(int i = 0; i < a.length; i++) {
            for(int j = a.length - 1 - i; j <= a.length - 1 - i; j++) {
                //test out to see logic at work
               // System.out.print(a[i][j]);
                diagonal2 += a[i][j];
            }
        }
        
        int diff = Math.abs(diagonal1 - diagonal2);
        //test out to see logic at work
        //System.out.println(diagonal1);
        //System.out.println(diagonal2);
        System.out.print(diff);
        
    }
}
