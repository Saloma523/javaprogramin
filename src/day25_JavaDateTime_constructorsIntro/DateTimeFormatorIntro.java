package day25_JavaDateTime_constructorsIntro;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatorIntro {
    public static void main(String[] args) {

        DateTimeFormatter df = DateTimeFormatter.ofPattern("M/dd/y,E");

        LocalDate today = LocalDate.now();


        System.out.println(today.format(df));

        LocalDate date1 = LocalDate.of(1990,11,3);

        System.out.println(date1.format(df));

        DateTimeFormatter tf = DateTimeFormatter.ofPattern("HH:mm a");

        LocalTime time1 = LocalTime.of(7,4);

        System.out.println(time1.format(tf));

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/y  HH:mm a");

        LocalDateTime start = LocalDateTime.now();

        System.out.println(start.format(dtf));
    }
}
