package day22_wrapperClassMethods_ArrayList;

import java.nio.charset.CharsetEncoder;

public class wrapperClassMethods {
    public static void main(String[] args) {

        String str = "20";
        System.out.println(str +1); // 201

       // Integer num = Integer.parseInt(str);// unboxing

        int num = Integer.parseInt(str);
        System.out.println(num + 1);// 21

        Integer num1 = Integer.valueOf(str); // 20// not unboxing or autoboxing
        System.out.println(num1);

        System.out.println("--------------------------------------------------------------");

        String str2 = "20.5";

        double num2 = Integer.parseInt(str2);// convert to primitive type
        Double num3 = Double.valueOf(str2);// convert to wrapper claas

        System.out.println(num2);
        System.out.println(num3);

        System.out.println("---------------------------------------------------------------");

        char ch = '1';
        boolean isDigit = Character.isDigit(ch);
        boolean isLetter = Character.isLetter(ch);
        boolean isLowerCaseLetter = Character.isLowerCase(ch);
        boolean isUpperCase = Character.isUpperCase(ch);
        boolean isSpecialChar = Character.isSpaceChar(ch);

        System.out.println(" is digit = " + isDigit);
        System.out.println(" is letter = " + isLetter);
        System.out.println("is lower case = " + isLowerCaseLetter);
        System.out.println("is upper case = " + isUpperCase);
        System.out.println("is special char = " + isSpecialChar);

        System.out.println("-----------------------------------------------------------------------");

        String string = "abcdes";

        int sum =0;

        for(char each: string.toCharArray()){
            if(Character.isDigit(each)){
               sum+= Integer.parseInt("" + each);
            }

        }
        System.out.println(sum);




    }
}
