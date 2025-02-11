package org.example.strings_charOps;

import java.util.Scanner;

public class FindSubString {
    public static void findSubString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String input = sc.nextLine();

        System.out.println("Enter the substring : ");
        String subString = sc.nextLine();

        //Check if the Sub String exists
        if(input.contains(subString)){
            System.out.println("SubString Found");
        }else{
            System.out.println("SubString not found!!!");
        }
    }
}
