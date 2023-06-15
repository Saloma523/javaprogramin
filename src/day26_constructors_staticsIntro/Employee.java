package day26_constructors_staticsIntro;

public class Employee {

    public String name;
    public char gender;
    public String jobTaTitle;
    public double salary;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, char gender) {
        this(name);
        this.gender = gender;
    }

    public Employee(String name, char gender, String jobTaTitle) {
       this(name, gender);
        this.jobTaTitle = jobTaTitle;
    }

    public Employee(String name, char gender, String jobTaTitle, double salary) {
        this(name, gender, jobTaTitle);
        this.salary = salary;
    }

    public Employee(String name, String jobTaTitle) {
       this(name);
        this.jobTaTitle = jobTaTitle;
    }

    public Employee(String name, String jobTaTitle, double salary) {
        this(name,jobTaTitle);
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTaTitle='" + jobTaTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
/*
Class Name: Employee
	Instance variables:
			name, gender, jobTitle, salary

		1st cosntructor: initializes the name only

		2nd constructor: initializes name and gender

		3rd constructor: initializes name, gender and jobTitle

		4th constructor initializes name, gender, jobTitle, Salary

		5th constructor: initializes name, jobTitle

		6th constructor: initializes banem jobTitle, salary

	Instnace methods:
		toString


 */
