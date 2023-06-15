package day14_methodsOverload_forLoop;

public class forLoopIntro {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            System.out.println("hello world");
        }
        int sum = 0;
        for(int i = 1; i <=100; i++){
            sum +=i;
        }
        System.out.println(sum);

        for (int i = 'A'; i <= 'Z'; i++) {

            System.out.println(i + "");
        }




        for(int i = 'Z'; i >= 'A'; i--){
            System.out.println(i + "");
        }

    }


}
