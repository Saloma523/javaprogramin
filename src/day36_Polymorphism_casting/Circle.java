package day36_Polymorphism_casting;

public class Circle {

    private double radius;
    public final static double PI = 3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area(){
        return radius * radius * PI;
    }

    public double perimeter(){
        return radius * PI;
    }





}
