package day06_ifStatments;

public class SingleIfStatementPractice {

    public static void main(String[] args) {

        int number = 155;

        boolean isEven = number % 2 ==0;

        if(isEven){

            System.out.println("Even number");
        }

        if(!isEven){

            System.out.println("Odd number");
        }

        if(number % 2 == 0){

            System.out.println("Even number");
        }



    }
}
