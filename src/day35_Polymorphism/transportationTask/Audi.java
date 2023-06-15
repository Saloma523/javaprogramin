package day35_Polymorphism.transportationTask;

public class Audi extends Car implements AutoPark{

    public Audi(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void transportPeople() {

        System.out.println();
    }

    @Override
    public void start() {

    }


    @Override
    public void autoPark() {

    }
}
/*
7. Create a subclass of car named Audi that implements AutoPark

 */