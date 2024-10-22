package org.example.basicMath_Logic;

import java.util.Scanner;

public class PrimeNumber {
    public static void primeNumber() {
        Scanner scanner = new Scanner(System.in);
        //Take user input for limit to check prime numbers between them
        System.out.println("Enter the number to check prime : ");
        int n = scanner.nextInt();
        //Check if the number is prime
        if (isPrime(n)) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
        scanner.close();
    }
        //Method to check if a number is Prime
        public static boolean isPrime(int n){
            //Numbers less than 2 are not prime
            if(n<2){
                return false;
            }
            //Check divisibility from 2 to sqrt(n)
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i==0){
                    return false; //if divisible, not prime
                }
            }
            return true; // if no divisors found, is prime
        }
}
