package org.example;

import java.util.Scanner;
import basicMath_Logic.PrintEvenNumbers;  // Corrected package name

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Java Practice Problems");
        System.out.println("======================");

        // Display options for problems
        System.out.println("1. Print Even Numbers");
        // Add more problems here as you implement them

        System.out.println("Choose a problem to run: ");

        int choice = scanner.nextInt();

        // Switch-case for problem selection
        switch (choice) {
            case 1:
                PrintEvenNumbers.printEvenNumbers();
                break;
            // Add more cases for other problems
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();  // Close scanner
    }
}
