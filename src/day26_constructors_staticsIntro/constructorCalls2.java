package day26_constructors_staticsIntro;

public class constructorCalls2 {

    public constructorCalls2(){
        System.out.println("default constructor");
    }

    public constructorCalls2(int a){
        this();
        System.out.println("constructor with int argument");
    }

    public constructorCalls2(double a){
        this(3);

        System.out.println("constructor with double argument");
    }

    public constructorCalls2(String a){
        this(3.8);

        System.out.println("constructor with String argument");
    }

    public static void main(String[] args) {

        constructorCalls2 object1 = new constructorCalls2();



        System.out.println("-------------------------------------------------------");

        constructorCalls2 object2 = new constructorCalls2(2);


    }

}
