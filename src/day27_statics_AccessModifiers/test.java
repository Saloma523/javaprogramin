package day27_statics_AccessModifiers;

public class test {
    public static void main(String[] args) {

        System.out.println(staticInitializationBlock.a);
        System.out.println(staticInitializationBlock.b);
        System.out.println(staticInitializationBlock.c);

        System.out.println(AcccesModifier.publicData);// public is always accessible  inside and outside the package
        System.out.println(AcccesModifier.protectedData);// protected is not always accessible
        System.out.println(AcccesModifier.defaultData);// with the same package is accessible
       // System.out.println(AcccesModifier.privateData);// private is not accessible outside the same class

        AcccesModifier obj = new AcccesModifier();
    }
}
