package day07_ifStatments;

public class LoanApplication {
    public static void main(String[] args) {
        int salary = 50_000;
        int creditScore = 800;
        String result = "";

        if(salary >= 45000 && creditScore >=700){
            result = "you are eligible";
        }else{
            result = "you are not eligible";
        }
        System.out.println(result);

    }

    /*
    Warmup Tasks:
    1. Create a class named LoanApplication. two variables named salary and createdScore are declared and given, write a program that can check if the person is eligible to apply for a loan
            Note:In order to be eligible for a loan:
                    1. salary: at least 45K
                    2. credit score: at least 700

     */
}
