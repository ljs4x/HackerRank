/* https://www.hackerrank.com/challenges/designer-pdf-viewer */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 26;
        int h[] = new int[n];
        for(int h_i=0; h_i < n; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        
        // assign ints for width and height. 
        // width is easy, just use the length of the word.
        int width = word.length();
        int height = 0;
        
        //iterate through 'word'
        for(int i = 0; i < word.length(); i++) {
            char current = word.charAt(i);
            // 97 is the place value of 'a' on the ASCII wikipedia page
            // subtracting 97 moves us to index 0 if current was 'a'.
            int charheight = h[current - 97]; 
            
            if(height < charheight) {
                height = charheight;
            }
            //7 is the max, if we hit that we can breakout of the loop.
            if(height == 7) {
                break;
            }
        }
        System.out.println(width * height);
    }
}
