package day09_switch_ternaries_scaner;

import java.util.Scanner;

public class NextLine_vs_next {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt();

        input.next();

        System.out.println("Enter your full name");
        String full_name = input.nextLine();

        System.out.println("age = " + age);
        System.out.println("full name= " + full_name);

    }
}
