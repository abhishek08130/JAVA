// This class demonstrates method overloading in Java, which allows us to have multiple methods with the same name but different parameters.
public class methodoverloadingusingargs {
    // This method adds two integers and returns their sum.
    int add(int a, int b) {
        return a + b;  // Returns the sum of 2 numbers
    }
    
    // This method adds three integers and returns their sum.
    int add(int a, int b, int c) {
        return a + b + c;  // Returns the sum of 3 numbers
    }
    
    public static void main(String[] args) {
        // Create an object of the class to access its methods
        methodoverloadingusingargs t1 = new methodoverloadingusingargs();
        
        // Call the first version of add() with 2 parameters and print the result
        System.out.println(t1.add(10, 20));  // This will print 30, which is the sum of 10 and 20
        
        // Call the second version of add() with 3 parameters and print the result
        System.out.println(t1.add(10, 20, 30));  // This will print 60, which is the sum of 10, 20, and 30
    }
    
}
