package day08_ternaries_switch;

public class Switch_intro {
    public static void main(String[] args) {

    char grade = 'A';
    /*String result = "";

        if(grade == 'A'){
            result = "Excellent";
        }else if(grade == 'B'){
            result = "Great job";
        }else if(grade == 'C'){
            result = "Good";
        }else if(grade == 'D'){
            result = "Passed";
        }else{
            result = "Failed";
        }
        System.out.println(result);

        System.out.println("-------------------------------");*/

        switch(grade){
            case'A':
                System.out.println("Excellent");
                break;
            case'B':
                System.out.println("Great job");
                break;
            case'C':
                System.out.println("Good");
                break;
            case'D':
                System.out.println("Passed");
                break;
            case'F':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid");

        }

        /*
          2. Create a class named Grade, a char variable named grade is given. write a program to print the following messages:
            'A': Excellent
            'B': Great job
            'C': Good
            'D': Passed
            'F': Failed

        Note: Do not use more than one print statement
     */

    }
}
