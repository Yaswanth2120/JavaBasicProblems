package org.example.basicMath_Logic;

import java.util.Scanner;

public class Factorial {
    public static void factorial(){
        Scanner scanner = new Scanner(System.in);
        int fact =1;
        System.out.println("Enter the number : ");
        int n = scanner.nextInt();
        //Loop starting
        for(int i =1;i<=n;i++){
            fact = fact*i;
        }
        System.out.println("Factorial of "+n+": "+fact);
    }
}
