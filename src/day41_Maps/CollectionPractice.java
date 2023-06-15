package day41_Maps;

import day28_OOP_Encapsulation.Employee;

import java.util.*;

public class CollectionPractice {

    public static void main(String[] args) {


        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,3,4,5,2,56,76,7));


        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,3,4,5,2,5,8,7));


        List<List<Integer>> list3 = new ArrayList<>();
       // list3.addAll(Arrays.asList(list1,list2));

        list3.add(list1);
        list3.add(list2);

        System.out.println(list3);


        System.out.println(list3.get(1).get(3));

        for(List<Integer> eachList : list3){
            for(Integer each : eachList){

            }
        }

        List<Set<Integer>> listsOfSets = new ArrayList<>();

        listsOfSets.add(new LinkedHashSet<>());
        listsOfSets.add(new LinkedHashSet<>());
        listsOfSets.add(new LinkedHashSet<>());
        listsOfSets.add(new LinkedHashSet<>());

        listsOfSets.get(0).addAll(Arrays.asList(10,30,33,3,32,2,1,23));
        listsOfSets.get(1).addAll(Arrays.asList(10,30,33,23));
        listsOfSets.get(2).addAll(Arrays.asList(32,2,1,23));
        listsOfSets.get(3).addAll(Arrays.asList(10,2,2,1,23));

        System.out.println(listsOfSets);


        System.out.println("---------------------------------------------");

        int[] arr1 = {1,3,4,6,7};
        int[] arr2 = {1,8,2,43,7};

        List<int[]> listOfArrays = new ArrayList<>();

        listOfArrays.add(arr1);
        listOfArrays.add(arr2);

        System.out.println(listOfArrays);

        listOfArrays.get(0)[2] = 35;
        System.out.println(Arrays.toString(listOfArrays.get(0)));

        System.out.println("-------------------------------------------------");

        List<List<Employee>> teams = new ArrayList<>();



    }
}
