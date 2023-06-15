package day07_ifStatments;

public class MonthName {
    public static void main(String[] args) {

        int number = 10;
        String month = "";

        if(number >= 1 && number >= 12) {
            if (number == 1) month = "January";
            else if (number == 2) month = "February";
            else if (number == 3) month = "March";
            else if (number == 4) month = "April";
            else if (number == 5) month = "May";
            else if (number == 6) month = "Jun";
            else if (number == 7) month = "July";
            else if (number == 8) month = "August";
            else if (number == 9) month = "September";
            else if (number == 10) month = "October";
            else if (number == 11) month = "November";
            else if (number == 12) month = "December";

        }else {
            month = "no such month";

        }
    }
    /*
    1. Create a class named MonthName.java
2. An integer variable named number is declared and given, Write a
program that can print the name of the month that the number
represents. (only if the given number is a valid number, then print the
name of the month. Otherwise print Invalid)
Ex:
Given:
number = 10
output:
October

     */
}
