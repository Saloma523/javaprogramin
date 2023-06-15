package day28_OOP_Encapsulation;

import java.io.FilterOutputStream;

public class testEmployee {
    public static void main(String[] args) {

        Employee employee1 = new Employee("",23,"developer",120000);

        System.out.println(employee1);

        /*employee1.setSalary(-1);

        System.out.println(employee1.getSalary());

        System.out.println(employee1.getName());

         */

    }
}
