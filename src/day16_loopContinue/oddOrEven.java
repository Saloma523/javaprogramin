package day16_loopContinue;

import java.util.Scanner;

public class oddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true){
        System.out.println("enter a number");
        int number = input.nextInt();

        if(number % 2 ==0){
            System.out.println(number + " is even");
        }else{
            System.out.println(number + " is odd");
        }
        System.out.println("do you want to enter another number? yes/no");
        String answer = input.next().toLowerCase();
        while (!answer.equals("yes")){
            System.err.println("invaled entry! do you like to try again? yes/no");
            answer = input.next().toLowerCase();
        }

        if(answer.equals("no")){
            break;

        }
    }}
}
