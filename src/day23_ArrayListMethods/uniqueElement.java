package day23_ArrayListMethods;

import java.util.ArrayList;

public class uniqueElement {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("salma");
        names.add("mohamed");
        names.add("manar");
        names.add("omnia");
        names.add("salma");
        names.add("mohamed");

        for (String each : names) {
            if(names.indexOf(each) == names.lastIndexOf(each)){
                System.out.println(each);
                break;
            }

        }
    }
}
