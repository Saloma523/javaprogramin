package day15_loopBranchesStatements;

import java.util.Scanner;

public class eligibleToVote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt();

        while (!(age >=1 && age <= 120)){
            System.out.println("invalid entry please enter your age");
            age = input.nextInt();
        }

        System.out.println("are you a US citizen?");
        String yesORno = input.next();
        while (!(yesORno.equals("yes")) || yesORno.equals("no")){
            System.out.println("invalid entry please try again");
            System.out.println("please enter yes/no");
            yesORno = input.next();
        }


        if(age >= 21 && yesORno.equals("yes") ){
            System.out.println("you ate eligible to vote");
        }else{
            System.out.println("your are not eligible to vote");
        }
    }
}
