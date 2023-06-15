package day22_wrapperClassMethods_ArrayList;

import java.util.ArrayList;

public class iteratingArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(12);
        numbers.add(2);
        numbers.add(5);
        numbers.add(45);
        numbers.add(4);
        numbers.add(3,4);

        System.out.println(numbers);

        System.out.println("-----------------------------------------------");

        for(int i = 0; i < numbers.size() ; i++){
            int num = numbers.get(i);
        }

        for(int i = numbers.size()-1; i >=0 ;i--){
            System.out.println(numbers.get(i));
        }

        for (Integer each : numbers) {
            System.out.println(each);

        }
    }
}
