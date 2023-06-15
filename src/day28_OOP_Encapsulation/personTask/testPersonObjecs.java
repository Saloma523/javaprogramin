package day28_OOP_Encapsulation.personTask;

public class testPersonObjecs {

    public static void main(String[] args) {

        Person person1 = new Person("mohamed");
        Person person2 = new Person("salma", 'F');
        Person person3 = new Person("Ali",30);
        Person person4 = new Person("Hassan","English");
        Person person5 = new Person("fatima",23,'F');

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);

        Person.printPlanetName();

        person1.eat("Apple");
        person2.drink("coffee");
    }
}
