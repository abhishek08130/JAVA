public class constructor_Overloading {
    private String b;
    private int y;

    // Constructor with one parameter
    public constructor_Overloading(String b) {
        this.b = b;
        this.y = 0; // default value
    }

    // Constructor with two parameters
    public constructor_Overloading(String b, int y) {
        this.b = b;
        this.y = y;
    }

    // Method to display the values of b and y
    public void display() {
        System.out.println("Value of b: " + b + ", Value of y: " + y);
    }

    // Main method to demonstrate constructor overloading
    public static void main(String[] args) {
        constructor_Overloading obj1 = new constructor_Overloading("Hello");
        constructor_Overloading obj2 = new constructor_Overloading("World", 10);

        // Displaying the values for both objects
        obj1.display(); // Output: Value of b: Hello, Value of y: 0
        obj2.display(); // Output: Value of b: World, Value of y: 10
    }
}