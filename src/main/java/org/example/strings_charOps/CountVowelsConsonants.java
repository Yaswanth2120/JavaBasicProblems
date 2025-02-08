package org.example.strings_charOps;

import java.util.Locale;
import java.util.Scanner;

public class CountVowelsConsonants {
    public static void countVowelsConsonants(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String input = sc.nextLine().toLowerCase();
        int vowel = 0;
        int consonant = 0;
        //Loop through each character in a String
        for(int i=0; i<input.length();i++){
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel++;
            }
            // Check if it's an alphabetic consonant
            else if (ch >= 'a' && ch <= 'z') {
                consonant++;
            }
        }
        System.out.println("Vowels : "+vowel);
        System.out.println("Consonants : "+consonant);
    }
}
