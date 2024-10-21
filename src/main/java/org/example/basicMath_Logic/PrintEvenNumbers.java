package org.example.basicMath_Logic;

import java.util.Scanner;

public class PrintEvenNumbers {
    public static void printEvenNumbers() {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the upper limit
        System.out.print("Enter the upper limit: ");
        int upperLimit = scanner.nextInt();
        int count = 0;

        System.out.println("Even numbers from 1 to " + upperLimit + ":");

        // Loop through numbers from 1 to the upper limit
        for (int i = 1; i <= upperLimit; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println("\nTotal even numbers: " + count);
        scanner.close();  // Close scanner to avoid resource leak
    }
}
