package day12_customMethods;

import java.util.Scanner;

public class tipCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("is the bill split:");
        String split = input.next().toLowerCase();
        System.out.println("Enter the number of people");
        int people = input.nextInt();
        System.out.println("Enter the check amount");
        int cheek = input.nextInt();
        System.out.println("Service Quality");
        String service= input.next().toLowerCase();
        input.close();







      double totalTip = (service.equals("Excellent"))? cheek * .25 :(service.equals("Great"))? cheek *.20 :(service.equals("Good"))? cheek * .15 :(service.equals("Fair"))? cheek * .10 : cheek * .05;



       double total = cheek + totalTip;
        if(split.equals("yes")){
            System.out.println("total per person: " + total/people);
            System.out.println("tip per person: " + totalTip/people);
        }

        System.out.println("number of people:" + people);
        System.out.println("total pay: " + total );
        System.out.println("total tip: " + totalTip);

    }
}
/*
 3. Create a class called TipCalculator, and write a program for a tip calculator.
	    There will be different service quality benchmarks that will determine the tip given.
	    There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

	        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

	    The program should ask the user to enter:
	            - Split or No split (Yes or No),
	             - Enter the number of people (number)
	             - Enter the check amount (number)
	             - Service Quality (String)

	    And then it should display:
	             Number of people entered
	             Total to pay
	             Total tip
	             Total per person
	             Tip per person:

		    Ex:
		        Split or No split (Yes or No)?
		        YeS
		        Enter the number of people
		        4
		        Enter the check amount:
		        476
		        How was the srvice quality? (Excellent/Great/Good/Fair/Poor)
		        ExCElLeNt

		        output:
		            Number of people entered: 4
		            Total to pay: 595.0
		            Total tip: 119.0
		            Total per person: 148.75
		            Tip per person: 29.75


 */
