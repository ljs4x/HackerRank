/* https://www.hackerrank.com/challenges/beautiful-days-at-the-movies */

import java.io.*;
import java.lang.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int startDay = input.nextInt();
        StringBuilder reverser = new StringBuilder();
        int endDay = input.nextInt();
        int divideBy = input.nextInt();
        int count = 0;
        
        int day = startDay;
        while(day <= endDay) {
           
            
            reverser.append(day);
            reverser.reverse();
            
            
            //tracing
            //System.out.println("day and reversed: " + day + " " + reverser.toString());
            
            
            int reversed = Integer.parseInt(reverser.toString());
            
            //tracing 
            //System.out.println("reversed int: " + reversed);
            
            if(Math.abs(day - reversed) % divideBy == 0) {
                count++;
            }
            
            //tracing
            //System.out.println("count: " + count);
            
            day++;
            reverser.delete(0, reverser.length());
        }
        System.out.print(count);
    }
}