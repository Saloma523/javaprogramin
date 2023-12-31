package day40_CollectionContinue;

import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterableExamble {

    public static void main(String[] args) {

        List<Integer>  list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,45,6,7,8,9,3,4,5,6,7));

       /* for(Integer each : list){

            if(each < 5){
                list.remove(each);
            }
        }

        */

        for (int i = 0; i < list.size(); i++) {

            if(list.get(i) < 5){
                list.remove(i);
            }

        }
        System.out.println(list);

        System.out.println("---------------------------------------------------------------");

        List<Integer>  list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(1,2,3,45,6,7,8,9,3,4,5,6,7));

        list2.iterator();

        Iterator<Integer> it = list2.iterator();

        while (it.hasNext()){
            Integer each = it.next();
            if(each < 5){
                it.remove();
            }
        }

        System.out.println(list2);
        System.out.println("--------------------------------------------------");


        List<Integer>  list3 = new ArrayList<>();

        list3.addAll(Arrays.asList(1,2,3,45,6,7,8,9,3,4,5,6,7));

        for(Iterator<Integer> i = list3.iterator() ; i.hasNext();){

           Integer each = i .next();

           i.remove();

        }

        System.out.println(list3);

        System.out.println("----------------------------------------------------------------");

        List<Integer>  list4 = new ArrayList<>();

        list4.addAll(Arrays.asList(1,2,3,45,6,7,8,9,3,4,5,6,7));

        list4.removeIf(each -> each < 5);

        System.out.println(list4);

    }
}
