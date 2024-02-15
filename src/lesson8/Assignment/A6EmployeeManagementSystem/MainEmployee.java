package lesson8.Assignment.A6EmployeeManagementSystem;

public class MainEmployee {
    public static void main(String[] args) {

        //Manager
        System.out.println("Manager");
        Manager manager = new Manager("Yumni", 79024, 15000, 1500);
        manager.calculateSalary();
        manager.displayDetails();
        System.out.println();

        //Developer
        System.out.println("Developer");
        Developer developer = new Developer("Marissa", 21804, 8000, 500);
        developer.calculateSalary();
        developer.displayDetails();
        System.out.println();

        //Intern
        System.out.println("Intern");
        Intern intern = new Intern("Maryam", 52395, 100, 100);
        intern.calculateSalary();
        intern.displayDetails();
    }
    
}
