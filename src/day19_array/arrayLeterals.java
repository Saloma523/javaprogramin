package day19_array;

import java.util.Arrays;

public class arrayLeterals {

    public static void main(String[] args) {

        int[] numbers = new int[5];
        int[] num = {10,20,30,40,50};

        System.out.println(numbers.length);
        System.out.println(num.length);

        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println("num = " + Arrays.toString(num));

        System.out.println("----------------------------------------------------");

        String[] days = {"Sunday","Monday"};

        int n = 1;

        System.out.println(days[n-1]);

        String[] month = {"Jan", "Feb","Mar","Apr","may ","jun", "july", "aug", "sep","oct","nov","dec"};

        System.out.println("month = "+ Arrays.toString(month));

        for (int i =  month.length-1;i>=0; i--) {
            System.out.println(month[i]);

        }

    }
}
