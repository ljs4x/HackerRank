/* https://www.hackerrank.com/challenges/drawing-book */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(int total, int page){
        int front = solveFront(page);
        int back = solveBack(total, page);
        
        if(front <= back) {
            return front;
        }
        else {
            return back;
        }
    }
    
    static int solveFront(int page) {
        return page / 2;
    }
    
    static int solveBack(int total, int page) {
        return (total / 2) - (page / 2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}
