/* https://www.hackerrank.com/challenges/electronics-shop */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getMoneySpent(int[] keyboards, int[] drives, int s){
        // Complete this function
        int maxSpent = -1;
        Arrays.sort(keyboards);
        Arrays.sort(drives);
        
        for(int i = 0, j = drives.length - 1; j >= 0; j--) {
            for(; i < keyboards.length; i++) {
                if(keyboards[i] + drives[j] > s) {
                    break;
                }
                if(keyboards[i] + drives[j] > maxSpent) {
                    maxSpent = keyboards[i] + drives[j];
                }
            }
        }
        return maxSpent;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] keyboards = new int[n];
        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] drives = new int[m];
        for(int drives_i=0; drives_i < m; drives_i++){
            drives[drives_i] = in.nextInt();
        }
        //  The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
        int moneySpent = getMoneySpent(keyboards, drives, s);
        System.out.println(moneySpent);
    }
}
