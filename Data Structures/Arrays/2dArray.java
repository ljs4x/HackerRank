/* https://www.hackerrank.com/challenges/2d-array */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        
        int max = 0;
        int click = 0;
            
        for(int i = 1; i <= 4; i++) {
            for(int j = 1; j <= 4; j++) {
                int count = 
                    arr[i-1][j-1] + 
                    arr[i-1][j] +
                    arr[i-1][j+1] +
                    arr[i][j] +
                    arr[i+1][j-1] +
                    arr[i+1][j] +
                    arr[i+1][j+1];
                if(click == 0) {
                    max = count;
                    click = 1;
                }
                    
                    
                if(count > max)
                    max = count;
            }
        }
        System.out.print(max);
    }
}
