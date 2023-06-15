package day35_Polymorphism;

import day31_InheritanceContinue.shape_methodOverRiding.Circle;
import day32_finalKyword.warmupTask.Audi;
import day32_finalKyword.warmupTask.Honda;
import day33_abstraction.employeeTask.Developer;
import day33_abstraction.employeeTask.Employee;
import day34_abstraction_Interface.animalTask.*;
import day35_Polymorphism.transportationTask.Car;
import day35_Polymorphism.transportationTask.CydeoCar;
import day35_Polymorphism.transportationTask.Tesla;

import java.util.Arrays;

public class PolymorphismPractice {
    public static void main(String[] args) {

        Animal animal = new Eagle("jhone", "American eagle", 'M', 3, "small", "black");

        animal.eat();
        animal.drink();
        animal.sleep();
        // animal.fly();
        // System.out.println(animal.canFly);

        System.out.println("-------------------------------------------------------");

        Lion lion = null;
        Parrot parrot = null;
        Shark shark = null;
        Dolphin dolphin = null;
        Eagle eagle = null;
        Duck duck = null;
        Dog dog = null;
        Cat cat = null;
        CydeoCar cydeoCar = null;

        Flyable[] birds = {parrot, eagle, duck};
        Playable[] a = {dog, cat, parrot};

       // boolean isAnimal = cydeoCar instanceof  Animal; // to use instanceOf is a relationship is a must
        boolean isAnimal = dog instanceof Animal;

        System.out.println("----------------------------------------------------------");

        Car car = new Tesla("tesla","model y", "white",2020,550000);

        boolean isTesla = car instanceof Tesla;

        System.out.println("istesla = " + isTesla);


    }

    public static class Polymorphism_Intro {

        public static void main(String[] args) {

           Dog dog = new Dog("gege", "gogo", 'F',5, "small","brown");
           Cat cat =new Cat("gege", "gogo", 'F',5, "small","brown");



            Eagle eagle = null;
            Lion lion = null;
            Parrot parrot = null;
            Dolphin dolphin = null;
            Shark shark = null;
            Duck duck = null;

            Animal[] animals = {dog,cat,eagle,lion,parrot,dolphin,shark,duck};

            //animals.play;

            System.out.println("--------------------------------------------------");

            String str = "java";

            Integer n = 100;

            Boolean r = false;

            Double d = 10.4;

            Circle circle = new Circle(4);

            Honda honda = new Honda("Accord","gray",2019,2400);
            Audi audi = new Audi("Q6", "silver",2021,50000);
            day32_finalKyword.warmupTask.Tesla tesla = new day32_finalKyword.warmupTask.Tesla("Model 3","Red",2022,55000);

            Object[] objects = {str,n, r ,d,circle, honda,audi,tesla};

            System.out.println(Arrays.toString(objects));

            Employee obj = new Developer("Salma",32,'F',"D1", "Dev",140000,"Java");
            obj.work();

            System.out.println("----------------------------------------------------------------------");

            day32_finalKyword.warmupTask.Car car1 = new day32_finalKyword.warmupTask.Tesla("Model 3","Red",2022,55000);
            car1.start();
            //car1.autoPilot();

            System.out.println("-----------------------------------------------");



        }
    }
}
