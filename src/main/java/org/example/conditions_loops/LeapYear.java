package org.example.conditions_loops;

import java.util.Scanner;

public class LeapYear {
    public static void leapYear(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year = sc.nextInt();
        if(year%4==0 && year%100 != 0 || year%400==0){
            System.out.println(year+" is Leap Year");
        }else{
            System.out.println(year + " is not a leap year");
        }
    }
}
