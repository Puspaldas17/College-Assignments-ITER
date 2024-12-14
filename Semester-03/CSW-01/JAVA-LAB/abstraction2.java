import java.util.Scanner;

// Abstract class Person
abstract class Person {
    abstract String getFullName();
    abstract void displayInfo();
}

// Concrete subclass Employee
class Employee extends Person {
    private String firstName;
    private String lastName;
    private String employeeId;

    public Employee(String firstName, String lastName, String employeeId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeId = employeeId;
    }

    @Override
    String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    void displayInfo() {
        System.out.println("Full Name: " + getFullName());
        System.out.println("Employee ID: " + employeeId);
    }
}

// Main program to demonstrate abstraction with user input
public class abstraction2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for Employee details
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter employee ID: ");
        String employeeId = scanner.nextLine();

        // Create an Employee object with user input
        Employee employee = new Employee(firstName, lastName, employeeId);

        // Display Employee information
        employee.displayInfo();

        scanner.close();
    }
}
