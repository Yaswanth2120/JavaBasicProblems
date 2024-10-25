package org.example.arrays_simpleAlgos;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArrays {
    public static void mergeArrays(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array 1 : ");
        int len1 = sc.nextInt();
        System.out.println("Enter the length of Array 2 : ");
        int len2 = sc.nextInt();
        int[] arr1 = new int[len1];
        int[] arr2 = new int[len2];
        System.out.println("Enter the elements of array 1: ");
        for(int i=0; i<len1;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of array 2: ");
        for(int i=0; i<len2;i++){
            arr2[i] = sc.nextInt();
        }
        int[] temp = new int[len1+len2];
        for(int i=0; i<arr1.length;i++){
            temp[i] = arr1[i];
        }
        for(int i=0; i<arr2.length;i++){
            temp[len1+i] = arr2[i];
        }
        Arrays.sort(temp);
        for(int i=0; i<len1+len2;i++){
            System.out.print(temp[i]+" ");
        }
    }
}
