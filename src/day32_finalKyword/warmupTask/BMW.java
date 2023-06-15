package day32_finalKyword.warmupTask;

public class BMW extends Car{

    public BMW(String model, String color, int year, double price) {
        super(model, color, year, price);
    }


    @Override
    public void start() {
        System.out.println("call the mechanic or jump start" + getMake() + " " + getModel());
    }
}
