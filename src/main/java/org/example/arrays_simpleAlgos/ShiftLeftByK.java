package org.example.arrays_simpleAlgos;

import java.util.Scanner;

public class ShiftLeftByK {
    public static void shiftLeftByK(){
        Scanner sc = new Scanner(System.in);
        //Input array size and elements
        System.out.println("Enter the length of array : ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter "+len+"elements");
        for(int i=0;i<len;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k(Shift to left count)");
        int k = sc.nextInt();
        //Calculate effective k
        k = k%len;
        //Reverse the entire array
        reverse(arr, 0, len-1);
        //Reverse the last n-k elements
        reverse(arr,0,len-k-1);
        //Reverse the first k elements
        reverse(arr,len-k,len-1);
        //Print the shifted array
        System.out.println("Array after shifting left by " + k + " positions: ");
        for(int num: arr){
            System.out.print(num + " ");
        }
        System.out.println();
        sc.close();
    }

    public static void reverse(int arr[], int start, int end){
        while(start < end){
            int temp= arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
