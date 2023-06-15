package day14_methodsOverload_forLoop;

public class methodOverloadPractice {

    public static void main(String[] args) {

        System.out.println(sum(2,3));
        System.out.println(sum(2.5,3.5,1.9));
        System.out.println(sum(2, 32.4));

    }

    public static int sum(int n1, int n2){
        return n1 +n2;
    }
    public static int sum(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }
    public static int sum(int n1, int n2, int n3, int n4){
        return n1 + n2 + n3 + n4;
    }

    public static double sum(double n1, double n2){
        return n1 + n2;
    }

    public static double sum(double n1, double n2, double n3){
        return sum(n1, n2)+ n3;
    }

    public static double sum(double n1, double n2, double n3, double n4){
        return sum(n1, n2, n3) + n4;
    }
}
