package com.java.regexpattern;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome");
        String firstName;
        String lastName;
        String pattern;
        do {
            pattern="^[A-Z]{1}[a-z]{2,}$";
            System.out.println("Enter a valid First Name");
            firstName=scanner.next();

        }while(!Pattern.matches(pattern,firstName));
        System.out.println("Valid");
        do {
            pattern="^[A-Z]{1}[a-z]{2,}$";
            System.out.println("Enter a valid Last Name");
            lastName=scanner.next();

        }while(!Pattern.matches(pattern,lastName));
        System.out.println("Valid");
    }
}
