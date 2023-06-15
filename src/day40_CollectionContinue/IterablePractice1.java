package day40_CollectionContinue;

import java.util.*;

public class IterablePractice1 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Ahmed" , "Ahmed", "aHmed", "Jhone", "Ercon", "Daniel", " Mustafa", " Salma" ,"Ali"));

        Iterator<String> it = names.iterator();

        while (it.hasNext()){

            String each = it .next();
            if(each.equalsIgnoreCase("ahmed")){
                it.remove();
            }
        }

        System.out.println(names);

        System.out.println("----------------------------------------------");

        List<String> names2 = new ArrayList<>();

        names2.addAll(Arrays.asList("Ahmed" , "Ahmed", "aHmed", "Jhone", "Ercon", "Daniel", " Mustafa", " Salma" ,"Ali"));

        names2.removeIf(p -> p.equalsIgnoreCase("ahmed"));

        System.out.println(names2);


        System.out.println("------------------------------------------");

        List<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,2,3,4,5,6,7,4,5,3,6,6,76,7));


        // find the fifth max number

        int n = 5;
        int max = 0;

        for (int i = 0; i < n-1 ; i++) {

            numbers.removeIf(p -> Collections.max(numbers) == p);

        }

        System.out.println(numbers);








    }
}
