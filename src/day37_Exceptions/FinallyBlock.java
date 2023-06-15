package day37_Exceptions;

public class FinallyBlock {

    public static void main(String[] args) {

        try {
            System.out.println(9/0);
        }catch (RuntimeException e){
            System.out.println("Run  time exception has been caught");
            e.printStackTrace();
        }finally {// always get executed even if the exception is not handled
            {
                System.out.println("finally block");
            }
        }
    }
   

}
