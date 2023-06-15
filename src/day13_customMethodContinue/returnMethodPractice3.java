package day13_customMethodContinue;

import java.util.Scanner;

public class returnMethodPractice3 {
    public static void main(String[] args) {
        int month = new Scanner(System.in).nextInt();
        if(month<0 && month > 12){
            System.err.println("invalid month");
            return;
        }else{
            switch (month){
                case 2:
                    System.out.println("28 days");
                case 4: case 6: case 9: case 11:
                    System.out.println("30 days");
                default:
                    System.out.println("31 days");

            }
        }
    }
}
