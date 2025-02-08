package org.example.strings_charOps;

import java.util.Scanner;

public class PalindromeString {
    public static void palindromeString(){
        Scanner sc = new Scanner(System.in);
        //
        System.out.println("Enter the String : ");
        String input = sc.nextLine();
        //Use String Builder to reverse the String
        StringBuilder sb = new StringBuilder(input);
        String reversed = sb.reverse().toString();
        //Print the reversed String
        if(input.equals(reversed)){
            System.out.println("The String is Palindrome");
        }else{
            System.out.println("The String is Not Palindrome!!");
        }
    }
}
