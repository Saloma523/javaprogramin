package day34_abstraction_Interface.carTask;

public abstract class Car {

    private final String make, model;
    private String color;
    private final int year;
    private double price;

    public Car(String model, String color, int year, double price) {
        this.make = getClass().getSimpleName();// set the class name to the make of the car
        this.model = model;
        this.color = color;
        if(year < 1866){
            System.out.println("invalid year");
            System.exit(1);
        }
            this.year = year;

        this.price = price;
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
        if(price <= 0){
            System.out.println("invalid price " + price);
        }
        this.price = price;
    }

    protected final void stop(){
        System.out.println("press the break to stop " + make + " " + model);
    }

    protected abstract void start();

    @Override
    public String toString() {
        return make +"{" +

                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
