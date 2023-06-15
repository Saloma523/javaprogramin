package day37_Exceptions;

public class TryCatchBlock2 {

    public static void main(String[] args) {

        System.out.println("program1 started");

        int[] arr = {1,2,3};

        try {
            System.out.println(arr[100]);
        }catch (RuntimeException e){
            e.getMessage();// display details of exception
        }

        System.out.println("program1 ended");

        System.out.println("---------------------------------------------");

        System.out.println("program2 started");

        try {
            System.out.println(8/0);
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("program2 ended");
    }
}
