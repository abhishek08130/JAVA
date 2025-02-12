// This program prints a hollow square pattern using asterisks (*).
// The size of the square is determined by the variable 'rows', which is set to 5.

public class holosquare {
    public static void main(String[] args) {
        int rows = 5; // Define the number of rows for the square
        // Loop through each row
        for (int i = 1; i <= rows; i++) {
            // Loop through each column
            for (int j = 1; j <= 5; j++) {
                // Print '*' for the first and last rows, and for the first and last columns
                if (i == 1 || i == rows || j == 1 || j == rows) {
                    System.out.print("*"); // Print a star
                } else {
                    System.out.print(" "); // Print a space for the hollow part
                }
            }
            System.out.println(); // Move to the next line after finishing a row
        }
    }
}

// The output of this program will be:
// *****
// *   *
// *   *
// *   *
// *****
// This creates a hollow square where the border is made of stars and the inside is empty.
