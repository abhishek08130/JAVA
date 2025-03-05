public class Exceptionandle {
    public static void main(String[] args) {
        try {
            int numerator = 0;
            int denominator = 10;
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed");
            e.printStackTrace();
        } finally {
            System.out.println("Program execution completed");
        }
    }
}

