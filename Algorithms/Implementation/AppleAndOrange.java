/* https://www.hackerrank.com/challenges/apple-and-orange */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int houseLeft = in.nextInt();
        int houseRight = in.nextInt();
        int appleTree = in.nextInt();
        int orangeTree = in.nextInt();
        int numberOfApples = in.nextInt();
        int numberOfOranges = in.nextInt();
        
        //counts to increment if the fruit hits the house.
        int appleCount = 0;
        int orangeCount = 0;
        
        int[] apples = new int[numberOfApples];
        for(int apple_i=0; apple_i < numberOfApples; apple_i++){
            apples[apple_i] = in.nextInt();
            //add to counts right away so that we can 
            //traverse the array only once.
            if(appleTree + apples[apple_i] >= houseLeft && appleTree + apples[apple_i] <= houseRight) {
                appleCount++;
            }
        }
        int[] oranges = new int[numberOfOranges];
        for(int orange_i=0; orange_i < numberOfOranges; orange_i++){
            oranges[orange_i] = in.nextInt();
            //add to counts right away so that we can 
            //traverse the array only once.
            if(orangeTree + oranges[orange_i] <= houseRight 
               && orangeTree + oranges[orange_i] >= houseLeft) {
                orangeCount++;
            }
            
            
        }
        System.out.println(appleCount);
        System.out.println(orangeCount);
        
        
        
    }
}
