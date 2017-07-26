/* https://www.hackerrank.com/challenges/circular-array-rotation */

/*
* Initially I was thinking I had to shift the array,
* but that wasn't the case.  I wrote a usable algo to shift the array
* but some tests were timing out because they had tens of thousands elements.
* Really all we need to do is find the actual number of rotations, and then find
* the element that would be at a certain place.  We don't actually have to rotate anything.
* Thanks to the commenters in the discussion for setting me right.
*/
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
        int q = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        //number of actual rotations is the remainder of k / n
        int rotations = k % n;
        
        /* 
        * array shift right rotations loop
        * this is my original incorrect code.
        for(int j = 1; j <= rotations; j++) {
            //array shift right once:
            int copy = a[a.length - 1];
            for(int i = a.length - 1; i > 0; i--) { 
                a[i] = a[i - 1];
            }
            a[0] = copy;
        }
        */
        
        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
            if(m - rotations >= 0) {
                System.out.println(a[m - rotations]);
            }
            if(m - rotations < 0) {
                System.out.println(a[m - rotations + a.length]);
            }
            
        }
    }
}
