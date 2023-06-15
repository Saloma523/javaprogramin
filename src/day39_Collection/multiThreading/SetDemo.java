package day39_Collection.multiThreading;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println(list);

        System.out.println("-----------------------------------------------");



        Set<Integer> set1 = new HashSet<>();
        set1.addAll(Arrays.asList(10,200,300,40,90));
        set1.addAll(Arrays.asList(10,200,300,40,90));
        set1.addAll(Arrays.asList(10,200,300,40,90));
        set1.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println(set1);

        Set<Integer> set2 = new LinkedHashSet<>();
        set2.addAll(Arrays.asList(10,200,300,40,90));
        set2.addAll(Arrays.asList(10,200,300,40,90));
        set2.addAll(Arrays.asList(10,200,300,40,90));
        set2.addAll(Arrays.asList(10,200,300,40,90));
        set2.addAll(Arrays.asList(null,null,null,null,null));

        System.out.println(set2);


        Set<Integer> set3 = new TreeSet<>();

        set3.addAll(Arrays.asList(10,200,300,40,90));
        set3.addAll(Arrays.asList(10,200,300,40,90));
        set3.addAll(Arrays.asList(10,200,300,40,90));
        set3.addAll(Arrays.asList(10,200,300,40,90));
        //set3.addAll(Arrays.asList(null,null,null,null,null));// keep the sorted order// dos not accept null

        System.out.println(set3);

        System.out.println("-------------------------------------------------");

        String[] words = {"java", "java", "java", "python", "python", "c#","c#", "c++","Ruby","c#","c#"};

        LinkedHashSet<String> result = new LinkedHashSet<>();
        result.addAll(Arrays.asList(words));

        System.out.println(result);

        List<Integer> numbers = new ArrayList<>(Arrays.asList(12,2,3,3,3,3,4,4,4,4,5,5,5,5,7,7,7,7,8,9,8,1,2,2));// keep sorted order and dos not accepts duplicates

        Set<Integer> set = new TreeSet<>(numbers);

        System.out.println(set);

    }
}
