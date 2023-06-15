package day27_statics_AccessModifiers;

public class Circle {

    public double radius;
    public double diameter;
    public static double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
       diameter = radius * 2;
    }

    public double calcArea(){// we can not make this method static because static only accept static

        return radius * radius * pi;
    }

    public double calcPerimeter(){// we can not make this method static because static only accept static
        return diameter * pi;
    }

    public static void printPi(){
        System.out.println("pi value : " + pi);
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter + "pi=" + pi + "area= " + calcArea() + "perimeter= " + calcPerimeter()
                +
                '}';
    }
}
/*
Warmup tasks:
    Create a class named Circle:

		Attributes:
			radius, diameter, pi

		Add a constructor that can set All the fields (instances)

		Actions:
			calcArea(): returns the area of Circle
			calcPerimeter(): returns the perimeter of Circle
			printPi(): displays PI value
			toString(): displays the radius, diameter, pi, area and perimeter of the circle when the object of circle is passed in the print statement



Access Modifiers:

	public > protected > default > private



 */
