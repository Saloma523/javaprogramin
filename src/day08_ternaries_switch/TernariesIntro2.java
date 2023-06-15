package day08_ternaries_switch;

public class TernariesIntro2 {
    public static void main(String[] args) {

        int num = 10;
        String result = "";
        if (num > 0) {
            result = "positive";
        } else if (num < 0) {
            result = "negative";
        } else {// num == zero
            result = "zero";
        }
        System.out.println(result);

        System.out.println("--------------------------");

        String result2 = (num > 0) ? "positive" : (num < 0) ? "negative" : "zero";
        System.out.println(result2);

        System.out.println("--------------------------------------");

        int number = 5;
        String day = "";
        if (number == 1) {
            day = "Monday";
        } else if (number == 2) {
            day = "Tuesday";
        } else if (number == 3) {
            day = "Wednesday";
        } else if (number == 4) {
            day = "Thursday";
        } else if (number == 5) {
            day = "Friday";
        } else if (number == 6) {
            day = "Saturday";
        } else {
            day = "sunday";
        }
        System.out.println("-----------------------------");

        String day2 = (number == 1) ? "Monday" : (number == 2) ? "Tuesday" : (number == 3) ? "Wednesday" : (number == 4) ? "Thursday" : (number == 5) ? "Friday" : (number == 6) ? "Saturday" : "Sunday";

        System.out.println("----------------------------");

        int num2 = 10;
        String month = "";


            if (num2 == 1){
                month = "January";
            }else if (num2 == 2){
                month = "February";
            }else if (num2 == 3) {
                month = "March";
            }else if (num2 == 4){
                month = "April";
            }else if (num2 == 5){
                month = "May";
            }else if (num2 == 6) {
                month = "Jun";
            }else if (num2 == 7) {
                month = "July";
            }else if (num2 == 8){
                month = "August";
            }else if (num2 == 9) {
                month = "September";
            }else if (num2 == 10){
                month = "October";
            }else if (num2 == 11) {
                month = "November";
            } else {
                month = "December";
            }
        System.out.println(month);

        System.out.println("------------------------------------");

       String month2 = (num2 == 1)? "January" :(num2 == 2)? "February" :(num2 == 3)? "March" :(num2 == 4)? "April" :(num2 == 5)? "May" :(num2 == 6)? "June" :(num2 == 7)? "July" :(num2 == 8)? "August" :(num2 == 9)? "September" :(num2 == 10)? "October" :(num2 == 11)? "November" : "December";
        System.out.println(month2);

        System.out.println("--------------------------------");

       int score = 80;
        String result3 = "";

        /*if(score >= 0 && score <= 100){
            if(score >= 60){
                result3 = "passed";
            }else{
                result3 = "failed";
            }
        }else{
            result3 = "inalid";
        }
        System.out.println(result3);*/

        System.out.println("-----------------------");

       String result4 = (score >=0 && score <= 100)? (score >= 60)? "passed" : "failed" : "invalid";

        System.out.println("----------------------------------");

        int n = 3;

       String day3 = (n >= 1 && n <= 7)? (n == 1)? "M" :(n == 2)? "T" :(n == 3)? "W" :(n == 4)? "TR" :(n == 5)? "F" :(n == 6)? "S" : "SUN"
                : "not a valid number";
        System.out.println(day3);

        System.out.println("------------------------------------------");






        }
}
