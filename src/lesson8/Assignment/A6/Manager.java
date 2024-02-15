package lesson8.Assignment.A6;

public class Manager extends Employee{

    private double baseSalary;
    private double bonus;

    public Manager(String name, int id, double baseSalary, double bonus) {
        super(name, id);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        salary = baseSalary + bonus;
        return salary;
    }
    
}
