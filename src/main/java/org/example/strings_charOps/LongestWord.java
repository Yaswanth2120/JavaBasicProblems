package org.example.strings_charOps;

import java.util.Scanner;

public class LongestWord {
    public static void longestWord(){
        Scanner sc = new Scanner(System.in);

        //Take sentence input
        System.out.println("Enter a Sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");

        //Track the longest word
        String longestWord = "";
        int maxLength = 0;
        for(String word:words){
            if(word.length()>maxLength){
                maxLength = word.length();
                longestWord = word;
            }
        }
        System.out.println("The longest word is : "+longestWord);

        sc.close();
    }
}
