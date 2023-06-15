package day12_customMethods;

public class calledEmail1 {
    public static void main(String[] args) {
        String email= "Salma_Ahmed@yahoo.com";
        int i = email.indexOf("_");
        String first = email.substring(0,i);
        int i2 = email.indexOf("@");
        String last = email.substring(i+1,i2);
        System.out.println(first + "_" + last);

    }
}
/*
 2. Create a class calledEmailTask1.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

        Write a program that can swap first name with last name in the email (Saperated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com
 */