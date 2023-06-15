package day17_classAndObject_intro;

public class testEmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee();

        employee1.setInfo("salma", 32,'F',"SDAT",100000, "A12");

        Employee employee2 = new Employee();

        employee2.setInfo("ahmed",30,'M',"java developer",950000,"B33");

        Employee employee3 = new Employee();

        employee3.setInfo("mohamed",33,'M',"doctor",200000,"A23");


        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        employee3.work();


    }
}
