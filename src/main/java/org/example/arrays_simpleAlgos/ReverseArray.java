package org.example.arrays_simpleAlgos;

import java.util.Scanner;

public class ReverseArray {
    public static void reverseArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements : ");
        int nums = sc.nextInt();
        int[] arr = new int[nums];
        System.out.println("Enter "+nums+" elements : ");
        for(int i=0; i<nums;i++){
            arr[i] = sc.nextInt();
        }
        //Loop for reversing the Array
        //Copy elements from original array to temp in reverse order
        int[] temp = new int[nums];
        for(int i=0;i<nums;i++){
            temp[i] = arr[nums-i-1];
        }
        //Copy elements back to Original array
        for(int i =0; i<nums;i++){
            arr[i] = temp[i];
        }
        //Output
        for(int i =0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
