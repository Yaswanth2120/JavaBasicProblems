package org.example.arrays_simpleAlgos;

import java.util.Scanner;

public class AverageOfArray {
    public static void averageArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements : ");
        int nums = sc.nextInt();
        int[] arr = new int[nums];
        System.out.println("Enter "+nums+" elements : ");
        for(int i=0; i<nums;i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        //Loop for the average of an array
        for(int i = 0; i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("The average of an array is : "+ sum/nums);
    }
}
