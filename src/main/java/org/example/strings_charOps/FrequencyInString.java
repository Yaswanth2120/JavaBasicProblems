package org.example.strings_charOps;

import java.util.HashMap;
import java.util.Scanner;

public class FrequencyInString {
    public static void frequencyInString(){
        Scanner sc = new Scanner(System.in);
        //Take input from the user
        System.out.println("Enter the String");
        String input = sc.nextLine();

        //Create a Hashmap to store frequencies
        HashMap<Character, Integer> charFrequency = new HashMap<>();
        //Loop through each character in String
        for(char ch:input.toCharArray()){
            //If Character is in the map, increment its count
            if(charFrequency.containsKey(ch)){
                charFrequency.put(ch, charFrequency.get(ch)+1);
            }else {
                //Otherwise add it to the map with count 1
                charFrequency.put(ch,1);
            }
        }
        System.out.println("Character Frequencies : ");
        for(char ch: charFrequency.keySet()){
            System.out.println(ch+" : "+ charFrequency.get(ch));
        }
        sc.close();
    }
}
