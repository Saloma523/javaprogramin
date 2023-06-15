package day20_arrayUtilityAndEachLoop;

import java.util.Arrays;

public class ArrayUtilitieMethods {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        String result = Arrays.toString(arr);
        System.out.println(result);

        System.out.println("-------------------------------------");

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};

        boolean r = Arrays.equals(arr1, arr2);
        System.out.println(r);


        char[] c1 = {'a', 'b', 'c'};
        char[] c2 = {'c', 'a', 'b'};

        boolean c = Arrays.equals(c1, c2);
        System.out.println(c);


        String[] s1 = {"A", "B", "C" };
        String[] s2 = {"A", "C", "B" };

        boolean s = Arrays.equals(s1, s2);
        System.out.println(s);

        System.out.println("----------------------------------------------------------------------");

        int[] ar = {1,2,3,5,7,8,12,34,45,0};
        Arrays.sort(ar);// it organize the numbers from min to max

        System.out.println(Arrays.toString(ar));
        System.out.println("minimum number is " + ar[0]);
        System.out.println("the maximum number is " + ar[ar.length-1]);

        System.out.println("-------------------------------------------------------------------------");

        String[] students = {"salma", "mohamed","ahmed","ali","abas"};

         Arrays.sort(students);

        System.out.println(Arrays.toString(students));

        System.out.println("-------------------------------------------------------------");

        int[] array = {1,4,5,6,7,8};
        int[] array2 = Arrays.copyOf(array,6);

        System.out.println("--------------------------------------------------");

        int[] a1 = {1,2,3,4,5};
        int[] a2 = {6,7,8,9,10};

        int[] a3 = Arrays.copyOf(a1, a1.length + a2.length);

        for (int i = 0,j = a1.length; i < a2.length; i++,j++) {

            a3[j] = a2[i];

        }
        System.out.println(Arrays.toString(a3));

        System.out.println("-----------------------------------------------------------------");

        char[] ch = {'A','B','C','D','E','E','F'};

        char[] result1 = Arrays.copyOf(ch,20);

        System.out.println(Arrays.toString(result1));

        char[] result2 = Arrays.copyOfRange(ch,2,4); //exclude ending index

        System.out.println(Arrays.toString(result2));

        char[] result3 = Arrays.copyOfRange(ch,2,ch.length-1);










    }
}
