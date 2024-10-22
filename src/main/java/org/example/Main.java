package org.example;

import java.util.Scanner;

import org.example.basicMath_Logic.Factorial;
import org.example.basicMath_Logic.PrimeNumber;
import org.example.basicMath_Logic.PrintEvenNumbers;  // Corrected package name
import org.example.basicMath_Logic.SumNaturalNos;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Java Practice Problems");
        System.out.println("======================");

        // Display options for problems
        System.out.println("1. Print Even Numbers");
        System.out.println("2. Sum of n natural numbers");
        System.out.println("3. Check Prime Number");
        System.out.println("4. Factorial of a Number");
        // Add more problems here as you implement them

        System.out.println("Choose a problem to run: ");

        int choice = scanner.nextInt();

        // Switch-case for problem selection
        switch (choice) {
            case 1:
                PrintEvenNumbers.printEvenNumbers();
                break;

            case 2 :
                SumNaturalNos.sumNaturalNos();
                break;

            case 3:
                PrimeNumber.primeNumber();
                break;

            case 4:
                Factorial.factorial();
                break;
            // Add more cases for other problems

            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();  // Close scanner
    }
}
