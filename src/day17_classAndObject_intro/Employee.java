package day17_classAndObject_intro;

public class Employee {

    public String name;
    public int age;
    public char gender;
    public String jobTitle;
    public double salary;
    public String id;

    public void setInfo(String name, int age, char gender, String jobTitle, double salary, String id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.id = id;
    }

// stets all the attribute of the employee object at once

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", id='" + id + '\'' +
                '}';
    }


    // to avoid getting hashcode when we are printing

    public void work(){
        System.out.println(name + " is working");
    }
}
