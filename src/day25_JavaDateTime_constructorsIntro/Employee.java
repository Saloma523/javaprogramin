package day25_JavaDateTime_constructorsIntro;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {

    public String name;
    public int age;
    public char gender;
    public String gobTitle;
    public double salary;
    public LocalDate hired_date;

    public Employee(String name, int age, char gender, String gobTitle, double salary, LocalDate hired_date) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.gobTitle = gobTitle;
        this.salary = salary;
        this.hired_date = hired_date;
    }// allows as to set all instance variables of the object as soon as the object is created

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", gobTitle=" + gobTitle +
                ", salary=" + salary +
                ", hired_date=" + hired_date.format(DateTimeFormatter.ofPattern("MMM/dd/y")) +
                '}';
    }
}
