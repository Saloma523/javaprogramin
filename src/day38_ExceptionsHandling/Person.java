package day38_ExceptionsHandling;

public class Person {

    private String name;
    private int age;
    private final char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;

        if(!(gender == 'M' || gender == 'F')){
            throw new RuntimeException("Invalid gender");
        }
        this.gender = gender;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {

        if(age == 0){
            throw new RuntimeException("AGE HAS NOT BEEN SET ");
        }
        return age;
    }

    public void setAge(int age) {

        if(age < 0 || age > 150){
            throw new RuntimeException("invalid age");
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }
}
