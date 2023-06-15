package day08_ternaries_switch;

public class TernariesIntro {
    public static void main(String[] args) {
        int score = 85;
        String result = "";
        if(score >= 60){
            result = "passed";
        }else{
            result = "failed";
        }
        System.out.println(result);

        System.out.println("-----------------------------------------------");

       String  result2 = (score >= 60) ? "passed" : "failed";

        System.out.println("-----------------------------------------");

        int age = 34;
        String r ="";

        if(age >= 21){
            r = "Eligible";

        }else{
            r = "not eligible";
        }
        System.out.println(r);

        System.out.println("-------------------------------");

       String r2 = (age >= 21) ? "eligible" : "not eligible";
        System.out.println(r2);
    }
}
