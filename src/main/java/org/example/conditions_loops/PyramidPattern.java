package org.example.conditions_loops;

import java.util.Scanner;

public class PyramidPattern {
    public static void pyramidPattern(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for number of lines : ");
        int rows = sc.nextInt();
        //Generate Pyramid Pattern
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("   ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(" * ");
            }
            System.out.println();  // New line after each row
        }
        sc.close();
    }
}