package day37_Exceptions;

import java.util.HashMap;

public class Pizza {
    private char size;
    private int numberOfToppings,numberOfCheeseTopping;

    public Pizza(char size, int numberOfToppings, int numberOfCheeseTopping) {
       setSize(size);
       setNumberOfCheeseTopping(numberOfCheeseTopping);
       setNumberOfToppings(numberOfToppings);
    }


    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public int getNumberOfToppings() {
        return numberOfToppings;
    }

    public void setNumberOfToppings(int numberOfToppings) {
        this.numberOfToppings = numberOfToppings;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }


    public double calcCost(){
        double totalPrice = 0;

        switch (size){

            case 'S':
            case 's':
                totalPrice = 10 + 2 *(numberOfToppings + numberOfCheeseTopping);
            case 'M':
            case 'm':
                totalPrice = 12 + 2 * (numberOfToppings + numberOfCheeseTopping);
            case 'L':
            case 'l':
                totalPrice = 14 + 2 *(numberOfToppings + numberOfCheeseTopping);
            default:
                System.err.println("Invalid size " + size);


        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfToppings=" + numberOfToppings +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                '}';
    }


    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Pizza)){ // if specified obj is not a pizza
            System.out.println("invalid object: " + obj );
            System.exit(1);
        }

        Pizza pizza = (Pizza) obj;
        if(size == pizza.getSize() ){
          if(numberOfCheeseTopping == pizza.getNumberOfCheeseTopping()){
            return true;
          }
        }
        return false;
    }
}
