package day20_arrayUtilityAndEachLoop;

import utilities.ArraysUtilities;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String str= " salma mohamed ahmed";

        char[] ch = str.replace(" ","").toCharArray();

        System.out.println(Arrays.toString(ch));

        System.out.println("--------------------------------------------------------------------");

        String str2 = "today is a beutiful day";

        String[] words = str2.split(" ");

        System.out.println(Arrays.toString(words));

        System.out.println("-----------------------------------------------------------------------------");

        String s = " i love java";

        String[] s2 = ArraysUtilities.reverse(s.split(" "));

        String reverseSentence = "";

        for (int i = 0; i < s2.length; i++) {
            reverseSentence+= s2[i];

        }
        System.out.println(reverseSentence);




    }
}
