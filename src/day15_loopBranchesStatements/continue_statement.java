package day15_loopBranchesStatements;

public class continue_statement {
    public static void main(String[] args) {

        for (int i= 1; i < 6; i++) {
            if(i == 4){
                continue;
            }
            System.out.println(i);
        }

        System.out.println("---------------------------------------------------------");


        for (int i = 10; i <= 20; i++) {
            if(i % 2 == 0){
                continue;
            }
            System.out.println(i);
        }

        for (int i = 'A'; i < 'G'; i++) {

            if (i == 'B' || i == 'E') {
                continue;
            }

            System.out.println(i);
        }

        System.out.println("-----------------------------------------------------------");
        //for (int i = 0; i < 10; i++)
            /* without the curlyprasses the for loop and if statement works, but it can print one statement therefore it not a good practice*/









    }
}
