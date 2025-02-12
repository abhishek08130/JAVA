// This program prints a pattern of numbers in a triangular format.
// Each row contains increasing numbers starting from 1, with a space before each number.

public class starprint {
    public static void main(String[] args) {
        // Loop through 5 rows
        for (int i = 1; i <= 5; i++) {
            // For each row, print spaces and numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(" "); // Print a space before the number
                System.out.print(j);    // Print the current number
            }
            System.out.println(""); // Move to the next line after each row
        }
    }
}

// The output of this program will be:
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
// Each row has one more number than the previous row, and the numbers are indented.
