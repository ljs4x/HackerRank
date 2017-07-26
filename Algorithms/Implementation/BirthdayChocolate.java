/* https://www.hackerrank.com/challenges/the-birthday-bar */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getWays(int[] squares, int d, int m){
        int ways = 0;
        for(int i = 0; i <= squares.length - m; i++) {
            int sum = squares[i];
            for(int j = 1; j < m; j++) {
                sum = sum + squares[i+j];
                if(sum > d) {
                    break;
                }
            }
            if(sum == d) {
                ways++;
            }
        }
        return ways;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = getWays(s, d, m);
        System.out.println(result);
    }
}
