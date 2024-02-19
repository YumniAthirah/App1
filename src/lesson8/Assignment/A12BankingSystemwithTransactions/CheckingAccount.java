package lesson8.Assignment.A12BankingSystemwithTransactions;

import java.util.ArrayList;
import java.util.List;

public class CheckingAccount implements BankAccount{

    private double balance;
    private double overdraftlimit;
    private List<String> transactions;

    public CheckingAccount(double initialbalance, double overdraftlimit){
        this.balance =  initialbalance;
        this.overdraftlimit = overdraftlimit;
        this.transactions = new ArrayList<>();
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount < -overdraftlimit) {
            System.out.println("Exceeds limit.");
        } else {
            balance -= amount;
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void transfer(BankAccount toAccount, double amount) {
        withdraw(amount);
        toAccount.deposit(amount);
        transactions.add(String.format("Transfer to %s: RM %.2f", toAccount, amount));
    }

    @Override
    public List<String> getTransactionHistory() {
        return transactions;
    }

    
}
