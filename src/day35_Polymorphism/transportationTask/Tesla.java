package day35_Polymorphism.transportationTask;

public class Tesla extends Car implements AutoPark ,AutoPilot ,Electric {

    public Tesla(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }

    @Override
    public void autoPark() {

    }

    @Override
    public void autoPilot() {

    }

    @Override
    public void charge() {

    }
}
