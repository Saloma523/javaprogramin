package day23_ArrayListMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.IntFunction;

public class ArrayToArrayList {
    public static void main(String[] args) {

        String[] arr = {"A", "B", "C", "D","E"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));

        System.out.println(list);

        System.out.println("-----------------------------------------------------");

        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("salma","manar","Omnia","judy"));

        String[] names = list2.toArray(new String[0]);

        System.out.println(Arrays.toString(names));

        System.out.println("--------------------------------------------------");

        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,5));

        Integer[] number = list3.toArray(new Integer[0]);

        System.out.println(Arrays.toString(number));


    }
}
