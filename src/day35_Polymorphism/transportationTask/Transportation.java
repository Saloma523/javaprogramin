package day35_Polymorphism.transportationTask;

public abstract class Transportation {


    private final String make,model;
    private String color;
    private final int year;
    private double price;

    public Transportation(String make, String model, String color, int year, double price) {
       this.make = make;
        this.model = model;
       setColor(color);
        this.year = year;
        setPrice(price);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

   public abstract void transportPeople();
   public abstract void start();

    public void stop(){
        System.out.println("shut off the engine");
    }

    @Override
    public String toString() {
        return "Transportation{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
/*
warmup tasks:
	1. Create an abstract class named Transpotation
				Variables:
					make (final), model (final), color, year(final), price

				Encapsulate all the fields

				Add a constructor that can set all the fields

				abstract methods:
					transportPeople();
					start();

				non abstract methods:
					stop(): "Shut off the engine"
					toString()

	2. Create an interface named AutoPark

				abstract methods:
					autoPark()

	3. Create a sub interface of AutoPark named AutoPilot:

				abstract methods:
						autoPilot()

	4. Create an interface named Electric

				abstract methods:
					charge()


	5. Create an abstract sub class of Transpotation named Car

				extra methods:
					drive()


	6. Create an abstract sub class of Transpotation named Plane that implements Flyable

				non-abstract method:
					land()


	7. Create a sub class of car named Audi that implements AutoPark


	8. Create a sub class of Car named Tesla that implements AutoPark, AutoPilot and Electric




Abstract class vs interface: both are used for achieving abstraction
							 both can not be instantiated
							 both are meant to be inherited
							 both can not be final



						 abstract class: one class can extends one abstract class ONLY

						 				instance & statics both are supported

						 				constructor

						 				4 access modifiers are supported


						 interface: one class can implement multiple interfaces




 */