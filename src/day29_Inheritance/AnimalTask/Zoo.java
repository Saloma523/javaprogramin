package day29_Inheritance.AnimalTask;

import day27_statics_AccessModifiers.Car;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("max", "husky",'m',4,"large","white");

        System.out.println(dog);

        Cat cat = new Cat();
        cat.setInfo("falicia","stray",'f',3,"small","black");
        System.out.println(cat);

        Tiger tiger = new Tiger();

        System.out.println(tiger);

        System.out.println("-------------------------------------------------");

        dog.eat();
        dog.drink();

        cat.eat();
        cat.drink();


        tiger.eat();
        tiger.drink();
        tiger.hunt();

        System.out.println("-------------------------------------------------");

        dog.bark();
        cat.meow();
        tiger.hunt();

        System.out.println("-----------------------------------------------");

        dog.setGender('F');
        dog.setAge(3);




    }
}
