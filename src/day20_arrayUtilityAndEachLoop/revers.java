package day20_arrayUtilityAndEachLoop;

import java.util.Arrays;

public class revers {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6};

        int[] revere = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
          revere[j] = array[i];

        }
        System.out.println(Arrays.toString(revere));
    }
}

/*3. Write a program that can reverse an array of integers and returns it as new array
        ex:
        array = {1,2,3,4,5};

        output:
        reversedArray = {5,4,3,2,1};
        */

