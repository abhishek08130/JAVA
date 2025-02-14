import java.util.Scanner;

class LeapYearChecker {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Get year input from user
            System.out.print("Enter a year: ");
            int year = scanner.nextInt();
            
            // Check if it's a leap year
            boolean isLeapYear = false;
            
            // Leap year logic:
            // 1. Year must be divisible by 4
            // 2. If divisible by 100, must also be divisible by 400
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    isLeapYear = year % 400 == 0;
                } else {
                    isLeapYear = true;
                }
            }
            
            // Display result
            if (isLeapYear) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        }
    }
}
/* 
This program checks if a given year is leap year or not:

1. Gets year input from user
2. Checks if it's a leap year using the rules:
   - Year divisible by 4 is a leap year
   - Century years (divisible by 100) must also be divisible by 400
3. Displays whether the year is leap year or not

Example outputs:
Enter a year: 2000
2000 is a leap year.

Enter a year: 2100
2100 is not a leap year.

Enter a year: 2024
2024 is a leap year.
*/
