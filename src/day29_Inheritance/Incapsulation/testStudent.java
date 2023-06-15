package day29_Inheritance.Incapsulation;

public class testStudent {
    public static void main(String[] args) {

        Student student1 = new Student("salma", 33, 'F','A',"Cydeo");

        System.out.println(student1);

        student1.setName("Omnia");
        student1.setGrade('B');
        System.out.println(student1);

        student1.study();
    }
}
