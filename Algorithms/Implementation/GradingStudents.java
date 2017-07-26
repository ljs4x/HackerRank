/* https://www.hackerrank.com/challenges/grading */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(int grade){
        if(grade < 38) {
            return grade;
        }
        int remainder = grade % 5;
        if(remainder == 4) {
            return grade + 1;
        }
        if(remainder == 3) {
            return grade + 2;
        }
        return grade;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for(int grades_i=0; grades_i < n; grades_i++){
            int grade = in.nextInt();
            int result = solve(grade);
            System.out.println(result);
        }
        
        
    }
}
