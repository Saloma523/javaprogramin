package day18_garbageCollection;

import day17_classAndObject_intro.Dog;

public class gabageCollection {

    public static void main(String[] args) {

        String s1 = "java";
        s1 = null;

        System.out.println(s1);

        System.out.println("---------------------------------------------------------------------");

        String str1 = "python";
        str1 = "cydeo";


        System.out.println(str1);

        System.out.println("---------------------------------------------------------------");

        Dog dog1 = new Dog();

        dog1.setInfo("jhony","husky",'f',3,"small" ,"black");

        Dog dog2 = new Dog();


        dog2.setInfo("chuck","bulldog",'M', 4,"large", "brown");

        dog1 = dog2;

        System.out.println(dog1);
        System.out.println(dog2);


        // new Dog().finalized(); methould for garbage collection


    }
}
