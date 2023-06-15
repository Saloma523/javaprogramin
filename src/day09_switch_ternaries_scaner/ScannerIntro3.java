package day09_switch_ternaries_scaner;

import java.util.Scanner;

public class ScannerIntro3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter your character:");
        String ch = input.next();

        System.out.println("Would you like to continue");
        String answer = input.next();

        System.out.println("your ch is:" + ch);

        System.out.println( answer);

        input.close();


    }
}
