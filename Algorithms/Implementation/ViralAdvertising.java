/* https://www.hackerrank.com/challenges/strange-advertising */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int days = input.nextInt();
        int count = 0;
        int people = 5;
        
        for(int i = 1; i <= days; i++) {
            
            count = count + (people / 2);
            people = (people / 2) * 3;
            
        }
        System.out.print(count);
    }
}