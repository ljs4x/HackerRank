/* https://www.hackerrank.com/challenges/kangaroo */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int kan1Start = in.nextInt();
        int kan1Jump = in.nextInt();
        int kan2Start = in.nextInt();
        int kan2Jump = in.nextInt();
        
        int startingDiff = kan2Start - kan1Start;
        int jumpDiff = 0;
        if(kan2Jump >= kan1Jump) {
            System.out.println("NO");
        }
        else {
            jumpDiff = kan1Jump - kan2Jump;

            if(startingDiff % jumpDiff == 0) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        } 
    }
}
