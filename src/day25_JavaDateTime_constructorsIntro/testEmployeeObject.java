package day25_JavaDateTime_constructorsIntro;

import java.time.LocalDate;

public class testEmployeeObject {
    public static void main(String[] args) {

        Employee employee1 = new Employee("salma", 23, 'F', "SDAT",120000, LocalDate.of(2023,10,1));

        Employee employee2 = new Employee("Mohamed", 56, 'M', "SDAT",130000, LocalDate.of(2023,10,20));

        System.out.println(employee1);
        System.out.println(employee2);
    }
}
