package day30_InheritanceContinue;

public class test {

    public static String name;

    static {
        name = "salma";

    }

    public static void main(String[] args) {

        test test1 = new test();
        test1.name = "omnia";

        test test2 = new test();
        test2.name = "judy";

        test test3 = new test();


        System.out.println(test1.name);
        System.out.println(test3.name);
    }
}
