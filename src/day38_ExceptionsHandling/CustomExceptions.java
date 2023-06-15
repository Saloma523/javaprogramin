package day38_ExceptionsHandling;

import java.io.UncheckedIOException;

class CustomCheckedExceptions extends Exception{

}

class CustomUncheckedExceptions extends RuntimeException{

}
public class CustomExceptions {
    public static void main(String[] args) {

        try {
            throw  new CustomCheckedExceptions();
        }catch (CustomCheckedExceptions e){
            e.printStackTrace();
        }

        System.out.println("-----------------------------------------------");

        throw new CustomUncheckedExceptions();

    }
}
