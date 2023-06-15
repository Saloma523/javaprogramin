package day19_array;

import java.util.Arrays;

public class arrayPractice {
    public static void main(String[] args) {

        String [] myGroup = new String[5];

        myGroup[0] = "Gulcin";
        myGroup[myGroup.length] = "Aseel";
        myGroup[2] = "Sumey";
        myGroup[1] = "Salma";
        myGroup[3] = "Ahmed";

        System.out.println(Arrays.toString(myGroup));

        myGroup[0]= "Mohamed";
       // myGroup[5] = "isrra";//this one is not accepted because it out index bound

        System.out.println(Arrays.toString(myGroup));

        System.out.println("--------------------------------------------------------------");

        for (int i = myGroup.length-1; i >= 0; i--) {

            System.out.println(i);

        }



    }


}

