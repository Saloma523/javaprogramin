package day31_InheritanceContinue.shape_methodOverRiding;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius;
    }

    @Override
    public double perimeter() {
        return 6.28 * radius;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +"{" +
                "name='" + getName() + '\'' +
                "a\' radius='" + radius + '\'' +
                "area='" + area() + '\'' +
                "perimeter='" + perimeter()+ '\'' +
                '}';
    }
}
