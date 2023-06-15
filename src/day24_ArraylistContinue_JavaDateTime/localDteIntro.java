package day24_ArraylistContinue_JavaDateTime;

import java.time.LocalDate;

public class localDteIntro {
    public static void main(String[] args) {

        LocalDate today =  LocalDate.now();

        System.out.println(today);

        LocalDate birthday = LocalDate.of(1990,5,25);

        System.out.println(birthday);

        System.out.println("------------------------------------------------");

        System.out.println(today.getYear());
        System.out.println(today.getMonth());
        System.out.println(today.getMonthValue());
        System.out.println(today.getDayOfWeek());
        System.out.println(today.getDayOfMonth());
        System.out.println(today.getDayOfYear());

        System.out.println("-----------------------------------------------");

        today = today.plusYears(1);
        System.out.println(today);

        System.out.println("------------------------------------------");

        LocalDate graduationDate = LocalDate.of(2023,11,30);

        graduationDate = graduationDate.plusYears(2);
        System.out.println(graduationDate);

        graduationDate = graduationDate.plusMonths(7);
        System.out.println(graduationDate);

        graduationDate = graduationDate.plusWeeks(6);
        System.out.println(graduationDate);

        graduationDate = graduationDate.plusDays(100);
        System.out.println(graduationDate);

        System.out.println("--------------------------------------------------");

        LocalDate yourBirthday = LocalDate.of(205,4,1);
        LocalDate yourBrthorsBirthday = yourBirthday.minusYears(2).minusMonths(3);

        System.out.println(yourBirthday);
        System.out.println(yourBrthorsBirthday);

        System.out.println("--------------------------------------------");

        LocalDate birthday1 = LocalDate.of(1994,7,7);
        LocalDate birthday2 = LocalDate.of(1995,5,6);

        boolean r1 = birthday1.equals(birthday2);
        System.out.println(r1);

        System.out.println("--------------------------------------------------");

        LocalDate grad_Date = LocalDate.of(2023,1,1);

        System.out.println(grad_Date.isAfter(LocalDate.of(2022,12,31)));
        System.out.println(grad_Date.isBefore(LocalDate.of(2022,12,31)));

        System.out.println("--------------------------------------------------------");

        System.out.println(LocalDate.now().isLeapYear());

    }
}
