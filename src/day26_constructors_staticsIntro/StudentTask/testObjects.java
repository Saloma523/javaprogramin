package day26_constructors_staticsIntro.StudentTask;

import java.util.Arrays;

public class testObjects {
    public static void main(String[] args) {

        Student student1 = new Student("Salma",32,'F',"A12");
        Student student2 = new Student("Manar",20,'F',"B22");
        Student student3 = new Student("Ahmed",30,'M',"A33");
        Student student4 = new Student("Mohamed",33,'M',"C88");
        Student student5 = new Student("Omnia", 25,'F',"D21");

        Student[] students = {student2,student3,student4,student5};

        StudentsGroup group1 = new StudentsGroup("Java Turties",1);

        group1.addStudent(student1);

        group1.addStudent(students);

        group1.addStudent("Hassan",24,'M',"Q32");

        System.out.println(group1);

        group1.removeStudent("Q32");

        System.out.println(group1);

        for(Student each: group1.students){
            System.out.println(each.name + " : " + each.id);
        }

        Student student6 = new Student("Somia",26,'F',"A22");
        Student student7 = new Student("Maha",22,'F',"B52");
        Student student8 = new Student("Ali",39,'M',"A35");
        Student student9 = new Student("Marwan",34,'M',"C89");
        Student student10 = new Student("Osman", 28,'F',"D25");

        StudentsGroup group2 = new StudentsGroup("Java lovers",2);

        Student[] students2 = {student6,student7,student8,student9,student10};
        group2.addStudent(students2);

        System.out.println(group2);


        Student student11 = new Student("Samia",16,'F',"A29");
        Student student12 = new Student("Mona",24,'F',"B82");
        Student student13 = new Student("Aheed",32,'M',"D25");
        Student student14 = new Student("Muhktar",31,'M',"H81");
        Student student15 = new Student("Omema", 23,'F',"D45");

        StudentsGroup group3 = new StudentsGroup("Java java",3);

        Student[] students3 = {student11,student12,student13,student14,student15};

        group3.addStudent(students3);


        Student student16 = new Student("Sahar",19,'F',"E29");
        Student student17 = new Student("Islam",41,'F',"L82");
        Student student18 = new Student("Saim",35,'M',"M25");
        Student student19 = new Student("Gamal",21,'M',"T81");
        Student student20 = new Student("Rawaa", 20,'F',"S45");

        Student[] students4 = {student16,student17,student18,student19,student20};

        StudentsGroup group4 = new StudentsGroup("Java nerds",4);

        group4.addStudent(students4);



        StudentsGroup[] groups = {group1,group2,group3,group4};

        System.out.println(Arrays.toString(groups));


    }
}
/*
3. Create a class named TestObjects
	            3.1 Create 5 Student objects
	            3.2 Create a StudentGroup object
	            3.3 Add all the student objets to the StudentsGroup object students list
 */
