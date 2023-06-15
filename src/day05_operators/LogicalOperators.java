package day05_operators;

public class LogicalOperators {

    public static void main(String[] args) {

       double salary = 60000;
       int creditScore = 650;
       int age = 25;

       boolean eligibleForLoan = salary >= 30000 && creditScore >= 650 && age>=18;
                                         //true  &&  true     && true
        // only all true values will give true when using &&

        System.out.println(eligibleForLoan);//true

        System.out.println("-----------------------------------");

        int age2 = 16;
        String country = "USA";
        boolean eligibleToVote = age >= 18 && country == "USA";//true

        System.out.println(eligibleToVote);//false

        System.out.println("---------------------------------------");

        String answer = "maybe";
        boolean validAnswer = answer == "yes" || answer == "no";
        System.out.println(validAnswer);// false
        answer = "no";
        System.out.println(validAnswer);//true

        System.out.println("----------------------------------");

        char grade = 'B';
        boolean passExam = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D';
        System.out.println(passExam);//true

        System.out.println("------------------------------------------------");

        System.out.println( !true );// false

        String a = "yes";
        boolean yes = a == "yes";//true
        boolean no = !yes;//false

        int score = 65;
        boolean passed = score >= 60;//true
        boolean failed = !passed;

        System.out.println("passed =" + passed);//true
        System.out.println("failed =" + failed);//false

        System.out.println("-------------------------------");

        System.out.println(true == !false &&  false == !true && true != !true);
        //                       true &&       true  &&      true

        System.out.println();






    }
}
