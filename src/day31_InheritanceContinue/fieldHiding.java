package day31_InheritanceContinue;

class A{

    public  int a = 100;
}

public class fieldHiding extends A{

    public int a = 300;


    public static void main(String[] args) {

        System.out.println(new fieldHiding().a);// parent class hides the variable
    }



}
