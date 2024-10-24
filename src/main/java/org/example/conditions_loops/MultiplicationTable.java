package org.example.conditions_loops;

import java.util.Scanner;

public class MultiplicationTable {
    public static void multiplicationTable(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        for(int i=1; i<=10;i++){
            System.out.println(num+"x"+i +"=" + (num*i));
        }
    }
}
