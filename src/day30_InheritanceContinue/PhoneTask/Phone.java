package day30_InheritanceContinue.PhoneTask;

import java.util.Arrays;

public class Phone {
    private String brand, model, size;
    private double price;
    private String color;

    public Phone(String brand, String model, String size, double price, String color) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setPrice(price);
        setColor(color);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <= 0 ){
            System.out.println("invalid price");
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void call(long phoneNumber){
        System.out.println(getBrand() + " is calling "+ phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(getBrand() + " is texting "+ phoneNumber);
    }

    public void setColor(String color) {
        String[] colors = {};
        if(Arrays.asList(colors).contains(color)){
        this.color = color;
        }else{
            System.out.println("invalid color:" + "color can only be :" + Arrays.toString(colors));
        }
    }
}
/*
1. Create a named Phone:
				Variables:
					brand, model, size, price, color

				Encapsulate all the fields
					Conditions:
						1. price can not be zero or negative
						2. color can only be set to:
								{"Black", "White", "Silver", "Gold", "Pink"}

				Add a constructor that can set all the fields

				Methods:
					call(long phoneNumber)
					text(long phoneNumber)
					toString()

	2. Create the following subclasses of Phone:


			2.1 Iphone:
					Extra methods:
						faceTime(phoneNumber)
						faceTile(email)

			2.2 Samsung:
					Extra methods:
						freeze()

			2.3 Nokia:
					Extra methods:
						selfDefense()
 */
