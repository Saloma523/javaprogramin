package day19_array;

import java.util.Arrays;
import java.util.Scanner;

public class averageNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("how many numbers do you want to enter?");
        int total = input.nextInt();

        int[] number = new int[total];
        int sum = 0;
        for (int i = 0; i < total; i++) {

            System.out.println("enter a number");
            number[i] = input.nextInt();
            sum+=number[i];
        }

        double average =(double) sum/total;

        System.out.println("numbers = " + Arrays.toString(number) );
        System.out.println("sum = " + sum);
        System.out.println("average = " + average);
        input.close();



        
    }
}
