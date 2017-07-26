/* https://www.hackerrank.com/challenges/migratory-birds */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] types = new int[n];
        //first way.  better way is just do it all in 
        //first for loop. They only want the counts
        //tracked anyway.  the array is a 'red herring'
        int[] counts = new int[5];
        for(int types_i=0; types_i < n; types_i++){
            types[types_i] = in.nextInt();
            counts[types[types_i] - 1]++;
        }
        int max = 0;
        int maxIndex = 0;
        for(int i = 0; i < counts.length; i++) {
            if(counts[i] > max) {
                max = counts[i];
                maxIndex = i + 1;
            }
        }
        System.out.println(maxIndex);
    }
}
