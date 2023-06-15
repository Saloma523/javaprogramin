package day27_statics_AccessModifiers;

public class testCydeoStudent {

    public static void main(String[] args) {

        System.out.println(CydeoStudents.schoolName);

        CydeoStudents students1 = new CydeoStudents("salma",32,'F');
        CydeoStudents students2 = new CydeoStudents("Ahmed",30,'M');

        System.out.println(students1);
        System.out.println(students2);

        System.out.println(students1.schoolName);
        System.out.println(students2.secretWord);




    }
}
