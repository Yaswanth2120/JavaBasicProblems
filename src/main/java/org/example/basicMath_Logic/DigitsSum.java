package org.example.basicMath_Logic;

import java.util.Scanner;

public class DigitsSum {
    public static void digitsSum(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();
        int sum = 0;
        while(num!=0){
            int digit = num%10;
            sum = sum+digit;
            num/=10;
        }
        System.out.println("Sum of Digits : "+sum);
    }
}
