package day06_ifStatments;

public class IdentfyNumber {
    /*
    2. Create a class named IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.

			Ex:
				number = 200

			output:
		        200 is positive number: true
		        200 is negative number: false
		        200 is zero: false
     */

    public static void main(String[] args) {

        int number = 20;

        boolean isPositive = number > 0 ;// if the number is grater than 0 it is positive
        boolean isNegative = number < 0 ;// if the number is less than 0 it is negative
        //boolean isZero = number == 0 ;// if the number is equal to 0 then, it is zero
        boolean isZero = !isPositive && !isNegative ;// not positive and not negative = 0

        System.out.println(number + " is positive number: " + isPositive);
        System.out.println(number + " is negative number: " + isNegative);
        System.out.println(number + " is zero: " + isZero);

    }
}
