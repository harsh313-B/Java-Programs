// Importing Scanner class to take input from the user
import java.util.Scanner;

// Employee class — represents each employee's data and behavior
class Employee {
    // Instance variables (attributes)
    String name;
    int empId;
    double basicSalary;
    double hra;
    double da;
    double grossSalary;

    // Constructor — used to initialize employee data when object is created
    Employee(String name, int empId, double basicSalary) {
        this.name = name;
        this.empId = empId;
        this.basicSalary = basicSalary;
    }

    // Method to calculate salary
    void calculateSalary() {
        // Assume: HRA = 20% of basic, DA = 10% of basic
        hra = 0.20 * basicSalary;
        da = 0.10 * basicSalary;
        grossSalary = basicSalary + hra + da;
    }

    // Method to display employee details
    void display() {
        System.out.println("\nEmployee ID: " + empId);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA (20%): " + hra);
        System.out.println("DA (10%): " + da);
        System.out.println("Gross Salary: " + grossSalary);
    }
}

// Main class
class SalaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        // Create an array of Employee objects
        Employee[] employees = new Employee[n];

        // Input employee details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Employee " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Employee ID: ");
            int id = sc.nextInt();
            System.out.print("Basic Salary: ");
            double basic = sc.nextDouble();

            // Create an Employee object using constructor
            employees[i] = new Employee(name, id, basic);

            // Calculate salary for each employee
            employees[i].calculateSalary();
        }

        // Display all employee details
        System.out.println("\n----- Employee Salary Details -----");
        for (int i = 0; i < n; i++) {
            employees[i].display();
        }

        sc.close();
    }
}
