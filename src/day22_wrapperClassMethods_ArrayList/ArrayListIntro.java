package day22_wrapperClassMethods_ArrayList;

import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 3;
        arr[2] = 4;
        arr[3] = 6;
        arr[4] = 1;


        arr[5] = 3;// index out of bound exception

        System.out.println("--------------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list);
        System.out.println(list.size());
    }
}
