package org.example.strings_charOps;

import java.util.Scanner;

public class toUpperCase {
    public static void convetToUpper(){
        Scanner sc = new Scanner(System.in);

        //Take the input
        System.out.println("Enter String : ");
        String input = sc.nextLine();

        String upperCase = input.toUpperCase();

        System.out.println(upperCase);

        sc.close();
    }
}
