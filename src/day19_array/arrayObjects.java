package day19_array;

import java.util.Arrays;

public class arrayObjects {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = arr1;
        int[] arr3 = arr2;

        arr1[0] = 1000;
        arr2[2] = 3000;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr3));

        System.out.println("-------------------------");

        String[] a1 = {"ahmed", "islam"};// this is now eligible for garbage collection

        a1 = new String[]{"salma", "mohamed"};
    }
}
