package org.example.basicMath_Logic;

import java.util.Scanner;

public class Fibonacci {
    public static void fibonacci(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = scanner.nextInt();
        if(n<=0){
            System.out.println("Enter a positive number!!");
        }
        int a = 0, b=1;
        System.out.print("Fibonacci Series : ");
        for(int i=1; i<=n;i++){
            System.out.print(a + " ");
            int next = a+b;
            a = b;
            b = next;
        }
        System.out.println();
        scanner.close();

    }
}
