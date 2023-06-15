package day27_statics_AccessModifiers;

public class testCircleObjects {
    public static void main(String[] args) {

        Circle circle1 = new Circle(3.5);

        Circle circle2 = new Circle(5);


        System.out.println(circle1);
        System.out.println(circle2);

       // System.out.println(circle1.pi); not the right way to cal static through the object
        //System.out.println(circle2.pi);

        System.out.println(Circle.pi);// the right way to call through the class name
    }
}
