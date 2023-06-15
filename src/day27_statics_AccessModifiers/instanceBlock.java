package day27_statics_AccessModifiers;

public class instanceBlock {

    {// instance block runs before the constructor

        System.out.println("instance block");

    }

    public instanceBlock(){
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        new instanceBlock();
    }

}
