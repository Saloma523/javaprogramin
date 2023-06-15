package day27_statics_AccessModifiers;

public class CydeoStudents {

    public String name;
    public int age;
    public char gender;
    public static String schoolName;
    public static String secretWord;

    public CydeoStudents(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    static {
        schoolName = "cydeo";
        secretWord = "";
    }

    public String toString() {
        return "CydeoStudents{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender + ", school name=" + schoolName + ", secret word=" + secretWord +
                '}';
    }
}
