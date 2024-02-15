package lesson8.Assignment.A6EmployeeManagementSystem;

public abstract class Employee {
    protected String name;
    protected int id;
    protected double salary;

    public Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    abstract double calculateSalary();

    public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: RM" + salary);
    }
}
