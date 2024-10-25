package org.example.arrays_simpleAlgos;

import java.util.Scanner;

public class CheckEqualArrays {
    public static void checkEqualArrays(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of First Array : ");
        int len1 = sc.nextInt();
        System.out.println("Enter the length of second Array : ");
        int len2 = sc.nextInt();
        int [] arr1 = new int[len1];
        int[] arr2 = new int[len2];
        if(len1!=len2){
            System.out.println("The Arrays are not equal");
        }else{
            //User input of first Array elements
            System.out.println("Enter the elements of first array : ");
            for(int i=0;i<len1;i++){
                arr1[i] = sc.nextInt();
            }

            //User input of Second Array elements
            System.out.println("Enter the elements of Second Array : ");
            for(int i=0; i<len2;i++){
                arr2[i] = sc.nextInt();
            }
            //Check if Arrays are equal
            if(areEqual(arr1,arr2)){
                System.out.println("The Two Arrays are Equal");
            }else{
                System.out.println("The Two Arrays are not Equal");
            }
        }
        sc.close();
    }

    public static boolean areEqual(int[] arr1, int[] arr2){
        //Compare each element
        for(int i=0; i< arr1.length; i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}
