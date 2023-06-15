package day37_Exceptions;

public class TryCatchBlocks {

    public static void main(String[] args) {

        System.out.println("program started");

        try {
            System.out.println(9/0);
            System.out.println("try block");
        }catch (ArithmeticException e){
            System.out.println("catch block");
        }


        System.out.println("program end");


        System.out.println("------------------------------------------------");

        System.out.println("program2 started");

        try {
            String str = null;
            System.out.println(str.toLowerCase());
        }catch (RuntimeException e){
            System.out.println("catch block");
        }



        System.out.println("program2 ended");

        System.out.println("------------------------------------------------------");

        System.out.println("program3 started");

        try {
            Thread.sleep(3000);
            System.out.println("try block");
        }catch (InterruptedException e){
            System.out.println("catch block");
        }


        System.out.println("program3 ended");

    }
}
