/* https://www.hackerrank.com/challenges/simple-array-sum */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[scan.nextInt()];
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
            sum = sum + arr[i];
        }
        System.out.print(sum);
    }
}