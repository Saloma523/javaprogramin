package day14_methodsOverload_forLoop;

import java.util.Scanner;

public class forLoopPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        for (int i = 0; i < 10; i++) {
            System.out.println("enter a number");
            input.nextInt();
        }

        System.out.println("----------------------------------------------------");

        String str = "jave";
        //            0123
        String reverse = "";
        for (int i = 3; i >= 0; i--) {
            reverse += str.charAt(i);

        }
        System.out.println(reverse);




    }


}
