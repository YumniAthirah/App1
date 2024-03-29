package lesson8.Assignment.A2BankAccountInterface;

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
    
}
