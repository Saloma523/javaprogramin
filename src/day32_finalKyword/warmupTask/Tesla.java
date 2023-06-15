package day32_finalKyword.warmupTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Tesla extends Car{

    public Tesla(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    public void autopilot(){
        System.out.println(getMake() + " " + getModel() + " is in self_driving mode ");
    }

    @Override
    public void start() {
        System.out.println("say\"start\" to start" + getMake() + " " + getModel());
    }

    @Override
    public void setModel(String model) {

        String[] models= {"Model S", "Model Y", "Model x", "Model 3"};
        if(!Arrays.asList(models).contains(model)){
            System.out.println("invalid tesla model");

            System.exit(1);
        }

        super.setModel(model); // this . model = model;

    }

    @Override
    public void setColor(String color) {
        ArrayList<String> colors = new ArrayList<>();
        colors.addAll(Arrays.asList("White", "Red", "Black", "Silver", "Blue", "Brown", "Green"));


        if(!colors.contains(color)){
            System.out.println("invalid color for tesla");
            System.exit(1);
        }
        super.setColor(color);
    }

    @Override
    public void setYear(int year) {
        if(year < 200){
            System.out.println("invalid year");
            System.exit(1);
        }
        super.setYear(year);
    }

    @Override
    public void setPrice(double price) {
        if(price < 50000){
            System.out.println("invalid price");
            System.exit(1);
        }
    }


}
/*
   Extra Conditions for the variables:
	                    1. Model of tesla can only be set to one of the followings:
	                        {"Model S", "Model Y", "Model x", "Model 3" };
	                    2. color of tesla can only be set to one of the followings:
	                        {"White", "Red", "Black", "Silver", "Blue", "Brown", "Green"}
	                    3. year of the tesla can not be less than 2008
	                    4. price of tesla can not be less than 50k
 */
