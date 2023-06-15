package day19_array;

import java.util.Arrays;

public class arrayIntro {

    public static void main(String[] args) {

        int score1 = 4;
        int score2 = 4;
        int score3 = 4;
        int score4 = 4;
        int score5 = 4;

        System.out.println("--------------------------------------");

        int [] score = new int[5];

        score [0]= 85;
         score [1]= 74;
        score[2] = 94;
        score [3]= 64;
         score [4]= 84;


        // score = new int[10];// index - 0->9
        //score = new int[15];//index - 0->14


        System.out.println(Arrays.toString(score));

        System.out.println(score[2]);

        for (int i = 0; i < score.length; i++) {
            System.out.println(i);

        }

        System.out.println(score[score.length-1]);


    }
}
