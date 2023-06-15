package day21_multiDimensionalArray;

import java.util.Arrays;

public class multiDimensionalArraysIntro {
    public static void main(String[] args) {
        int[] a1 = {1,2,3,4};
        int[] a2 = {5,6,7,8,9};
        int[] a3 = {10,11,12,13,14};

        System.out.println("--------------------------------------");

        int [][] arr2D = {{1,2,3,4} , {5,6,7,8,9} , {10,11,12,13,14}};

        System.out.println(arr2D.length);

        System.out.println(Arrays.toString(arr2D[0]));
        System.out.println(Arrays.toString(arr2D[1]));
        System.out.println(Arrays.toString(arr2D[2]));

        System.out.println(arr2D[2][0]); //10
        System.out.println(arr2D[1][1]); //6

    }
}
