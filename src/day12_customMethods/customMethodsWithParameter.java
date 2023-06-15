package day12_customMethods;

public class customMethodsWithParameter {
    public static void main(String[] args) {
        oddOrEvenOrZero(5000);
        maximumNumber(100,200);
        eligibleToBuyAlcohol(24);
        gradeOfStudent(70);
        initials("salma", "ahmed");


    }

    public static void oddOrEvenOrZero(int number){// the method verifies if a number is odd or even

        if(number % 2 == 0){
            System.out.println(number + " is even");
        }else if (number % 2 != 0){
            System.out.println(number + " is odd");
        }else{
            System.out.println(number + "is zero");
        }

    }


    public static void eligibleToBuyAlcohol(int age){
        if(age >= 21){
            System.out.println("you are eligible to buy alcohol");
        }else{
            System.out.println("you are not eligible to buy alcohol");
        }

    }

    public static void gradeOfStudent(int grade){

       if(grade >= 90){
           System.out.println("your score is: A");
       }else if(grade >=80){
           System.out.println("your score is: B");
       }else if(grade >= 70){
           System.out.println("your score is: C");
       }else if(grade >= 60){
           System.out.println("your score is:D");
       }else{
           System.out.println("your score is: F");
       }
    }

    public static void maximumNumber(int num1, int num2){

        if(num1 > num2){
            System.out.println(num1 + " is the maximum number");
        }else if(num2 > num1){
            System.out.println(num2 + " is the maximum number");
        }else{
            System.out.println("egual");
        }
    }

    public static void initials(String firstName, String lastName) {

        String f = firstName.substring(0,1).toUpperCase();

       String l = lastName.substring(0,1).toUpperCase();
        System.out.println("initial is: " + f + l);


    }

}

