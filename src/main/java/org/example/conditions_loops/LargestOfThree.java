package org.example.conditions_loops;

import java.util.Scanner;

public class LargestOfThree {
    public static void largestOfThree(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number : ");
        int b = sc.nextInt();
        System.out.println("Enter 3rd Number : ");
        int c = sc.nextInt();

        int largest = a;
        if(b>largest){
            largest = b;
        } if (c > largest) {
            largest = c;
        }
        System.out.println(largest + " is largest.");
    }
}
