package day05_operators;

public class RelationalOperators2 {

    public static void main(String[] args) {

        //==: apply to any two values with the same data type

        System.out.println(1000 == 2000);//false

        System.out.println("java" == "java");//true

        System.out.println("java" == "JAVA");//false

        System.out.println("Muhtar" == "Good guy");//fals

        System.out.println(true == false);//false

        System.out.println("------------------------------");

        System.out.println(1000 != 2000);//true

        System.out.println("java" != "java");//false

        System.out.println("java" != "JAVA");//true

        System.out.println("Muhtar" != "Good guy");//true

        System.out.println(true != false);//true




    }
}
