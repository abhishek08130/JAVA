// This program prints a pyramid pattern of stars.
// The number of rows in the pyramid is defined by the variable 'rows'.

public class printtriangle {
    public static void main(String[] args) {
        int rows = 5; // Define the number of rows for the pyramid
        for (int i = 1; i <= rows; i++) { // Loop through each row
            // Print spaces before stars to center the pyramid
            for (int j = rows - i; j >= 1; j--) {
                System.out.print(" "); // Print a space
            }
            // Print stars in the current row
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*"); // Print a star
            }
            System.out.println(); // Move to the next line after printing stars
        }
    }
}

// The output of this program will be:
//     *     (1st row)
//    ***    (2nd row)
//   *****   (3rd row)
//  *******  (4th row)
// ********* (5th row)
// Each row has an increasing number of stars, centered by spaces.
