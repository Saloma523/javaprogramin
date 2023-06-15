package day15_loopBranchesStatements;

public class break_statement {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if(i == 5){
                break;
            }
        }


        System.out.println("--------------------------------");


        for (int i = 'A'; i <= 'Z'; i++) {
            System.out.println(i);
            
            if(i == 'F'){
                break;
            }
            
        }

        System.out.println("-----------------------------------------------");

        for (;  ; ) {
            System.out.println("hello");
            break;
            
        }
    }
}
