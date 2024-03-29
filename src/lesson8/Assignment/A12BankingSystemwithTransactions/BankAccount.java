package lesson8.Assignment.A12BankingSystemwithTransactions;

import java.util.List;

public interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();

    void transfer(BankAccount toAccount, double amount);
    List<String> getTransactionHistory();

}
