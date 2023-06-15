package day05_operators;

public class RelationalOperators {

    public static void main(String[] args) {

        int a = 1000;
        int b = 100;
        System.out.println(a > b);//true
        boolean aIsGrater = a > b;
        System.out.println(aIsGrater);

        System.out.println(a < b);//false

        System.out.println("---------------------------------");

        int score = 75;
        boolean passed = score >= 60;
        System.out.println(passed);

        System.out.println("--------------------------");
        int age = 21;

        boolean buyAlchole = age >= 21;
        System.out.println(buyAlchole); // true

        System.out.println("---------------------------------------");

        System.out.println(100 > 100);// false
        System.out.println(100 >= 100);// true
        System.out.println(100 >= 85);//false

        System.out.println("------------------------------------------------");

        score = 48;// new value for score assigned from the top

        boolean failed = score < 60;
        System.out.println(failed);//true

        System.out.println(100 < 1000);//true
        System.out.println(100 < 20);//false

        System.out.println("-------------------------------------------------");

        System.out.println(95 <= 100);// true, one expression need to be true
        System.out.println(100 <= 100);// true
        System.out.println(10 <= 5);// false

        System.out.println("----------------------------------------------");

        System.out.println('a' < 'b');// char can be used because carectors have numbers





    }
}
