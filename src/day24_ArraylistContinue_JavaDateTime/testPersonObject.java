package day24_ArraylistContinue_JavaDateTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class testPersonObject {
    public static void main(String[] args) {

        person[] people = {new person(),new person(), new person(), new person()};
        people[0].setInfo("salma",'F', LocalDate.of(1989,2,25));
        people[1].setInfo("manar",'F', LocalDate.of(1990,3,24));
        people[2].setInfo("hassan",'M', LocalDate.of(1973,3,20));
        people[3].setInfo("mohamed",'M', LocalDate.of(1960,2,25));

        ArrayList<person> studentList = new ArrayList<>();
        studentList.addAll(Arrays.asList(people));
        System.out.println(studentList);
        studentList.removeIf(p -> p.age > 50);
        System.out.println(studentList);

        for (person each : studentList) {
            System.out.println(each.name + " " + each.dateOfBirth);

        }

    }
}
