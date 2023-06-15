package day30_InheritanceContinue.PhoneTask;

public class testPhoneObject {
    public static void main(String[] args) {

        Iphone iphone1 = new Iphone("iphone6","l",1000,"black");
        Samsung samsung1 = new Samsung("samsunA50","m",500,"red");
        Nokia nokia1 = new Nokia("h","s",200,"wight");

        iphone1.call(911);

        samsung1.freeze();

        System.out.println(iphone1);
        System.out.println(samsung1);
        System.out.println(nokia1);



    }




}
