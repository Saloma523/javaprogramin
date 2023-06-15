package day25_JavaDateTime_constructorsIntro;

import java.time.LocalDateTime;

public class LocalDteTimeIntro {
    public static void main(String[] args) {

       LocalDateTime start = LocalDateTime.now();

        System.out.println(start);

        LocalDateTime t = LocalDateTime.of(1990,11,3,11,0);

        System.out.println(t.getDayOfWeek());


    }
}
