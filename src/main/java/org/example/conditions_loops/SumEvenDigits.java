package org.example.conditions_loops;

import java.util.Scanner;

public class SumEvenDigits {
    public static void sumEvenDigits(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int sum = 0;

        //Loop to add the even digits
        while(num!=0){
            int digit = num%10;
            if(digit%2==0){
                sum+=digit;
            }
            num/=10;
        }
        System.out.println("The sum of even digits = "+sum);
        sc.close();
    }
}
