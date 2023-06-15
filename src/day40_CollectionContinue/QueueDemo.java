package day40_CollectionContinue;

import java.util.*;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<Integer> queue1 = new PriorityQueue<>();// order is random, dose not accept null

        queue1.addAll(Arrays.asList(10,200,300,40,90));
        queue1.addAll(Arrays.asList(10,200,300,40,90));
        queue1.addAll(Arrays.asList(10,200,300,40,90));
        queue1.addAll(Arrays.asList(10,200,300,40,90));
        queue1.addAll(Arrays.asList(10,200,300,40,90));
       // queue1.addAll(Arrays.asList(null,null,null,null));

        System.out.println(queue1);

        int num = queue1.poll();// FIFO

        System.out.println(queue1);

        System.out.println("-------------------------------------------------------");

        Queue<Integer> queue2 = new ArrayDeque<>();// keep the insertion order

        queue2.addAll(Arrays.asList(10,200,300,40,90));
        queue2.addAll(Arrays.asList(10,200,300,40,90));
        queue2.addAll(Arrays.asList(10,200,300,40,90));
        queue2.addAll(Arrays.asList(10,200,300,40,90));
        queue2.addAll(Arrays.asList(10,200,300,40,90));
        // queue2.addAll(Arrays.asList(null,null,null,null));

        System.out.println(queue2);

        queue2.poll();

        System.out.println(queue2);

        System.out.println("-------------------------------------------------");



        Queue<Integer> queue3 = new LinkedList<>();// has index numbers

        queue3.addAll(Arrays.asList(10,200,300,40,90));
        queue3.addAll(Arrays.asList(10,200,300,40,90));
        queue3.addAll(Arrays.asList(null,null,null,null));

        System.out.println(queue3);

        queue3.poll();

        System.out.println(queue3);


        System.out.println("-----------------------------------------");

        LinkedList<Integer> list = new LinkedList<>();

        list.addAll(Arrays.asList(10,200,300,40,90));

        Set<Integer> result = new LinkedHashSet<>();


    }
}
