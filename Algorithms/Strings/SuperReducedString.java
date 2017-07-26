/* https://www.hackerrank.com/challenges/reduced-string */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        
        
        
        for(int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) == s.charAt(i + 1)) {
                
                boolean flag = true;
                int startPairsIndex = i;
                int endPairsIndex = i + 1;
                while(flag) {
                    if(startPairsIndex == 0 || endPairsIndex == s.length() - 1) {
                        flag = false;
                    }
                    else if(s.charAt(startPairsIndex - 1) == s.charAt(endPairsIndex + 1)) {
                        startPairsIndex--;
                        endPairsIndex++;
                    }
                    else {
                        flag = false;
                    }
                }
                if(startPairsIndex == 0 && endPairsIndex == s.length() - 1) {
                    s = "";
                }
                else if(startPairsIndex == 0) {
                    s = s.substring(endPairsIndex + 1);
                    i--;
                }
                else if (endPairsIndex == s.length() - 1) {
                    s = s.substring(0, startPairsIndex);
                }
                else{
                    s = s.substring(0, startPairsIndex) + s.substring(endPairsIndex + 1);
                    i--;
                }
            }
            //System.out.println(s);
        }
        
        if(s.equals("")) {
            System.out.println("Empty String");
        }
        else {
            System.out.println(s);
        }
    }  
}