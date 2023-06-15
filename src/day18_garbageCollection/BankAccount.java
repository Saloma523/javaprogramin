package day18_garbageCollection;

public class BankAccount {
    public String accountHolder;
    public long accountNumber;
    public double balance;

    public void setInfo(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }

    public void checkeBalance(){
        System.out.println("Your current balance is: " + balance);
    }


    public void deposit(double amount){
        if(amount < 1){
            System.out.println("insufficient amount");
            return;
        }
        balance+=amount;
        System.out.println("depositing $ " + amount + "to " +accountHolder);
    }

    public void withdraw(double amount){
        if(amount > balance){
            return;
        }
        System.out.println("withdrawing $" + amount + " from " +accountHolder);
        balance-=amount;
        
    }
}
