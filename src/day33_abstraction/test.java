package day33_abstraction;

import java.time.LocalDate;

public class test {
    public static void main(String[] args) {

       CydeoDevStudent student = new CydeoDevStudent("salma", 'F',32,"A1","zero to hero",29);

        System.out.println(student);

        student.eat();
        student.drink();
        student.sleep();

    }
}
