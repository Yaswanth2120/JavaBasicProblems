package org.example.strings_charOps;

import java.util.Arrays;
import java.util.Scanner;

public class SortCharsInString {
    public static void sortCharsInStr(){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        //Convert the string to character Array
        char[] charArray = input.toCharArray();

        //sort the array
        Arrays.sort(charArray);

        //Convert back to String
        String sortedString = new String(charArray);

        //result
        System.out.println(sortedString);

        sc.close();
    }
}
