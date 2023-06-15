package day26_constructors_staticsIntro;

public class testIphoneObject {
    public static void main(String[] args) {

      Iphone iphone1 = new Iphone("iphone12","black",1000);

        System.out.println(iphone1.color);
        System.out.println(iphone1.model);
        System.out.println(iphone1.price);// not the right way to call static object

        iphone1.printPhoneInfo();

        System.out.println(Iphone.OS);// the right way calling through the class name
        System.out.println(Iphone.hasBattery);
        Iphone.printOS();


    }
}
