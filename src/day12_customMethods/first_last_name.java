package day12_customMethods;

import java.util.Scanner;

public class first_last_name {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name");
        String first = input.next().trim().replace(" ", "");
        System.out.println("Enter last name");
        String last = input.next().trim().replace(" ","");
        input.close();


        String firstName = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();
        String lastName = last.substring(0,1).toUpperCase()+ last .substring(1).toLowerCase();
        System.out.println(firstName + " " + lastName);

        }
    }



