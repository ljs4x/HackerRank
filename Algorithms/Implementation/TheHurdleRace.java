/* https://www.hackerrank.com/challenges/the-hurdle-race */

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
        int[] height = new int[n];
        int count = 0;
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
            if(height[height_i] > k) {
                count = count + (height[height_i] - k);
                k = height[height_i];
            }
            
        }
        System.out.println(count);
    }
}
