package org.example.conditions_loops;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void armstrong(){
        Scanner sc = new Scanner(System.in);
        //Take user input for the number to check
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int original = num;
        int sum = 0;
        int numDigits = String.valueOf(num).length();

        while(num!=0){
            int digits = num%10;
            sum+=Math.pow(digits,numDigits);
            num/=10;
        }
        //Check if Original num equals the sum
        if(sum==original){
            System.out.println(original+" is Armstrong number");
        }else{
            System.out.println(original+" is not Armstrong number");
        }
    }
}
