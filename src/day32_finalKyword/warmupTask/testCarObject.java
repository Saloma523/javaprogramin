package day32_finalKyword.warmupTask;

public class testCarObject {
    public static void main(String[] args) {


        Toyota toyota = new Toyota("camry", "blue",2020,25000);
        Honda honda = new Honda("Accord","gray",2019,2400);
        Audi audi = new Audi("Q6", "silver",2021,50000);
        BMW bmw = new BMW("X6","Black",2017,45000);
        Tesla tesla = new Tesla("Model 3","Red",2022,55000);

        System.out.println(toyota);
        System.out.println(honda);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(tesla);

        System.out.println("-----------------------------------------------");

        toyota.start();
        honda.start();
        audi.start();
        bmw.start();
        tesla.start();

        System.out.println("----------------------------------------");

        //tesla.setPrice(3000000);
       // tesla.setModel("model M");
       // System.out.println(tesla);

    }
}
