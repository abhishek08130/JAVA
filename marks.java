import java.util.Scanner;
class Marks{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the percentage: ");
        double percentage = scanner.nextDouble();
        String grade;
        if (percentage >= 90 && percentage <= 100){
            System.out.println("grade is A+");
        }
        else if (percentage >= 80 && percentage < 90){
            System.out.println("grade is A");
        }
        else if (percentage >= 70 && percentage < 80){
            System.out.println("grade is B");
        }
        else if (percentage >= 60 && percentage < 70){
            System.out.println("grade is C");
        }
        else if (percentage >= 50 && percentage < 60){
            System.out.println("grade is D");
        }
        else{
            System.out.println("grade is F");
        }
        scanner.close();
    }
}