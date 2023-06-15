package day25_JavaDateTime_constructorsIntro;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimePractice {
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/y");

        LocalDateTime start = LocalDateTime.of(2020,11,24,1,0);

        System.out.println(start.format(dtf));
    }
}
