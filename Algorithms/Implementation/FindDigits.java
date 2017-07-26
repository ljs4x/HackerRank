/* https://www.hackerrank.com/challenges/find-digits */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int count = 0;
            String s = new String("" + n);
            
            for(int i = 0; i < s.length(); i++) {
                char digit = s.charAt(i);
                int number = digit - 48;
                
                if(number != 0) {
                    
                    if(n % number == 0) {
                    count++;
                    }
                }
                
                
            }
            System.out.println(count);
        }
    }
}
