package day07_ifStatments;

public class IfStatementWithoutCurlyBraces {
    public static void main(String[] args) {

        int age = 30;
        if(age >= 21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }
        System.out.println("-----------------------------");
        if(age >= 21)System.out.println("Eligible");
        else System.out.println("Not eligible");/* if i need to print more the one statement I can not remove the curly braces */

        System.out.println("---------------------------------");

        int num = 1;
        if(num == 1) System.out.println("Monday");
        else if(num == 2) System.out.println("Tuesday");
        else if(num == 3) System.out.println("Wednesday");
        else if(num == 4) System.out.println("thursday");
        else if(num == 5) System.out.println("friday");
        else if(num == 6) System.out.println("saterday");
        else System.out.println("sunday");
        // if statement without the curly brace is not a goo practice



    }

}
