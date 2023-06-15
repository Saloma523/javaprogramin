package day21_multiDimensionalArray;

import utilities.ArraysUtilities;

import java.util.Arrays;

public class addElements {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        int element = 6;

        int[] new_array = Arrays.copyOf(array,array.length +1);
        new_array[new_array.length-1] = element;

        System.out.println(Arrays.toString(new_array));

        System.out.println("------------------------------------------------------");

        int[] numbers = {10,20,30,40};

        System.out.println(Arrays.toString(ArraysUtilities.addElement(numbers,50)));

        System.out.println("---------------------------------------------------");

        String[] students = {"salma" , "israa", "saeeda"};

        students = ArraysUtilities.addElement(students,"mohamed");

        System.out.println(ArraysUtilities.contains(students,"mohamed"));

    }
}
