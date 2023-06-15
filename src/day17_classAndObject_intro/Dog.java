package day17_classAndObject_intro;

public class Dog {

    public String name;
    public String breed;
    public String size;
    public String color;
    public int age;
    public char gender;

    public void setInfo(String name, String breed, char gender , int age, String size, String color){
        this.name = name;
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.gender = gender;
        this. age = age;
    }

    public void eat(){
        System.out.println(name + " is eating");
    }

    public void drink(){
        System.out.println(name + " is drinking");
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }


}
