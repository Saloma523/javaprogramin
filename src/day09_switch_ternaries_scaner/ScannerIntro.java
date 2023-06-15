package day09_switch_ternaries_scaner;

import java.util.Scanner;
public class ScannerIntro {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("inter your first number:");

        int num1 = input.nextInt();

        System.out.println("inter your second number:");
        
        byte num2 = input.nextByte();

        System.out.println("inter your third number:");
        
        short num3 = input.nextShort();

        System.out.println("inter your fourth number:");

        long num4 = input.nextLong();

        input.close();

        System.out.println("the first number is: " + num1);
        System.out.println("the second number is: " + num2);
        System.out.println("the third number is:" + num3);
        System.out.println("the fourth number is:" + num4);





    }
}
