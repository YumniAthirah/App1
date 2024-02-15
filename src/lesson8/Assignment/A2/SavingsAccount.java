package lesson8.Assignment.A2;

public class SavingsAccount implements BankAccount{
    private double balance;
    private double interestRate;

    public SavingsAccount(double balance, double interestRate){
        this.balance = balance;
        this.interestRate = interestRate;
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
    
    
}
