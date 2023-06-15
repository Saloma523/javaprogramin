package day13_customMethodContinue;

public class returnStatement {
    public static void main(String[] args) {

    }

    public static void eligible(int age){

        if(age <0 || age >= 150){
            System.out.println("invalid age");// if age invalid method is terminated
            return;
        }
        if(age >= 21){
            System.out.println("eligible to buy alcohol");
        }else{
            System.out.println("not eligible to buy alcohol");
        }

    }

    public static int multiplication(int n1, int n2){
        return n1 * n2;
    }


}
