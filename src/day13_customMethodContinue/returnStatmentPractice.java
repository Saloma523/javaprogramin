package day13_customMethodContinue;

import java.util.Scanner;

public class returnStatmentPractice {
    public static void main(String[] args) {

        char grade = new Scanner(System.in).next().charAt(0);
        boolean isValid = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'd' || grade == 'F';
        if (!isValid) {
            System.err.println("invalid grade");
            return;

        }


    }

}


