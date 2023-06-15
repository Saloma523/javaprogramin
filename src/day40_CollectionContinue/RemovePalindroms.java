package day40_CollectionContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindroms {
    public static void main(String[] args) {


        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("java", "Python", " cydeo", " level", "ciciv", "kayak", " revier", "racecar", "madam"));

        Iterator<String> it = names.iterator();


        while (it.hasNext()){
            String reverse = "";

            String each = it .next();
            for (int i = each.length()-1; i >=0 ; i--) {

                reverse += each.charAt(i);

            }

            if(each.equalsIgnoreCase(reverse)){
                it.remove();
            }
        }

        System.out.println(names);

        System.out.println("--------------------------------------");

        List<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList("java", "Python", " cydeo", " level", "ciciv", "kayak", " revier", "racecar", "madam"));

        names2.removeIf(p-> new StringBuffer(p).reverse().toString().equalsIgnoreCase(p));

        System.out.println(names2);

    }
}
