import java.util.Scanner;

class MarksCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Get number of subjects
            System.out.print("Enter number of subjects: ");
            int numSubjects = scanner.nextInt();
            
            // Input marks and calculate total
            double totalMarks = 0;
            for(int i = 0; i < numSubjects; i++) {
                System.out.print("Enter marks for subject " + (i+1) + ": ");
                totalMarks += scanner.nextDouble();
            }
            
            // Calculate percentage
            double percentage = totalMarks / numSubjects;
            
            // Show results
            System.out.println("\nResults:");
            System.out.println("Total Marks: " + totalMarks); 
            System.out.println("Percentage: " + percentage + "%");
        }
    }
}
/* 
This program calculates total marks and percentage for a student:

1. First it asks the user to enter the number of subjects
2. Then for each subject, it asks the user to enter the marks
3. It adds up all the marks to calculate the total
4. The percentage is calculated by dividing total marks by number of subjects
5. Finally it displays both the total marks and percentage

For example, if we run this program:
Enter number of subjects: 3
Enter marks for subject 1: 85
Enter marks for subject 2: 90 
Enter marks for subject 3: 95

Results:
Total Marks: 270.0
Percentage: 90.0%

This shows the student got:
- Total marks of 270 out of 300
- Average percentage of 90%
*/
