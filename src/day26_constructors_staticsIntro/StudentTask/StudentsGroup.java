package day26_constructors_staticsIntro.StudentTask;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsGroup {

    public String  groupName;
    public int groupId;
    public ArrayList<Student> students;

    public StudentsGroup(String groupName, int groupId) {// create the students group by using group name and group id
        this.groupName = groupName;
        this.groupId = groupId;
        students = new ArrayList<>(); // size is : 0
    }

    public void addStudent(Student student){// it takes one student object and add it to the  arrayList of students

        students.add(student);

    }

    public void addStudent(Student[] students){
        this.students.addAll(Arrays.asList(students));
    }// taks one array of student, and add the array of stusent to the arrayList of students

    public void addStudent(String name , int age, char gender, String id ){// take student info and create new object from the info then add the student object to the ArrayList of student

        students.add(new Student(name,age,gender,id));

    }

    public void  removeStudent(String id){// take the id and remove the specified student with the given id
        students.removeIf(p-> p.id.equals(id));
    }


    public String toString() {
        return "StudentsGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupId='" + groupId + '\'' + " number of students = " + students.size() +
                '}';
    }
}
/*
2. Create a custom class named StudentsGroup
	            Attributes:
	                groupName, groupId, students (ArrayList<Students>)

	            Add a constructor that can set the groupId and groupName
	                    initialize students arraylist in the constrcutor's body

	            Methods:
	                addStudent(Student): adds the specified student to the students arrayList

	                removeStudent(id): removes the student with the specified id from the students arraylist

	                toString(): displays the groupName, groupId and total number of students when a group object is passed in the print statement
 */
