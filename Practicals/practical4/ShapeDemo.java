// This program calculates the area of different shapes (Rectangle, Triangle, Circle)

// Shape is a template (abstract class) that defines common properties for all shapes
abstract class Shape {
    int dimension1;  // First measurement (like length, base, or radius)
    int dimension2;  // Second measurement (like width or height)
    
    // Constructor to set the dimensions when creating a shape
    public Shape(int dimension1, int dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }
    
    // Each shape must implement its own way to calculate and print area
    abstract void printArea();
}

// Rectangle shape - needs length and width to calculate area
class Rectangle extends Shape {
    public Rectangle(int length, int width) {
        super(length, width);  // Pass measurements to Shape constructor
    }
    
    @Override
    void printArea() {
        int area = dimension1 * dimension2;  // Area = length * width
        System.out.println("Area of Rectangle: " + area);
    }
}

// Triangle shape - needs base and height to calculate area
class Triangle extends Shape {
    public Triangle(int base, int height) {
        super(base, height);  // Pass measurements to Shape constructor
    }
    
    @Override
    void printArea() {
        double area = 0.5 * dimension1 * dimension2;  // Area = (1/2) * base * height
        System.out.println("Area of Triangle: " + area);
    }
}

// Circle shape - only needs radius to calculate area
class Circle extends Shape {
    public Circle(int radius) {
        super(radius, 0);  // Circle only needs one dimension (radius)
    }
    
    @Override
    void printArea() {
        double area = Math.PI * dimension1 * dimension1;  // Area = π * r²
        System.out.println("Area of Circle: " + area);
    }
}

// Main program that interacts with the user
public class ShapeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Tool to read user input
        
        // Ask user which shape they want to calculate
        System.out.println("Enter the shape (Rectangle, Triangle, Circle): ");
        String shapeType = scanner.nextLine().toLowerCase();
        
        int dimension1, dimension2;  // Variables to store measurements
        
        // Handle different shape calculations based on user's choice
        switch (shapeType) {
            case "rectangle":
                // Get rectangle measurements and calculate area
                System.out.println("Enter the length of the rectangle: ");
                dimension1 = scanner.nextInt();
                System.out.println("Enter the width of the rectangle: ");
                dimension2 = scanner.nextInt();
                Shape rectangle = new Rectangle(dimension1, dimension2);
                rectangle.printArea();
                break;

            case "triangle":
                // Get triangle measurements and calculate area
                System.out.println("Enter the base of the triangle: ");
                dimension1 = scanner.nextInt();
                System.out.println("Enter the height of the triangle: ");
                dimension2 = scanner.nextInt();
                Shape triangle = new Triangle(dimension1, dimension2);
                triangle.printArea();
                break;

            case "circle":
                // Get circle measurement and calculate area
                System.out.println("Enter the radius of the circle: ");
                dimension1 = scanner.nextInt();
                Shape circle = new Circle(dimension1);
                circle.printArea();
                break;

            default:
                // Handle invalid input
                System.out.println("Invalid shape type entered.");
                break;
        }
        
        scanner.close();  // Clean up the input tool
    }
}
