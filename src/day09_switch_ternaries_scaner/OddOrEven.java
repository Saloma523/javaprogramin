package day09_switch_ternaries_scaner;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        System.out.println("Enter your number");

        String outcome = (num % 2 == 0)? "Even number" : "Odd number";

        System.out.println(num);
        input.close();


    }
}
