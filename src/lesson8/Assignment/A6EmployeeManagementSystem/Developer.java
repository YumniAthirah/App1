package lesson8.Assignment.A6EmployeeManagementSystem;

public class Developer extends Employee{
    private double baseSalary;
    private double bonus;

    public Developer(String name, int id, double baseSalary, double bonus) {
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
