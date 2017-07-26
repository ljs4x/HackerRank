/* https://www.hackerrank.com/challenges/between-two-sets */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        //do we need to sort the arrays?
        int count = 0;
        
        //start at last element of first array and check each increment up to first 
        //element of second array.
        for(int i = a[0]; i <= b[0]; i++) {
            boolean increment = false;
            //check first array
            for(int j = 0; j < a.length; j++) {
                if(i % a[j] != 0) {
                    increment = false;
                    break;
                }
                else {
                    increment = true;
                }
                //check second array
                for(int k = 0; k < b.length; k++) {
                    if(b[k] % i != 0) {
                        increment = false;
                        break;
                    }
                }
            }
            
            if(increment) {
                count++;
            }
        }
        System.out.println(count);
    }
    
}
