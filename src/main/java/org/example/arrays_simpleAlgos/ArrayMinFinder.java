package org.example.arrays_simpleAlgos;

import java.util.Scanner;

public class ArrayMinFinder {
    public static void arrayMaxFinder(){
        Scanner sc = new Scanner(System.in);
        //Total number of elements
        System.out.println("Enter the number of elements : ");
        int nums = sc.nextInt();
        //User Input elements
        int []arr = new int[nums];
        System.out.println("Enter "+nums+" elements");
        for(int i = 0;i<nums;i++){
            arr[i] = sc.nextInt();
        }
        //Finding the maximum element
        int min = arr[0];
        for(int i = 1; i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("The maximum element of array = "+ min);
        sc.close();
    }
}