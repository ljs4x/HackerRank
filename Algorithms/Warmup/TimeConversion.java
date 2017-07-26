/* https://www.hackerrank.com/challenges/time-conversion */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        //if last two chars are PM call militaryTimeConvert
        if(time.substring(8).equals("PM") && !time.substring(0, 2).equals("12")) {
            //convert time to ints
            int hour = Integer.parseInt(time.substring(0, 2));
            hour = militaryTimeConvert(hour);
            //print converted time.
            System.out.print("" + hour + time.substring(2, 8));
        }
        else if(time.substring(8).equals("AM") && time.substring(0, 2).equals("12")) {
            System.out.print("00" + time.substring(2, 8));
        }
        else {
            System.out.print(time.substring(0, 8));
        }
    }
    
    public static int militaryTimeConvert(int hour) {
        return hour + 12;
    }
}
