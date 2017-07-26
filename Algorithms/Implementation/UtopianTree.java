/* https://www.hackerrank.com/challenges/utopian-tree */

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
            treeHeight(n);
        }   
    }
    public static void treeHeight(int cycles) {
        int height = 1;
        int counter = 0;
        while(counter < cycles) {
            if(counter % 2 == 0) {
                height *= 2;
            }
            else {
                height++;
            }
            counter++;
        }
        System.out.println(height);
    }
}
