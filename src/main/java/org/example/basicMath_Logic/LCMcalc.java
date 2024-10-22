package org.example.basicMath_Logic;

import java.util.Scanner;

public class LCMcalc {
    public static void lcmCalc(){
        Scanner sc = new Scanner(System.in);
        //Take user input for 2 numbers
        System.out.print("Enter 1st Number : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        int b = sc.nextInt();
        //Calculate LCM using GCD Euclidean Algo
        int LCM = (a*b)/findGCD(a,b);
        System.out.println("LCM = "+LCM);

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
