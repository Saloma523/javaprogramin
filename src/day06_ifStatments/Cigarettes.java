package day06_ifStatments;

public class Cigarettes {

    public static void main(String[] args) {

        int age = 18;

        if(age >= 21 && age >100){

            System.out.println(" You are eligible to buy cigarette");
        }

        if(age < 21 || age > 100){

            System.out.println("You are not eligible to buy cigarette");
        }
    }
}
