package day25_JavaDateTime_constructorsIntro;

import java.time.LocalDate;

public class testPersonObject {
    public static void main(String[] args) {

        Person person1 = new Person("salma", 32,'F', LocalDate.of(1990,5,23),true,false);

        Person person2 = new Person("saeda", 41,'F', LocalDate.of(1982,4,23),true,true);

        Person person3 = new Person("israa", 37,'F', LocalDate.of(1985,5,23),true,false);

        Person person4 = new Person("amed", 31,'M', LocalDate.of(1991,5,23),true,true);


        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
    }
}
