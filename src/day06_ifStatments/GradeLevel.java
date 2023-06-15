package day06_ifStatments;

public class GradeLevel {
    /*
    . Create a class named GradeLevel.java
2. An integer variable named gradeLevel is declared and given, Write
a program to determine and print which school type someone is in
Ex:
gradeLevel = 2
output:
Elementary School
The grade level and types are:
1 ~ 5: Elementary school
6 ~ 8: Middle school
9 ~ 12: High school
13 ~ 16: College
17 ~ 18: Grad School
Assume that the given number is 1 ~ 18
     */

    public static void main(String[] args) {

        int gradeLeve = 2;

        String result = "";// temporary value

        if(gradeLeve >= 1 && gradeLeve >=5){

            result = "Elementary school";
        }
        if(gradeLeve >= 6 && gradeLeve <=8){

           result = "Middle school";
        }
        if(gradeLeve >=9 && gradeLeve <=12){

          result = "High school";
        }
        if(gradeLeve >=13 && gradeLeve <=16){

            result = "College";
        }
        if(gradeLeve >= 17 && gradeLeve <= 18){

            System.out.println("Grade school");
        }

        System.out.println(result);
    }
}
