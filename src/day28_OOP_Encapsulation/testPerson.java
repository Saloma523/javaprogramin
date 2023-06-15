package day28_OOP_Encapsulation;

import java.time.LocalDate;

public class testPerson {
    public static void main(String[] args) {

        Person person1 = new Person("salma",32,'M', LocalDate.of(2024,4,2));

        System.out.println(person1);
    }
}
