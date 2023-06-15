package day18_garbageCollection;

public class testPizzaObjects {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza();

        pizza1.setInfo('s',1,2);

        System.out.println(pizza1);

        pizza1.calcCost();

        System.out.println("----------------------------------------");

        double total = 0;
        for (int i = 0; i < 20; i++) {


            Pizza small = new Pizza();
            small.setInfo('s',2,3);
            total+= small.calcCost();
            Pizza medium =new Pizza();
            medium.setInfo('m',3,4);
            total+= medium.calcCost();
            Pizza large = new Pizza();
            large.setInfo('l',2,4);
            total+= large.calcCost();


        }
        System.out.println("total = " + total);

    }
}
