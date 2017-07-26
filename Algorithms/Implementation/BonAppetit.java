/* https://www.hackerrank.com/challenges/bon-appetit */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int itemCount = input.nextInt();
        int indexSheDidntEat = input.nextInt();
        int subTotal = 0;
        int[] items = new int[itemCount];
        for(int i = 0; i < items.length; i++) {
            items[i] = input.nextInt();
            subTotal += items[i];
        }
        int actualCharge = input.nextInt();
        int correctCharge = (subTotal - items[indexSheDidntEat]) / 2;
        if(actualCharge == correctCharge) {
            System.out.print("Bon Appetit");
        }
        else {
            System.out.print(actualCharge - correctCharge);
        }
    }
}