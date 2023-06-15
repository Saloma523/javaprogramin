package day27_statics_AccessModifiers;

public class staticBlock {

    public static void main(String[] args) {

        System.out.println("main method");

        new staticBlock();
        new staticBlock();
        new staticBlock();
    }

    static {
        System.out.println("static block");
    }
}
