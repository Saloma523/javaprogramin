package day13_customMethodContinue;

import java.util.Scanner;

public class warmupTasks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter tow numbers and a math operator");
        int n1 =input.nextInt();
       int n2 =  input.nextInt();
       String operator = input.next();
        input.close();

        calculate(n1, n2, operator);
        ageGroup(50);
        eligibleToVote(19,true);

    }

    public static void calculate(int num1, int num2, String mathOperator) {

        double sum = 0;
        switch (mathOperator) {
            case "+":
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 + num2));
                break;
            case "-":
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 - num2));
                break;
            case "/":
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 / num2));
                break;
            case "*":
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 * num2));
            default:
                System.out.println("invalid operator");
        }

    }

    public static void ageGroup(int age) {

       String result =  (age > 0 && age <= 100)? (age < 21)? "teenager" :(age < 55)? "Adult" : "Senior": "invalid age";
        System.out.println(result);


    }

    public static void eligibleToVote(int age, boolean isAmerican) {


        if (isAmerican && age >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
    }
}
/*
1. Create a method named calculate that can take three arguments:
            num1 (double)
            num2 (double)
            mathOperator (char)

	    The method should display the calculation result of those two numbers as long as the 3rd argument is a valid math operator, otherwise the method prints "Invalid Operator"

	        Ex:
	            calculate(10, 20, '+')

	        output:
	            10 + 20 = 30


	2. Create a method named ageGroup that can print the age group of the person

	        age groups are:
	                Teenager (< 21)
	                Adult   (>=21 && <55 )
	                Senior  ( > 55 )


    3. Create a method named eligibleToVote that takes two arguments:
	        1. age (int)
	        2. isAmerican (boolean)

	    Then the method should determine if the person eligible to vote
	        Ex:
	            eligibleToVote(23, true)

	        output:
	            You are eligible to vote

 */
