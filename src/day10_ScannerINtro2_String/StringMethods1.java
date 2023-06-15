package day10_ScannerINtro2_String;

import java.util.Scanner;

public class StringMethods1 {
    public static void main(String[] args) {

        String str = "Cydeo";
        //index       01234

        char firstChar = str.charAt(0);
        char secondChar = str.charAt(1);
        char thirdChar = str.charAt(2);
        char fourthChar = str.charAt(3);
        char fifthChar = str.charAt(4);

        System.out.println("first char = " + firstChar);
        System.out.println("second char = " +secondChar);
        System.out.println("third char = " + thirdChar);
        System.out.println("fourth char = " + fourthChar);
        System.out.println("fifth char = " + fifthChar);

        System.out.println("--------------------------------------");

        String sentence = "Java programing language";
        int length = sentence.length();

        System.out.println(length);

        String s1 = "wooden spoon";
        char f = s1.charAt(0);

        int lastIndexNum = s1.length()-1;

        char l = s1.charAt(lastIndexNum);

        System.out.println(f + " : " + l);

        System.out.println("------------------------------");

        String name1 = "Salma";
        String name2 = new String("Salma");

        System.out.println(name1 == name2);//false

        System.out.println(name1.equals(name2));

        System.out.println("-----------------------------------------");

        String r1 = "Java";
        String r2 = "Java";
        String r3 = new String("Java");

        System.out.println(r1 == r2);// true
        System.out.println(r1 == r3);//false
        System.out.println(r2 == r3);//false

        System.out.println(r1.equals(r3));//true
        System.out.println(r2.equals(r3));//true

        System.out.println("-------------------------------");

        Scanner input = new Scanner(System.in);
        System.out.println("how old are you?");

        int age = input.nextInt();

        System.out.println("are you a US citizen");
        String citizen = input.next();

        if(age >= 21 && citizen.equals("yes")){
            System.out.println("you are eligible to vote");
        }else{
            System.out.println("you are not eligible to vote");
        }





    }

}
