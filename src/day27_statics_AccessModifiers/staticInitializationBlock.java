package day27_statics_AccessModifiers;

public class staticInitializationBlock {

    public static int a;
    public static double b;
    public static String c;

     //public static ExcelSheet sheet;

    static {// initializing static varibles with static block

        a = 100;
        b= 30.8;
        c = "java";

    }

   /* public staticInitializationBlock() {// static should never be set with constructor
        a = 100;
        b = 30.8;
        c = "java";
    }

    */
}
