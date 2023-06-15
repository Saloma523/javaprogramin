package day13_customMethodContinue;

public class returnMethodPractice {
    public static void main(String[] args) {

        System.out.println(isEven(60));
        int num = 200;
        if(isEven(num)){
            System.out.println(num + " is even");
        }else{
            System.out.println(num + " is odd");
        }

    }
    public static boolean isOdd(int num){
     return (num % 2 != 0)? true: false;

    }
    public static boolean isEven(int num){
        return !isOdd(num);
    }
    public static int max(int num1 , int num2){

        return (num1 > num2)? num1 : num2;
    }




}
