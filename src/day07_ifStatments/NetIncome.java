package day07_ifStatments;

public class NetIncome {
    public static void main(String[] args) {
        double salary = 130000;
        boolean isMarried = true;
        double taxRate = 0;


        if(salary >= 130000){
            taxRate = .35;
        }
        if(salary >= 100000 && salary < 130000){
            taxRate = .30;
        }

        if(salary >= 80000 && salary < 99000){
            taxRate = .25;
        }

        if(salary < 80000){
            taxRate = .20;
        }

        if(isMarried){
            taxRate -= .05;
        }
        double totalTax = salary * taxRate;// we can calculate this way
        double netIncome = salary - totalTax;
        //double netIncome = salary * (1-taxRate); //or we can calculate it this way
        // the 1 it means 100% minus taxRate
        System.out.println("net income = " + netIncome);

    }

    /*
      3. Create a class named NetIncomeCalc, Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition:
                	if the person is married, he/she will pay 5% less tax

     */
}
