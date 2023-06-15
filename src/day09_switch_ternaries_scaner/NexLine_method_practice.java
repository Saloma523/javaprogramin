package day09_switch_ternaries_scaner;

import java.util.Scanner;

public class NexLine_method_practice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        System.out.println("Enter your school name");
        String schoolName = input.nextLine();

        System.out.println("Enter your gender");
        String gender = input.next();

        System.out.println("Enter your age");
        int age = input.nextInt();

        input.nextLine();

        System.out.println("Enter your street address");
        String street = input.nextLine();

        System.out.println("full name = " + fullName);
        System.out.println("School name = " + schoolName);
        System.out.println("gender = " + gender);
        System.out.println("age = " + age);
        System.out.println("street = " + street);
        input.close();



    }
}
