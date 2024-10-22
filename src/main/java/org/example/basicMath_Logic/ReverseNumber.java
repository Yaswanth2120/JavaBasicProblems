package org.example.basicMath_Logic;

import java.util.Scanner;

public class ReverseNumber {
    public static void reverseNumber(){
        Scanner scanner = new Scanner(System.in);
        int reversed = 0;
        System.out.println("Enter the number : ");
        int num = scanner.nextInt();
        System.out.print("Reverse of number "+ num+" : ");
        //Logic Loop
        while(num!=0){
            int lastDigit = num%10;
            reversed = reversed*10 + lastDigit;
            num/=10;
        }
        System.out.println(reversed);
    }
}
