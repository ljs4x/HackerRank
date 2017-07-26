/* https://www.hackerrank.com/challenges/divisible-sum-pairs */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        int count = 0;
        for(int i = 0; i <= a.length - 2; i++) { 
            for(int j = i + 1; j <= a.length - 1; j++) {
             
                    if((a[i] + a[j]) % k == 0) {
                        count++;
                    }
                
            }
        }
        System.out.print(count);
    }
}

