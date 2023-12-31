package day36_Polymorphism_casting;

import day30_InheritanceContinue.PhoneTask.Iphone;
import day30_InheritanceContinue.PhoneTask.Nokia;
import day30_InheritanceContinue.PhoneTask.Phone;
import day30_InheritanceContinue.PhoneTask.Samsung;

public class warmupTask {

    public static void main(String[] args) {


        Phone[] phones = {
                new Iphone("Iphone 11 Pro", "Large",900, "Black"),
                new Iphone("Iphone 12 Pro Max", "Large", 1200,"Black"),
                new Iphone("Iphone 9", "Medium",250 ,"Gold" ),
                new Samsung("Galaxy S19", "Medium", 700,"Pink"),
                new Samsung("Galaxy S20", "Large", 850,"Silver" ),
                new Samsung("Galaxy S21", "Large",270, "Red"),
                new Nokia("XR20", "Small", 200,"Blue"),
                new Nokia("G10", "Medium", 99,"Gray"),
                new Nokia("G50", "Large", 230,"Silver"),
                new Iphone("Iphone 12 Pro", "Large", 1200,"Black") ,
                new Iphone("Iphone 11 Pro Max", "Large", 1100,"Silver") ,
                new Samsung("Galaxy S18", "Medium",740, "White"),
                new Samsung("Galaxy S17", "Large", 650,"Silver" ),
                new Nokia("G10", "Medium", 99,"Black" ),
                new Iphone("Iphone 6", "Smalle", 400,"Gold") ,
                new Iphone("Iphone 7", "Smalle", 500,"White")
        };

        for(Phone each: phones){
            System.out.println(each.getModel() + " _ " + each.getColor() + " _ " + each.getPrice());
        }

        System.out.println("-----------------------------------------------------------------------");

        int iphoneCount = 0;

        for(Phone each: phones){
            if(each instanceof Iphone){
                iphoneCount++;
            }
        }

        System.out.println(iphoneCount);

        System.out.println("-------------------------------------------------------------------------");

        int countSamsung = 0;
        for(Phone each: phones){
            if(each instanceof  Samsung){
                countSamsung++;
            }
        }

        System.out.println(countSamsung);

        System.out.println("--------------------------------------------------------------------------");

        for(Phone each: phones){
            if(each instanceof Iphone || each instanceof Samsung){
                if(each.getPrice() >= 700)
                System.out.println(each.getModel());
            }
        }









        /*1. print the model, color and price of each phone object in the following format
        model - color - price

        2. How many Iphones in the array of phones?

        3. How many Samsungs in the array of phones?

        4. Display the models of Iphones and samsung that has the price of 700 or greater

         */



    }
}
