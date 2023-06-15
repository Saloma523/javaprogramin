package day40_CollectionContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionPractice {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        Collection<Integer> collection= new ArrayList<>();

        collection.add(100);
        collection.addAll(Arrays.asList(34,4,55,63,11,67,200));

        System.out.println(collection);

        //System.out.println(((ArrayList)collection).get(0));// down casting

        System.out.println(new ArrayList<>(collection).get(4));

        //List<Integer> l = new ArrayList<>(Collection);





    }
}
