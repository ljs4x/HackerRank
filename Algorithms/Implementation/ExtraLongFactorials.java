/* https://www.hackerrank.com/challenges/extra-long-factorials */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextInt();
        
       
        BigInteger number = BigInteger.ONE;
        
        for(long i = n; i > 0; i--) {
            
            number = number.multiply(BigInteger.valueOf(i));
        }
        System.out.println(number.toString());
    }
}
