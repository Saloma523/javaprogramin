package day15_loopBranchesStatements;

import java.util.Scanner;

public class whileLoopIntro {

    public static void main(String[] args) {
        if(true){
            System.out.println("hello world");
        }

        while (true){
            System.out.println("hello cydeo");
            break;
        }


        System.out.println("-----------------------------");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt();

        while (!(age >= 21)){
            System.out.println("invalid entry please try again");
            age = input.nextInt();
            input.close();
        }
        if(age >= 21){
            System.out.println("you are eligible to buy alcohol");
        }else{
            System.out.println("you are not eligible to buy alcohol");
        }










    }
}
