package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	    /** Write a program that reads the text entered by the user, and then:
        1. Checks if the word "Java" appears in the text - if so, it prints the message
        "Found Java" in the console.
        2. Checks if the text starts with the word "Java" - if so, it prints the message
        "Starts with Java" in the console.
        3. Check if the text ends with the word "Java" - if so, it prints the message
        "Ends with Java" in the console.
        4. Checks if the text equals the word "Java" - if so, prints the message
        "Equals Java" in the console.
        5. Prints the index of the first occurrence of the word "Java" in the text in the console.

        For example, for the text "Java", the program should write in the console:
            Found Java
            Starts with Java
            Ends with Java
            Equals Java
            0

        and for the text:
        "A java course from scratch is the best way to learn Java",
        the program should write in the console:
            Found Java
            Ends with Java
            52

        Get the data from the user in the console using the Scanner class.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Please enter the text you want to scan.");
        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile("Java");
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            System.out.println("Found Java");
        } else {
            System.out.println("Sorry, what you are looking for cannot be found. Try again.");
        }

        if (text.startsWith("Java")) {
            System.out.println("Starts with Java");
        }

        if (text.endsWith("Java")) {
            System.out.println("Ends with Java");
        }

        if (text.endsWith("java")) {
            System.out.println("Ends with Java");
        }

        if (text.equals("Java")) {
            System.out.println("Equals Java");
        }


        System.out.println(text.indexOf("Java"));




    }
}
