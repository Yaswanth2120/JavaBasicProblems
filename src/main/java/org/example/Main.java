package org.example;

import java.util.Scanner;

import org.example.basicMath_Logic.*;
import org.example.conditions_loops.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Java Practice Problems");
        System.out.println("======================");

        // Display options for problems
        System.out.println("BASIC MATH AND LOGIC");
        System.out.println("======================");
        System.out.println("1. Print Even Numbers");
        System.out.println("2. Sum of n natural numbers");
        System.out.println("3. Check Prime Number");
        System.out.println("4. Factorial of a Number");
        System.out.println("5. Reverse of a Number");
        System.out.println("6. Check Palindrome Number");
        System.out.println("7. Fibonacci for n terms");
        System.out.println("8. Sum of digits");
        System.out.println("9. GCD of two numbers");
        System.out.println("10. LCM of two numbers");
        System.out.println("======================");
        System.out.println("CONDITIONS AND LOOPS");
        System.out.println("======================");
        System.out.println("11. Check Armstrong Number");
        System.out.println("12. Check Leap Year");
        System.out.println("13. Generate Multiplication Table");
        System.out.println("14. Largest of Three");
        System.out.println("15. Count the Digits");
        System.out.println("16. Find Power of a Number");
        System.out.println("17. Check Perfect Number");
        System.out.println("18. Check Prime in Range");
        System.out.println("19. Find Sum of Even Digits");
        System.out.println("20. Pyramid Pattern");
        System.out.println("======================");
        System.out.println("CONDITIONS AND LOOPS");
        System.out.println("======================");
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

            case 8:
                DigitsSum.digitsSum();
                break;

            case 9:
                GCDcalculator.gcdCalculator();
                break;

            case 10:
                LCMcalc.lcmCalc();
                break;

            case 11:
                ArmstrongNumber.armstrong();
                break;

            case 12:
                LeapYear.leapYear();
                break;

            case 13:
                MultiplicationTable.multiplicationTable();
                break;

            case 14:
                LargestOfThree.largestOfThree();
                break;

            case 15:
                CountDigits.countDigits();
                break;

            case 16:
                PowerOfNumber.powerOfNumber();
                break;

            case 17:
                PerfectNumber.perfectNumber();
                break;

            case 18:
                CheckPrimeInRange.checkPrimeInRange();
                break;

            case 19:
                SumEvenDigits.sumEvenDigits();
                break;

            case 20:
                PyramidPattern.pyramidPattern();
                break;

            // Add more cases for other problems

            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();  // Close scanner
    }
}
