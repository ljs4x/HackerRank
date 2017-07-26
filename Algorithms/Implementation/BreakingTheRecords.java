/* https://www.hackerrank.com/challenges/breaking-best-and-worst-records */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] getRecord(int[] s){
        // Complete this function
        int[] records = new int[2];
        int min = s[0];
        int max = s[0];
        for(int i = 1; i < s.length; i++) {
            if(s[i] < min) {
                min = s[i];
                records[1]++;
            }
            if(s[i] > max) {
                max = s[i];
                records[0]++;
            }
        }
        return records;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}
