package day15_loopBranchesStatements;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter your number");
        int num1 = input.nextInt();

        System.out.println("enter your math operator");
        char operator = input.next().charAt(0);

        System.out.println("enter your seconed number");
        int num2 = input.nextInt();
        while (!(operator == '+' ||operator == '-' || operator == '*' || operator == '/')){
            System.out.println("invalied operater please enter again");
            operator = input.next().charAt(0);
            input.close();
        }

        if(operator == '+'){
            System.out.println(num1 + num2);
        }else if(operator == '-'){
            System.out.println(num1 - num2);
        } else if (operator == '*') {
            System.out.println(num1 * num2);
        }else {
            System.out.println(num1 / num2);
        }
    }
}
