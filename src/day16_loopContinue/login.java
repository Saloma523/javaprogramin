package day16_loopContinue;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String u, p;
        int attempt = 3;
        do{
            System.out.println("enter your username");
            u = input.next();
            System.out.println("enter your password");
            p = input.next();

            attempt--;
            if(attempt == 0){
                break;
            }
        }while (!(u.equals("cydeo"))&& p.equals("cydeo123"));

    }
}
