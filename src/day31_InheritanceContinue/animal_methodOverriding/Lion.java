package day31_InheritanceContinue.animal_methodOverriding;

public class Lion extends Animal {

    private boolean isAfrican;

    public Lion(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void roar(){
        System.out.println(" lion " + getName() + " is roaring" );
    }

    @Override
    public void eat() {
        System.out.println("lion " + getName() + " is eating");
    }

    @Override
    public String toString() {
        return  super.toString().replace("}" , "") + "African animal" + isAfrican + '\'' + '}';
    }
}
