package day31_InheritanceContinue.animal_methodOverriding;

public class Cat extends Animal{

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat(){
        System.out.println("cat " + getName() + " is eating cat food");
    }
}
