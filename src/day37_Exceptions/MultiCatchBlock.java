package day37_Exceptions;

import day35_Polymorphism.transportationTask.Car;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MultiCatchBlock {

    public static void main(String[] args) {

        System.out.println("program1 started");

        Car car = null;

        try {
            car.drive();
        }catch (ArithmeticException e){
            System.out.println("first catch block");
            e.printStackTrace();
        }catch (ClassCastException e){
            System.out.println("second catch block");
            e.printStackTrace();
        }catch (NullPointerException e){
            System.out.println("third catch block");
            e.printStackTrace();
        }catch (IndexOutOfBoundsException e){
            System.out.println("fourth catch block");
            e.printStackTrace();
        }catch (RuntimeException e){// parent catch block should be last always when we use multiple catch blocks
            System.out.println("fifth catch block");
            e.printStackTrace();
        }

        System.out.println("program1 ended");

        System.out.println("-----------------------------------------------------------");

        System.out.println("program2 started");


        try {
            FileInputStream file = new FileInputStream("File path");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


      /*  try{

        }catch (){

        }try {

        }try{

        }try{

        }

       */

    }
}
