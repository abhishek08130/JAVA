// This is an Employee class that calculates and displays employee salary details
class SalaryCalculator {
    // Instance variables to store employee information
    String name;        // Stores employee name
    int id;            // Stores employee ID
    double basicSalary; // Basic salary amount
    double hra;        // House Rent Allowance
    double da;         // Dearness Allowance

    // Constructor to initialize employee details
    SalaryCalculator(String name, int id, double basicSalary, double hra, double da) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
        this.hra = hra;
        this.da = da;
    }

    // Method to calculate total salary by adding basic salary, HRA and DA
    double calculateSalary() {
        return basicSalary + hra + da;
    }

    // Method to display employee details including ID, name and total salary
    void displaySalary() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + calculateSalary());
    }

    // Main method to test the Employee class
    public static void main(String[] args) {
        // Create an employee object with sample values
        SalaryCalculator emp = new SalaryCalculator("John Doe", 12345, 50000, 10000, 5000);
        // Display the employee details
        emp.displaySalary();
    }
}
/* 
Output explanation:
When we run this program, it will create an employee "John Doe" with:
- ID: 12345
- Basic Salary: 50000
- HRA: 10000 
- DA: 5000

The program will calculate total salary: 50000 + 10000 + 5000 = 65000

And display output as:
ID: 12345, Name: John Doe, Salary: 65000.0
*/
