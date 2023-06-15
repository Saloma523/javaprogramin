package day14_methodsOverload_forLoop;

public class mainMethodOverloading {

    public static void main(String[] args) {
        System.out.println("a");

        main(25);
       main('b');
       main(2.4);

    }

    public static void main(int args) {
        System.out.println("b");

    }

    public static void main(double args) {// take the [] to cale it

        System.out.println("c");
    }

    public static void main(char args) {

        System.out.println("d");
    }

}
