package lesson8.Assignment.A12BankingSystemwithTransactions;

import java.util.Scanner;

public class MainTransfer {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(5000.0, 0.03);
        Scanner sc = new Scanner(System.in);

        // Savings Account
        System.out.print("Current Savings Account Balance: " + savingsAccount.getBalance());
        System.out.println("\nSavings account history.");
        for (String transaction : savingsAccount.getTransactionHistory())
            System.out.println(transaction);

        // Checking Account
        CheckingAccount checkingAccount = new CheckingAccount(2000.0, 100.0);
        System.out.print("\nCurrent Checking Account Balance: " + savingsAccount.getBalance());
        System.out.println("\nChecking account history.");
        for (String transaction : checkingAccount.getTransactionHistory())
            System.out.println(transaction);

        savingsAccount.transfer(checkingAccount, 200);

        System.out.println("Savings account balance after transfer: RM " + savingsAccount.getBalance());
        System.out.println("Checking account balance after transfer: RM " + checkingAccount.getBalance());
    }
}
