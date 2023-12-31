package day28_OOP_Encapsulation;

public class Employee {



    private String name;
    private int age;
    private String jobTitle;
    private double salary;

    public Employee(String name, int age, String jobTitle, double salary) {
        setName(name);
        setAge(age);
        setJobTitle(jobTitle);
        setSalary(salary);

    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        if(age < 16){
            System.out.println("invalid age");
            System.exit(1);
        }
        this.age = age;
    }

    private String getJobTitle() {

        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if(jobTitle.isBlank() || jobTitle.isEmpty()) {
            System.out.println("job title can not be empty or  blank");
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }

    public String getName() {
        if(name == null){
            return "unknown";
        }
        return name;
    }

    public void setName(String name) {

        if(name.isEmpty() || name.isBlank()){
            System.err.println("employee name can not be empty or blank");
            System.exit(1);
        }
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {

        if(salary < 0){
            System.err.println("salary can not be negative");
            System.exit(1);
        }
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", salary=" + getSalary() +
                '}';
    }
}
