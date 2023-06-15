package day26_constructors_staticsIntro;

public class Iphone{

    public static String brand = "Apple";// same for all iphone
    public String model;// different for all iphone
    public String color;
    public double price;
    public static String OS = "IOS";
    public static String madeIn = "China";
    public static boolean hasBattery = true;
    public static boolean isTouchScreen = true;

    public Iphone(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    /* public static void printPhoneInfo(){// static only accepts static variables
        System.out.println();
    }

    */

    public void printPhoneInfo(){// accept static and object
        System.out.println( " model" + model);
        System.out.println("color" + color);
        System.out.println("madeIn" + madeIn);
        System.out.println("price" + price);
    }

    public static void printOS(){
        System.out.println("Operating system: " + OS);
    }


}
/*
brand, model, color, price, OS, median
 */
