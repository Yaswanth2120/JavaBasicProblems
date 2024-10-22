package org.example;

import java.util.Scanner;

import org.example.basicMath_Logic.*;

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
        System.out.println("5. Reverse of a Number");
        System.out.println("6. Check Palindrome Number");
        System.out.println("7. Fibonacci for n terms");
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

            case 5:
                ReverseNumber.reverseNumber();
                break;

            case 6:
                PalindromeNumber.palindromeNumber();
                break;

            case 7:
                Fibonacci.fibonacci();
                break;
            // Add more cases for other problems

            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();  // Close scanner
    }
}
