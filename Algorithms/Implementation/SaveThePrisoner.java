/* https://www.hackerrank.com/challenges/save-the-prisoner */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        // Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.    
        
        
        Scanner input = new Scanner(System.in);
        int tests = input.nextInt();
        for(int i = 0; i < tests; i++) {
            long numPrisoners = input.nextInt();
            long numSweets = input.nextInt() - 1;
            long startPrisoner = input.nextInt();
            
            
            //get rid of all the extra loops
            if(numPrisoners <= numSweets) {
                numSweets = numSweets % numPrisoners;
            }
            
            //simple arithmitic 
            if(numPrisoners - startPrisoner < numSweets) {
                numSweets = numSweets - (numPrisoners - startPrisoner);
                startPrisoner = 0;
            }
            
            //if sweets became 0 fix it.
            //if(numSweets == 0) {
                //numSweets++;
            //}
            
            startPrisoner = startPrisoner + numSweets;

            //print ID of the prisoner
            System.out.println(startPrisoner);
        }
        
    }
}