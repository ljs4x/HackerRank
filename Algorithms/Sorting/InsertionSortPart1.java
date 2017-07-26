/* https://www.hackerrank.com/challenges/insertionsort1 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    

    public static void insertIntoSorted(int[] ar) {
        // Fill up this function  
        int copy = ar[ar.length - 1];
        
        for(int i = ar.length - 2; i >= 0; i--) {
            if(i == 0 && ar[i] > copy) {
                ar[i + 1] = ar[i];
                printArray(ar);
                ar[i] = copy;
                break;
            }
            else if(i == 0 && ar[i] <= copy) {
                ar[i + 1] = copy;
                break;
            }
            else if(ar[i] > copy) {
                ar[i + 1] = ar[i];
            }
            else if(ar[i] <= copy) {
                ar[i + 1] = copy;
                break;
            }
            
            printArray(ar);
        }
        printArray(ar);
    }
    
    
/* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
        }
        insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
 
