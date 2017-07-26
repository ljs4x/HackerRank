/* https://www.hackerrank.com/challenges/staircase */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        printStaircase(n);
    }
    
    public static void printStaircase(int n) {
        for(int i = 1; i <= n; i++) {
            //spaces
            for(int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // # marks
            for(int k = 1; k <= i; k++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
        
}
