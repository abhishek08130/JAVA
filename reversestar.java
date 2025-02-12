// This program prints a reverse triangle pattern of stars
// For example:
// *****
// ****
// ***
// **
// *
public class reversestar {
    public static void main(String[] args) {
        // Start with 5 stars and decrease one star in each row
        for (int i = 5; i >= 1; i--) {
            // Print stars equal to value of i in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to next line after printing stars
            System.out.println();
        }
    }
}
