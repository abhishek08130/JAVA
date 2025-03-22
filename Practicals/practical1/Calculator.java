
// Design a simple calculator using various operators and switch case to perform various arithmetic operations in JAVA .
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // This line allows the program to read user input.
        System.out.println("Simple Calculator"); // This line prints "Simple Calculator" to the screen.
        System.out.println("Choose an operation:"); // This line asks the user to choose an operation.
        System.out.println("1. Add"); // This line prints the option to add.
        System.out.println("2. Subtract"); // This line prints the option to subtract.
        System.out.println("3. Multiply"); // This line prints the option to multiply.
        System.out.println("4. Divide"); // This line prints the option to divide.
        System.out.print("Enter your choice (1/2/3/4): "); // This line asks the user to enter their choice.
        int choice = scanner.nextInt(); // This line reads the user's choice.
        System.out.print("Enter the first number: "); // This line asks the user to enter the first number.
        double num1 = scanner.nextDouble(); // This line reads the first number.
        System.out.print("Enter the second number: "); // This line asks the user to enter the second number.
        double num2 = scanner.nextDouble(); // This line reads the second number.
        double result = 0; // This line initializes a variable to hold the result.
        switch (choice) { // This line starts a switch statement based on the user's choice.
            case 1: // If the user chose to add.
                result = num1 + num2; // This line adds the two numbers.
                System.out.println("Result: " + result); // This line prints the result.
                break; // This line ends the case.
            case 2: // If the user chose to subtract.
                result = num1 - num2; // This line subtracts the second number from the first.
                System.out.println("Result: " + result); // This line prints the result.
                break; // This line ends the case.
            case 3: // If the user chose to multiply.
                result = num1 * num2; // This line multiplies the two numbers.
                System.out.println("Result: " + result); // This line prints the result.
                break; // This line ends the case.
            case 4: // If the user chose to divide.
                if (num2 != 0) { // This line checks if the second number is not zero.
                    result = num1 / num2; // This line divides the first number by the second.
                    System.out.println("Result: " + result); // This line prints the result.
                } else { // If the second number is zero.
                    System.out.println("Error: Cannot divide by zero."); // This line prints an error message.
                }
                break; // This line ends the case.
            default: // If the user entered an invalid choice.
                System.out.println("Invalid choice! Please select a valid operation."); // This line prints an error message.
        }
        scanner.close(); // This line closes the scanner to prevent resource leaks.
    }
}