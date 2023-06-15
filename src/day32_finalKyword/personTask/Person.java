package day32_finalKyword.personTask;

import java.time.LocalDate;

public class Person {

    private String name ;
    private final char gender;
    private final int age; // if the instance variable is final we can not generate setters for it
    public static final LocalDate DOB;
    private static final int numberOfHead;



    static {
        DOB = LocalDate.of(1990,5,23);
        numberOfHead = 1;
    }

    public Person(String name, char gender, int age) {
        setName(name);
        if(gender != 'M' || gender != 'F'){
            System.out.println("invalid gender");
            System.exit(1);
        }
        this.gender = gender;

        if(age <= 0){
            System.out.println("invalid age");
            System.exit(1);
        }

        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void eat(){
        System.out.println(name + " is eating");
    }

    public void drink(){
        System.out.println(name + " is drinking");
    }

    public void sleep(){
        System.out.println(name + "is sleeping");
    }

    public final void breath(){
        System.out.println(name + " is breathing");
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
