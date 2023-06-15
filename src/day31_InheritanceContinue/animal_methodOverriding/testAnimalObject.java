package day31_InheritanceContinue.animal_methodOverriding;

public class testAnimalObject {
    public static void main(String[] args) {

        Cat cat = new Cat("emilt" , "bengle" ,'f', 4,"small" , "gray");
        Dog dog = new Dog("max", "husky", 'm',3,"larg", "white");
        Lion lion = new Lion("TIGER", "African", 'm',7,"medium","blak");


        System.out.println(cat);
        System.out.println(dog);
        System.out.println(lion);


        System.out.println("----------------------------------------------");

        cat.eat();
        dog.eat();
        lion.eat();
    }
}
