package day23_ArrayListMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class collectionUtility {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,45,6,7,8,9));

       int max =  Collections.max(numbers);
        System.out.println(max);

        int min = Collections.min(numbers);
        System.out.println(min);

        System.out.println("----------------------------------------------------------------");

        ArrayList<String> names = new ArrayList<>(Arrays.asList("salma","manar","Omnia","judy"));

        Collections.sort(names);

        System.out.println("-------------------------------------------------------------");

        Collections.reverse(names);
        System.out.println(names);

        System.out.println("--------------------------------------------------");

        Collections.swap(names,0,1);
        System.out.println(names);

        System.out.println("--------------------------------------------------------");



    }
}
