package day10_ScannerINtro2_String;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first string ");
        String str = input.nextLine();
        System.out.println(str);

        System.out.println("Enter your second string");
        String str2 = input.nextLine();

        input.close();

        if(str.length() > str2.length()){
            System.out.println("first string is the longest");
        }else if(str.length() < str2.length()){
            System.out.println("the second string is the longest string");
        }else{
            System.out.println("equal");
        }

    }
}
/*
1. Create a class named LongestString
			1.1 Ask the user to enter two strings
			1.2 Write a program that can print the longest string, if both have the same number of characters then print "Equal"
 */
