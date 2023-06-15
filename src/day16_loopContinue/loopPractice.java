package day16_loopContinue;

import java.util.Scanner;

public class loopPractice {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            System.out.println("hello " + i);
        }

        System.out.println("------------------------------");

        int j = 0;
        while (j < 5){
            System.out.println("hello");
            j++;
        }
        System.out.println("----------------------------------");
        int k = 0;
        do{
            System.out.println("hello");
            k++;
        }while (k<5);

        System.out.println("------------------------------------");



        Scanner input = new Scanner(System.in);
        System.out.println("enter uor score");
        int score = input.nextInt();
        while (score >100 || score <0){
            System.out.println("invalid score! please try again");
            score = input.nextInt();

        }
        if(score>= 60){
            System.out.println("you passed");
        }else{
            System.out.println("you failed");
        }

    }

}
