package org.example.conditions_loops;

import java.util.Scanner;

public class CountDigits {
    public static void countDigits(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        int count = 0;
        while(number!=0){
            number/=10;
            count++;
        }
        System.out.println("Number of digits = "+count);
    }
}
