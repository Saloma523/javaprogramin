package day28_OOP_Encapsulation;

import day28_OOP_Encapsulation.personTask.Person;

public class testStudent {
    public static void main(String[] args) {

       Student student = new Student();
      // student.age = 9;

        student.setAge(6);

        System.out.println(student.getAge());

        student.setName("sa2lma");
    }
}
