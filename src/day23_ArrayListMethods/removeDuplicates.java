package day23_ArrayListMethods;

import java.util.ArrayList;

public class removeDuplicates {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("salma");
        names.add("mohamed");
        names.add("manar");
        names.add("omnia");
        names.add("salma");
        names.add("mohamed");

        ArrayList<String> nonDup = new ArrayList<>();

        for(String each : names){
            if(nonDup.contains(each)){
                continue;
            }
            nonDup.add(each);
        }
        names = nonDup;
        System.out.println(names);
        System.out.println(nonDup);
    }
}
