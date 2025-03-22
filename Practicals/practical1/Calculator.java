
// Design a simple calculator using various operators and switch case to perform various arithmetic operations in JAVA .
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Simple Calculator");
        System.out.println("Choose an operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.print("Enter your choice (1/2/3/4): ");
        int choice = scanner.nextInt();
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double result = 0;
        switch (choice) {
            case 1: // Add
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case 2: // Subtract
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case 3: // Multiply
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case 4: 
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid choice! Please select a valid operation.");
        }
        scanner.close();
    }
}