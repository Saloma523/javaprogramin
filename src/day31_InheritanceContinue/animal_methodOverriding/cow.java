package day31_InheritanceContinue.animal_methodOverriding;

public class cow extends Animal {

    public cow(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("cow " + getName() + " is eating cow food");
    }


}
