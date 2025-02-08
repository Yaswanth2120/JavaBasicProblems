package org.example.strings_charOps;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void removeDuplicates(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String input = sc.nextLine();
        //Create a HashSet to store unique characters
        HashSet<Character> uniqueChars = new HashSet<>();
        StringBuilder result = new StringBuilder();
        for(char ch:input.toCharArray()){
            if(!uniqueChars.contains(ch)){
                uniqueChars.add(ch);
                result.append(ch);
            }
        }
        //Print the String with duplicates removed
        System.out.println("String after removing duplicates : "+ result.toString());
        sc.close();
    }
}
