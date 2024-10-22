package org.example.basicMath_Logic;

import java.util.Scanner;

public class PalindromeNumber {
    public static void palindromeNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();
        int reversed = 0;
        int temp = num;

        while(temp!=0){
            int lastDigit = temp%10;
            reversed = reversed*10+lastDigit;
            temp/=10;
        }

        if(num==reversed){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}
