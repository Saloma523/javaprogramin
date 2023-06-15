package day15_loopBranchesStatements;

public class sumOfEven {
    public static void main(String[] args) {



        for (int i = 50; i < 101; i++) { // to get even numbers we can also increase i+=2

            if(i % 2 != 0){

                continue;
            }
            System.out.println( "" + i );
        }

    }
}
