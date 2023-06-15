package day09_switch_ternaries_scaner;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class DaysInWeek {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);// when we need to reuse the variable again
        //int num = new Scanner(System.in). nextInt(); when we do not need to reuse it

        System.out.println("Enter the day of the week");
        int num = input.nextInt();

        String day = "invalid";

        if(num >= 1 && num <=7){

            day = (num == 1)? "Monday" :(num == 2)? "Tuesday" :(num ==3)? "Wednesday" :(num == 4)? "Thursday" :(num == 5)? "Friday" :(num == 6)? "Saturday" : "Sunday";

        }

        System.out.println(day);

        input.close();


    }






}
