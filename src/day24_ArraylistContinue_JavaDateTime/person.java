package day24_ArraylistContinue_JavaDateTime;

import java.time.LocalDate;

public class person {

    public String name;
    public int age;
    public char gender;
    public LocalDate dateOfBirth;


    public void setInfo(String name,  char gender, LocalDate dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.age = LocalDate.now().getYear() - dateOfBirth.getYear();
    }

    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
