package org.example.basicMath_Logic;

import java.util.Scanner;

public class GCDcalculator {
    public static void gcdCalculator(){
        Scanner sc = new Scanner(System.in);
        //Take user input for 2 numbers
        System.out.print("Enter First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();

        //Calculate the GCD using Euclidean algorithm
        int gcd = findGCD(a,b);
        System.out.println(gcd);
        sc.close();
    }

    public static int findGCD(int a, int b){
        //if b becomes zero, a is gcd
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a; //GCD Found
    }
}
