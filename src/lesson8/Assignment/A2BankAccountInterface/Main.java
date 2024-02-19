package lesson8.Assignment.A2BankAccountInterface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(5000.0, 0.03);
        Scanner sc = new Scanner(System.in);

        //Savings Account
        System.out.print("Current Savings Account Balance: " + savingsAccount.getBalance());
        System.out.print("\nInsert deposit: ");
        double depo = sc.nextDouble();
        savingsAccount.deposit(depo);
        System.out.print("\nSavings Account Balance: RM" + savingsAccount.getBalance());
        
        //withdraw
        System.out.print("\nTotal withdraw: ");
        double wdraw = sc.nextDouble();
        savingsAccount.withdraw(wdraw);
        System.out.print("\nSavings Account Balance: RM" + savingsAccount.getBalance());

        //interest
        System.out.println("\nSavings Account Balance after interest");
        savingsAccount.addInterest();
        System.out.print("\nSavings Account Balance: RM" + savingsAccount.getBalance());

        
        //Checking Account
        CheckingAccount checkingAccount = new CheckingAccount(2000.0, 100.0);
        System.out.print("\nCurrent Checking Account Balance: " + savingsAccount.getBalance());
        System.out.print("\nTotal withdraw: ");
        wdraw = sc.nextDouble();
        checkingAccount.withdraw(wdraw);
        System.out.print("\nChecking Account Balance: RM" + checkingAccount.getBalance());

        sc.close();

    }
    
}
