package org.example.arrays_simpleAlgos;

import java.util.Scanner;

public class CountOccurances {
    public static void countOccurances(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements = ");
        int nums = sc.nextInt();
        int []arr = new int[nums];
        System.out.println("Enter "+nums+" elements");
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter a element to check its occurance");
        int occur = sc.nextInt();
        int count = 0;
        //Loop to check the Occurance of element
        for(int i=0;i<arr.length;i++){
            if(arr[i]==occur){
                count++;
            }
        }
        System.out.println("The element "+occur+" occured "+count+" times");
    }
}
