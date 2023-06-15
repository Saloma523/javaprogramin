package day13_customMethodContinue;

import java.util.Scanner;

public class returnMethoutPractice2 {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        if(num <1 && num >7){
            System.out.println("invalid number");
            return;
        }else{
            System.out.println((num == 1)? "Monday" :(num == 2)? "" :(num == 3)? "" :(num== 4)? "" :(num == 5)? "" :(num == 6)? "" : "");
        }

    }
}
