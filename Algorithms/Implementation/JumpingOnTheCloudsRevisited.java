/* https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited */

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
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        
        int energy = 100;
        
        for(int i = 0; i < c.length; i = i + k) {
            if(c[i] == 1) {
                energy = energy - 3;
            }
            if(c[i] == 0) {
                energy--;
            }
        }
        System.out.println(energy);
    }
}
