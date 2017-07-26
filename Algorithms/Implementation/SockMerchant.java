/* https://www.hackerrank.com/challenges/sock-merchant */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] socks = new int[n];
        int count = 0;
        for(int c_i=0; c_i < n; c_i++){
            socks[c_i] = in.nextInt();
        }
        Arrays.sort(socks);
        int indexer = 0;
        while(indexer < socks.length - 1) {
            if(socks[indexer] == socks[indexer + 1]) {
                count++;
                indexer += 2;
            }
            else {
                indexer++;
            }
        }
        System.out.print(count);
    }
}
