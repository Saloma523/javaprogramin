package day16_loopContinue;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer = "yes";

        while (answer.equalsIgnoreCase("yes")){

        System.out.println("enter the first number");
        int num1 = input.nextInt();

        System.out.println("enter a math operator");
        String operator = input.next();

        while (!(operator.equals("+" )|| operator.equals( "-" )|| operator.equals("*") || operator.equals("/"))){

            System.out.println("you entered invalid operator! please try again");
            operator = input.next();
            // operator = input.next().charAt(0);

            System.out.println("enter the second number");
            int num2 = input.nextInt();

                int result = 0;

                switch (operator) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        result = num1 / num2;
                        break;
                }
                System.out.println(result);

            System.out.println("Would you like to continue? yes/no");
            while (!(answer == "yes") || answer == "no"){
                System.err.println("invalid answer! would like to continue?");
                answer = input.next().toLowerCase();
            }

        }

        }
        input.close();








    }
}
