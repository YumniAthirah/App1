package lesson8.Assignment.A12BankingSystemwithTransactions;

import java.util.List;

public class CheckingAccount implements BankAccount{

    private double balance;
    private double overdraftlimit;

    public CheckingAccount(double initialbalance, double overdraftlimit){
        this.balance =  initialbalance;
        this.overdraftlimit = overdraftlimit;
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'transfer'");
    }

    @Override
    public List<String> getTransactionHistory() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTransactionHistory'");
    }
    
}
