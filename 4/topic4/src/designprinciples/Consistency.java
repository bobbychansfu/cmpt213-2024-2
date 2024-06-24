package designprinciples;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Consistency {
    public static void main(String[] args){
        
        // Example 1: Calendar Months
        int month = 6;
        int day = 17;
        int yr = 2024;
        Calendar gc = new GregorianCalendar(yr,month-1,day);

        // Example 2: Substrings
        String s1 = "hello world";
        String s2 = "hello WORLD";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println(s1.regionMatches(0,s2,0,5));
        System.out.println(s1.regionMatches(true, 0,s2,0,5));
    }
}
