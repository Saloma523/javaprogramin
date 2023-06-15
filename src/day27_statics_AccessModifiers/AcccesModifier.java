package day27_statics_AccessModifiers;

public class AcccesModifier {

    public static int publicData = 200;
    protected  static int protectedData = 300;

    static int defaultData = 80; // accessible int the class and package

    private static int  privateData = 90;


    public AcccesModifier(){// only public is accessible outside the package

    }


    public static void PublicAccessModifier(){

    }

    protected static void protectedAccessModifier(){

    }

    protected void PrivateAccessModifier(){

    }

    public static void main(String[] args) {


        System.out.println(publicData);// accessible with in the same class
        System.out.println(protectedData);//accessible with in the same class
        System.out.println(defaultData);//accessible with in the same class
        System.out.println(privateData);// accessible with in the same class

        new AcccesModifier();
    }
}
