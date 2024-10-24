package org.example.conditions_loops;

import java.util.Scanner;

public class PowerOfNumber {
    public static void powerOfNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Base Number : ");
        int base_a=sc.nextInt();
        System.out.println("Enter the exponent : ");
        int exp_b=sc.nextInt();
        int result = 1;
        //Loop
        for(int i =1; i<=exp_b; i++){
            result = result*base_a;
        }
        System.out.println(base_a+" ^ "+exp_b+" = "+result);
    }
}
