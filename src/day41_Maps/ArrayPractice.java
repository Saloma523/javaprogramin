package day41_Maps;

import java.util.*;

public class ArrayPractice {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 4, 5, 7, 3, 45));
        List<Integer> list2 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 5, 6, 8, 9, 5));
        List<Integer> list3 = new ArrayList<>();
        list1.addAll(Arrays.asList(5, 8, 7, 3, 2, 9));

        List<Integer>[] ArrayOfLists = new List[3];

        ArrayOfLists[0] = list1;
        ArrayOfLists[1] = list2;
        ArrayOfLists[2] = list3;

        System.out.println(Arrays.toString(ArrayOfLists));

        Set<Integer>[] arrayOfSets = new Set[3];

        arrayOfSets[0] = new LinkedHashSet<>();
        arrayOfSets[1] = new LinkedHashSet<>();
        arrayOfSets[2] = new LinkedHashSet<>();



    }
}
