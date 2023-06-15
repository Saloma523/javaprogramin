package day34_abstraction_Interface.carTask;

public class Test {
    public static void main(String[] args) {

        Honda honda = new Honda("pilot" ," black",2019,35000);
        Audi audi = new Audi("Q6","Silver", 2020,50000);
        Tesla tesla = new Tesla("model y","white",2022,60000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        System.out.println("------------------------------------------------------------");

        honda.start();
        audi.start();
        tesla.start();
    }
}
