package org.example.basicMath_Logic;

import java.util.Scanner;

public class SumNaturalNos {
    public static void sumNaturalNos(){
        Scanner scanner = new Scanner(System.in);
        //Take user input for the value of n
    System.out.println("Enter the value of n : ");
    int n = scanner.nextInt();
    int sum = 0;
    //starting loop
    for(int i =0; i<=n; i++){
        sum = sum+i;
    }
    System.out.println("Sum of first " +n+" natural numbers : "+sum);
    }
}
