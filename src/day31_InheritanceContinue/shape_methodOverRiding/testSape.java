package day31_InheritanceContinue.shape_methodOverRiding;

public class testSape {
    public static void main(String[] args) {

        Square square = new Square(5);

        System.out.println(square);
        square.draw();

        Circle circle = new Circle(3.5);

        System.out.println(circle);
    }
}
