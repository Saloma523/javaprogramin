package day31_InheritanceContinue.warmupTask;

public class bike extends Vehicle{


    public bike(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    public void rid(){
        System.out.println("Riding " + getBrand() + " " + getModel());
    }
}
/*
Warmup Tasks:
	1. Create a class named Vehicle
			Variables:
				brand, model, year, color, price

			Encapsulate all the fields

			Add a constructor that can set all the fields

			Methods:
				toString()

	2. Create a sub class of Vehicle named Car

			Extra methods:
				drive()

	3. Create a sub class of Vehicle named Bike

			Extra methods:
				ride()

	4. Create a sub class of Vehicle named Boat

			Extra methods:
				sail()

	5. Create a sub class of Vehicle named AirPlane

			Extra methods:
				fly()




 */
