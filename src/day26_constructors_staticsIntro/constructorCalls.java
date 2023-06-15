package day26_constructors_staticsIntro;

public class constructorCalls {

    public constructorCalls(){
        System.out.println("default constructor");
    }

    public constructorCalls(int a){
        this();
        System.out.println("construtor with int argument");
    }

    public constructorCalls(double a){
        this(3);

        System.out.println("construtor with double argument");
    }

    public constructorCalls(String a){
        this(3.8);

        System.out.println("construtor with String argument");
    }


    public static void main(String[] args) {

        method1();
        method2();
    }

    public static void method1(){
        System.out.println("method 1");
    }

    public static void method2(){
        method1();
        System.out.println("method 2");
    }
}
