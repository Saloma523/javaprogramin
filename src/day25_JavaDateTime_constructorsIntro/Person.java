package day25_JavaDateTime_constructorsIntro;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {

    public String name;
    public int age;
    public char gender;
    public LocalDate dateOfBirth;
    public boolean isMarred;
    public boolean isEmployed;

    public Person(String name, int age, char gender, LocalDate dateOfBirth, boolean isMarred, boolean isEmployed) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.isMarred = isMarred;
        this.isEmployed = isEmployed;
    }

    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink){
        System.out.println(name + "is eating " + drink);
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth.format(DateTimeFormatter.ofPattern("MMM/dd/y")) +
                ", isMarred=" + isMarred +
                ", isEmployed=" + isEmployed +
                '}';
    }
}
