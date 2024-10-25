package org.example.arrays_simpleAlgos;

import java.util.Scanner;

public class CheckIfArrayIsSorted {
    public static void checkArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int nums = sc.nextInt();
        int[] arr = new int[nums];
        System.out.println("Enter "+nums+" elements : ");
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        //Loop for sorting check
        boolean isSorted = true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }
        }

        if(isSorted){
            System.out.println("The array is sorted");
        }else{
            System.out.println("The array is not sorted");
        }
    }
}
