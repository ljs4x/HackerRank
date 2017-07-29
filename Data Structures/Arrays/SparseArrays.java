/* https://www.hackerrank.com/challenges/sparse-arrays */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /*  
        in keeping with this being under the Arrays problems, I just used an array and iterated through it.
        time complexity is O(queries * N) due to iterating through the array over an over to count occurances.
        I think theres a couple options to easily improve this:
            make each string an object when it's read in, and then have that object keep a count of its occurances as 
                it's read in. This would probably be O(N) complexity
            Make a binary tree with the strings as the value and have each node hold a count and increment that count if 
                the string is duplicated. This would probably be O(log(N)) complexity.
            */
        
        // brute force solution, 
        // load the String array
        Scanner input = new Scanner(System.in);
        /* Not clear why, but was getting an error when using input.next() 
        and had to switch to .nextInt() in order to proceed. */
        String[] N = new String[input.nextInt()];
        for(int i = 0; i < N.length; i++) {
            N[i] = input.next();
        }
        
        //loop through the queries and print the number of occurances each loop
        int queries = input.nextInt();
        for(int i = 0; i < queries; i++) {
            int count = 0;
            String query = input.next();
            for(int j = 0; j < N.length; j++) {
                if(query.equals(N[j])) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}