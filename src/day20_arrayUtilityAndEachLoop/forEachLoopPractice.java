package day20_arrayUtilityAndEachLoop;

import java.util.Arrays;

public class forEachLoopPractice {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8};

        for (int each : numbers) {
            if(each % 2 != 0){
                System.out.println(each);
            }


        }

        System.out.println("----------------------------------------------------------");

        int[] number = {100,200,300,3,4,543};

        int max = number[0];

        for (int each : number) {
            if(each > max){
                max = each;
            }
        }
        System.out.println(max);


        int min = number[0];
        for (int each: number) {
            if(each < min){
                min =each;

            }
        }
        System.out.println(min);

        System.out.println("---------------------------------------------------------------------------");

        int[] a1 = {1,2,3,4,5};
        int[] a2 = {6,7,8,9};

        int[] a3 = new int[a1.length + a2.length];

        int k = 0;

        for (int each : a1) {
            a3[k++] = each;
        }

        for (int each : a2) {
            a3[k++] = each;

        }

        System.out.println(Arrays.toString(a3));

        System.out.println("-------------------------------------------");

        String[] str = {"Salma Ahmed","Mohamed Ahmed","Israa Ali"};

        for (String each : str) {
            System.out.println(each.charAt(0) + "." + each.charAt(each.lastIndexOf(" " +1)));

        }


    }
}
