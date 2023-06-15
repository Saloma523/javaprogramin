package day32_finalKyword.personTask;

public class Employee extends Person{

    public Employee(String name, char gender, int age, String jobTit1e, double salary) {
        super(name, gender, age);
       setSalary(salary);
       setJobTit1e(jobTit1e);
    }

    private String jobTit1e;
    private double salary;

    public String getJobTit1e() {
        return jobTit1e;
    }

    public void setJobTit1e(String jobTit1e) {
        this.jobTit1e = jobTit1e;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println(getName() + " is workin");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", age=" + jobTit1e +
                ", age=" + salary +
                '}';
    }
}
