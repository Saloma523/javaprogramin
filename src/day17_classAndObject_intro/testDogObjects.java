package day17_classAndObject_intro;

public class testDogObjects {
    public static void main(String[] args) {


        Dog dog1 = new Dog();

        dog1.name = "max";
        dog1.breed = "Husky";
        dog1.color = "white";
        dog1.size = "larg";
        dog1.gender = 'M';
        dog1.age = 3;

        dog1.eat();
        System.out.println(dog1);


        Dog dog2 = new Dog();
        dog2.name = "MEME";
        dog2.breed = "Husky";
        dog2.color = "brown";
        dog2.size = "small";
        dog2.gender = 'F';
        dog2.age = 3;


        System.out.println(dog2);

        Dog dog3 = new Dog();
        dog3.setInfo("gege", "gogo", 'F',5, "small","brown");


        Dog dog4 = new Dog();
        dog4.setInfo("Loki","bulldog", 'M',6,"Medium","black");

        dog3.eat();


    }
}
