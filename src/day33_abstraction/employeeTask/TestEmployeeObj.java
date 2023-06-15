package day33_abstraction.employeeTask;

public class TestEmployeeObj {

    public static void main(String[] args) {

       //Employee employee = new Employee(); // employee is abstract that is why it can not be instantiated

        Teacher teacher = new Teacher("omer",23,'M',"A1","math teacher",75000);
        Developer developer = new Developer("mohamed",43,'M',"B3","full stac developer",120000,"java");
        Driver driver = new Driver("sara",34,'F',"C3","Uber driver",60000);
        Tester tester = new Tester("salma", 32,'F',"D2","Full stac tester",130000);

        System.out.println(teacher);
        System.out.println(developer);
        System.out.println(driver);
        System.out.println(tester);

        teacher.work();
        developer.work();
        driver.work();
        tester.work();



    }
}
