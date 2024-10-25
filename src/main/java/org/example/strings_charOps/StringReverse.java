package org.example.strings_charOps;

import java.util.Scanner;

public class StringReverse {
    public static void stringReverse(){
        Scanner sc = new Scanner(System.in);
        //Take user inout for the string
        System.out.print("Enter the String : ");
        String input = sc.nextLine();
        //Use String Builder to reverse the String
        StringBuilder sb = new StringBuilder(input);
        String reversed = sb.reverse().toString();
        //Print the reversed String
        System.out.println("Reversed String : " + reversed);
        sc.close();
    }
}
