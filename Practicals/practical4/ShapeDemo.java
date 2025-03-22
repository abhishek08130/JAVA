import java.util.Scanner;
abstract class Shape {
    int dimension1;
    int dimension2;
    public Shape(int dimension1, int dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }
    abstract void printArea();
}
class Rectangle extends Shape {
    public Rectangle(int length, int width) {
        super(length, width);
    }
    @Override
    void printArea() {
        int area = dimension1 * dimension2;
        System.out.println("Area of Rectangle: " + area);
    }
}
class Triangle extends Shape {
    public Triangle(int base, int height) {
        super(base, height);
    }
    @Override
    void printArea() {
        double area = 0.5 * dimension1 * dimension2;
        System.out.println("Area of Triangle: " + area);
    }
}
class Circle extends Shape {
    public Circle(int radius) {
        super(radius, 0); 
    }
    @Override
    void printArea() {
        double area = Math.PI * dimension1 * dimension1; // area = π * r^2
        System.out.println("Area of Circle: " + area);
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the shape (Rectangle, Triangle, Circle): ");
        String shapeType = scanner.nextLine().toLowerCase();
        int dimension1, dimension2;
        switch (shapeType) {
            case "rectangle":
                System.out.println("Enter the length of the rectangle: ");
                dimension1 = scanner.nextInt();
                System.out.println("Enter the width of the rectangle: ");
                dimension2 = scanner.nextInt();
                Shape rectangle = new Rectangle(dimension1, dimension2);
                rectangle.printArea();
                break;

            case "triangle":
                System.out.println("Enter the base of the triangle: ");
                dimension1 = scanner.nextInt();
                System.out.println("Enter the height of the triangle: ");
                dimension2 = scanner.nextInt();
                Shape triangle = new Triangle(dimension1, dimension2);
                triangle.printArea();
                break;

            case "circle":
                System.out.println("Enter the radius of the circle: ");
                dimension1 = scanner.nextInt();
                // Create Circle object and calculate area
                Shape circle = new Circle(dimension1);
                circle.printArea();
                break;

            default:
                System.out.println("Invalid shape type entered.");
                break;
        }
        scanner.close();
    }
}
