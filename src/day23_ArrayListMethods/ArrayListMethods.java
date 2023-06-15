package day23_ArrayListMethods;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {
    public static void main(String[] args) {

        int[] num = {1,2,3,4,5};
        
        num[0] = 100;

        System.out.println(Arrays.toString(num));

        System.out.println("--------------------------------------------------");

        ArrayList<String> groceriesList = new ArrayList<>();

        groceriesList.add("apple");
        groceriesList.add("orange");
        groceriesList.add("pair");
        groceriesList.add("tomato");
        groceriesList.add("oil");
        System.out.println(groceriesList);

        groceriesList.set(0,"salt");// set method changes the element
        System.out.println(groceriesList);

        groceriesList.add(0,"chicken");// add method increases the size
        System.out.println(groceriesList);

        groceriesList.remove(0);
        System.out.println(groceriesList);

        groceriesList.remove("orange");// remove method remove by index or object
        System.out.println(groceriesList);

        System.out.println("--------------------------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(4);//0
        numbers.add(3);//1
        numbers.add(7);//2
        numbers.add(6);//3
        numbers.add(5);//4
        numbers.add(1);//5

        numbers.remove(Integer.valueOf(7));// if we dont convert to wrapper class it wil be treted as
        // index number
        System.out.println(numbers);

        numbers.clear();
        System.out.println(numbers);
        System.out.println(numbers.size());//0

        System.out.println("-------------------------------------------------");

        ArrayList<String> names = new ArrayList<>();

        names.add("salma");
        names.add("mohamed");
        names.add("manar");
        names.add("omnia");
        names.add("salma");
        names.add("mohamed");

        System.out.println(names.indexOf("mohamed"));
        System.out.println(names.lastIndexOf("mohamed"));

        boolean hasSalma = names.contains("salma");
        boolean hasJudy = names.contains("judy");

        System.out.println(hasJudy);
        System.out.println(hasSalma);

        System.out.println("---------------------------------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = list1;

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1 == list2);
        System.out.println(list1.equals(list2));

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        l1.add(10);
        l2.add(10);

        System.out.println(l1 == l2);
        System.out.println(l1.equals(l2));

        ArrayList<Integer> n1 = new ArrayList<>();
        ArrayList<Integer> n2 = new ArrayList<>();

        n1.add(2);
        n1.add(3);
        n1.add(4);

        n2.add(4);
        n2.add(3);
        n2.add(2);


        System.out.println(n1.equals(n2));

        System.out.println(n1.isEmpty());
        System.out.println(n2.isEmpty());

        n1.clear();
        n2.clear();

        System.out.println(n1.isEmpty());
        System.out.println(n2.isEmpty());

        System.out.println("---------------------------------------------------");








    }
}
