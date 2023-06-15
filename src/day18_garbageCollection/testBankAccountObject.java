package day18_garbageCollection;

public class testBankAccountObject {
    public static void main(String[] args) {

        BankAccount account1= new BankAccount();
        account1.setInfo("salma",2334555,12000);

        System.out.println(account1);


        account1.deposit(1000);

        account1.checkeBalance();

        account1.withdraw(500);

        account1.checkeBalance();



    }


}
