package org.example.conditions_loops;

import java.util.Scanner;

public class CheckPrimeInRange {
    public static void checkPrimeInRange(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Starting number");
        int start = sc.nextInt();
        System.out.println("Enter Ending Number");
        int end = sc.nextInt();

        System.out.println("Prime numbers between" + start+" and "+ end+ " : ");
        for(int i=start; i<=end; i++){
            if(isPrime(i)){
                System.out.println(i+" ");
            }
        }
    }
    public static boolean isPrime(int num){
        if(num<2) return false;
        for(int i =2; i<=Math.sqrt(num);i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
}
