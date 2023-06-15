package day38_ExceptionsHandling;

import java.sql.SQLOutput;

public class TestPerson {

    public static void main(String[] args) {

        Person person = new Person("salma",32,'F');

        System.out.println(person);

       try {
           person.setAge(-25);
       }catch (RuntimeException e){

       }
    }
}
