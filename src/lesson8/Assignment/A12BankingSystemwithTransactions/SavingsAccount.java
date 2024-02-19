package lesson8.Assignment.A12BankingSystemwithTransactions;

import java.util.ArrayList;
import java.util.List;

public class SavingsAccount implements BankAccount{
    private double balance;
    private double interestRate;
    private List<String> transactions;

    public SavingsAccount(double balance, double interestRate){
        this.balance = balance;
        this.interestRate = interestRate;
        this.transactions = new ArrayList<>();
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if(amount <= balance){
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public void addInterest(){
        double interest = balance * interestRate;
        balance += interest;
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
