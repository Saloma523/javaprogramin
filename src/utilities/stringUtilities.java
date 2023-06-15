package utilities;

import java.util.Scanner;

public class stringUtilities {


    public static void main(String[] args) {

        System.out.println(reverse("salma"));


    }

    public static String reverse(String str) {

        String reverse = "";// to contain all  the reversed characters  in a string
        for (int i = str.length() - 1; i >= 0; i--) {  /* i : index number of the given string starting from last*/

            reverse += str.charAt(i);// to get each character from the string from last index to zero*/

        }
        return reverse;
    }
}
