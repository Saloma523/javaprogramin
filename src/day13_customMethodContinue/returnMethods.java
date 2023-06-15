package day13_customMethodContinue;

public class returnMethods {
    public static void main(String[] args) {

       int total =  addition(6, 8);

      int s =  square(9);
      int c = cube(5);

        // void methods dont return any data but return method do


    }

    public static int addition(int n1, int n2) {

        return n1 + n2;
    }
    public static int square(int number){

        return number * number;
    }

    public static int cube(int num){

        return square(num) * num;
    }

}
