package day23_ArrayListMethods;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class warmupTasks {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(55);
        list.add(34);
        list.add(7);
        list.add(9);
        list.add(22);

        int sum = 0;

        for (Integer each : list) {
            sum += each;
        }
        double average = sum / list.size();
        System.out.println(average);

        System.out.println("-----------------------------------------------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(3);
        list2.add(5);
        list2.add(3);
        list2.add(7);
        list2.add(9);
        list2.add(7);

        for (Integer element : list) {

            //int element = 1; to find the frequency of one element
            int frequancy = 0;
            for (Integer each : list) {

                if(each == element){
                    frequancy++;
                }

            }
            if(frequancy == 1){
                System.out.println(element);
                break; // to print the first unique element not all unique elements
            }

        }




    }

}
/*
1. Go to url: https://login.cydeo.com/
			1.1 Sign in to the dashboard app by using your my.cydeo.com account
			1.2 Click the Github JDB Organization App on the dashboard


	2. Write a program that can find the average number from an arrayList of integers


	3. Write a program that can return the first unique elements from an arraylist
			Ex:
				ArrayList = {1, 1, 2, 3, 3, 4, 5, 5, 6}

			output:
				2


 */
