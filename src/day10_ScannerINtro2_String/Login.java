package day10_ScannerINtro2_String;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        String correctUserName = "cydeo",
                correctPassword = "woodenSpoon";
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your user name");
        String password = input.nextLine();

        System.out.println("Enter your password");
        String userName = input.nextLine();
        input.close();

        if(userName.equals(correctUserName) && password.equals(correctPassword)){
            System.out.println("you are logged in");
        }else{
            System.out.println("incorrect username or password");
        }

    }
}
/*
2. Create a class named LogIn
			2.1 Ask the user to enter the username & password
			2.2 print "You are now logged in" If user entered valid username and password
				otherwise print the error message "Incorrect username or password. Please try again"

			Note: Assume that the valid credentials are:
						username: Cydeo
						password: WoodenSpoon
 */
