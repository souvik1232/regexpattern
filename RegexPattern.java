package com.java.regexpattern;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome");
        String firstName;
        String lastName;
        String email;
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
        do {
            pattern="^[a-zA-Z0-9\\-\\+\\.]+.([a-zA-Z0-9])*@([a-z0-9]+.[a-z]{2,}.([a-z]{2,})?)$";
            System.out.println("Enter a valid email");
            email=scanner.next();

        }while(!Pattern.matches(pattern,email));
        System.out.println("Valid");
    }
}
