package day27_statics_AccessModifiers;

public class staticB_vs_instanceB_vs_comstructor {

    public staticB_vs_instanceB_vs_comstructor(){
        System.out.println("constructor");
    }

    {
        System.out.println("instance block");
    }

    static {

        System.out.println("static block");
    }

    public static void main(String[] args) {

        System.out.println("main method");

        new staticB_vs_instanceB_vs_comstructor();

    }
}
