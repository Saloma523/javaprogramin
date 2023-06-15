package day30_InheritanceContinue.TypsOfInheritance;

import java.time.LocalDate;

public class Teacher extends Employee{

    public Teacher(String name, char gender, LocalDate DOB, String employeeID, String jobTitle, double salary) {
        super(name, gender, DOB, employeeID, jobTitle, salary);
    }

    public void teach(){
        System.out.println(getName() + " is teaching");
    }
}
