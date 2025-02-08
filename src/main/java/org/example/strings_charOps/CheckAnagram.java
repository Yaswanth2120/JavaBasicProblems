package org.example.strings_charOps;

import java.util.Arrays;
import java.util.Scanner;

//Approach: Convert to char array, sort, and compare → O(n log n)
public class CheckAnagram {
    public static void checkAnagram() {
        Scanner sc = new Scanner(System.in);

        //Take input for two strings
        System.out.println("Enter First String : ");
        String str1 = sc.nextLine();

        System.out.println("Enter second String: ");
        String str2 = sc.nextLine();

        //Check if they are anagram
        if(areAnagram(str1,str2)){
            System.out.println("The strings are anagrams");
        }else {
            System.out.println("The Strings are not anagrams");
        }
        sc.close();
    }

    public static boolean areAnagram(String str1, String str2){
        //Check if lengths are not equal they are not anagrams
        if(str1.length() != str2.length()){
            return false;
        }

        //Convert strings to character Arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        //sort both char arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        //compare sorted arrays
        return Arrays.equals(charArray1,charArray2);
    }
}
