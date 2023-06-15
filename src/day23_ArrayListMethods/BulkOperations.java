package day23_ArrayListMethods;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(33);
        numbers.add(55);
        numbers.add(23);
        numbers.add(43);

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(4);
        list1.add(55);

        list1.addAll(1,numbers);
        System.out.println(list1);

        System.out.println("-------------------------------------------");

        ArrayList<Integer> scores = new ArrayList<>();
        
        scores.addAll(Arrays.asList(1,3,4,5,6,7));
        System.out.println(scores);

        System.out.println("--------------------------------------------------");
        
        ArrayList<String> names = new ArrayList<>();

        names.addAll(1,Arrays.asList("salma", "mohamed", "ahmed"));

        System.out.println(names);

        names.addAll(2,Arrays.asList("manar","Omnia","judy"));

        System.out.println(names);

        boolean hasAlena = names.contains("Alena");
        boolean hasManar = names.contains("manar");
        boolean hasManarOmnia = names.containsAll(Arrays.asList("manar", "omnia"));

        System.out.println("has Alena = " + hasAlena);
        System.out.println("has Manar = " + hasManar);
        System.out.println("has manar and omnia = " + hasManarOmnia);


        System.out.println("-----------------------------------------------");

        Integer[] nums = {1,2,3,4,5};

        ArrayList<Integer> nums2 = new ArrayList<>();

        nums2.addAll(Arrays.asList(nums)); // as list method convert array to arrayList

        System.out.println("--------------------------------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(10,10,20,30,30,10,10,20,20,20,40,50));

        list.removeAll(Arrays.asList(10,20));

        System.out.println(list);

        System.out.println("----------------------------------------------------");

        ArrayList<String> developers = new ArrayList<>();

        developers.addAll(Arrays.asList("salma","manar","Omnia","judy"));

        developers.retainAll(Arrays.asList("manar", "omnia"));

        System.out.println(developers);





    }
}
