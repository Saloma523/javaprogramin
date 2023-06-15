package day24_ArraylistContinue_JavaDateTime;

import java.beans.Introspector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class collectionUtiliteMethods {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("salma", "manar","omnia","judy", "hasan"));

        for (int i = 0; i < names.size(); i++) {
            if(names.get(i).equalsIgnoreCase("hasan")){
                names.set(i,"Ahmed");
            }

        }
        System.out.println(names);

        Collections.replaceAll(names,"salma","nagmeldin");

        System.out.println(names);

        System.out.println("----------------------------------------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,50,66,87,50,4,50,33,50,43,50,50));

        Collections.frequency(list,50);

        System.out.println("--------------------------------------------------------");

        ArrayList<String> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList("java","pythone", "java", "c#", "java"));
        Collections.frequency(list2,"java");

        System.out.println("---------------------------------------------------");


        ArrayList<Integer> list3 = new ArrayList<>();
        list.addAll(Arrays.asList(1,50,66,87,50,4,50,33,50,43,50,50));

        String unique = "";

        for (Integer each : list3) {
            if(Collections.frequency(list3,each) == 1){
                unique+= each;
            }

        }
    }
}
