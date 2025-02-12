// This program calculates student grades based on percentage marks
import java.util.Scanner;

class Marks {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask user to enter the percentage marks
        System.out.println("Enter the percentage: ");
        double percentage = scanner.nextDouble();
        
        // Determine the grade based on percentage ranges:
        // 90-100 = A+
        // 80-89  = A
        // 70-79  = B
        // 60-69  = C
        // 50-59  = D
        // Below 50 = F
        if (percentage >= 90 && percentage <= 100) {
            System.out.println("grade is A+");
        }
        else if (percentage >= 80 && percentage < 90) {
            System.out.println("grade is A");
        }
        else if (percentage >= 70 && percentage < 80) {
            System.out.println("grade is B");
        }
        else if (percentage >= 60 && percentage < 70) {
            System.out.println("grade is C");
        }
        else if (percentage >= 50 && percentage < 60) {
            System.out.println("grade is D");
        }
        else {
            System.out.println("grade is F");
        }
        
        // Close the scanner to free up resources
        scanner.close();
    }
}