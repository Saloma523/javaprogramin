package day07_ifStatments;

public class NestedIf_Intro {
    public static void main(String[] args) {
        int score = 95;

        if(score >=0 && score <= 100) {

            if (score >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("failed");
            }
        }else {

            System.out.println("Invalid score");

        }
        System.out.println("----------------------------------");

        int age = 30;

        if(age >= 1 && age <= 120){

            if(age >= 21){
                System.out.println("Eligible");
            }else{
                System.out.println("not eligible");
            }

        }else{
            System.out.println("invalid age");
        }
        System.out.println("----------------------------------------------");

        int day = 1;
        if(day >=1 && day <= 7){

            if(day == 1 ){
                System.out.println("monday");
            }else if(day == 2){
                System.out.println("Tuesday");
            }else if(day ==  3){
                System.out.println("Wednesday");
            }else if(day == 4){
                System.out.println("thursday");
            }else if(day == 5){
                System.out.println("friday");
            }else if(day == 6){
                System.out.println("Saturday");
            }else if(day == 7){
                System.out.println("sunday");
            }

        }else{
            System.out.println("invalid day");
        }













    }
}
