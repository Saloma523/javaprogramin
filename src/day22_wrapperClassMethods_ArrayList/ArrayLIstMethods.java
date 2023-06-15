package day22_wrapperClassMethods_ArrayList;

import java.util.ArrayList;

public class ArrayLIstMethods {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);// index 0
        list.add(20);//1
        list.add(23);//2
        list.add(10);//3

        System.out.println(list);

        list.add(1,15);

        System.out.println(list);

        System.out.println("-----------------------------------------------------------------");

        ArrayList<String> studentsList = new ArrayList<>();

        studentsList.add("salma");
        studentsList.add("mohamed");
        studentsList.add("ahmed");

        System.out.println(studentsList.size());
        System.out.println(studentsList);

        String firstStudent = studentsList.get(0);
        String lastStudent = studentsList.get(studentsList.size()-1);

        System.out.println(firstStudent);
        System.out.println(lastStudent);


    }
}
