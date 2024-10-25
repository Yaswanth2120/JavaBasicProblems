package org.example.arrays_simpleAlgos;

import java.util.Scanner;

public class SecondLargest {
    public static void secondLargest(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size : ");
        int nums = sc.nextInt();
        if (nums < 2) {
            System.out.println("Array must have at least 2 elements.");
            return;
        }
        int[] arr = new int[nums];
        System.out.println("Enter "+nums+" elements");
        for(int i=0; i<nums;i++){
            arr[i]=sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        //Loop for finding the second largest
        for(int i=0; i<nums-1;i++){
            if(arr[i]>arr[i+1]){
                second = max;
                max = arr[i];
            } else if (arr[i]>second && arr[i]!=max) {
                second = arr[i];
            }
        }
        // Check if second largest exists
        if (second == Integer.MIN_VALUE) {
            System.out.println("No second largest element found (All elements are the same).");
        } else {
            System.out.println("The second largest element is: " + second);
        }
        sc.close();
    }
}
