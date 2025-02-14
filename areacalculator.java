// This is an AreaCalculator class that calculates areas of different shapes
class AreaCalculator {
    // Method to calculate area of a square
    // Takes side length as input and returns side × side
    double calculateArea(double side) {
        return side * side;
    }
    
    // Method to calculate area of a rectangle 
    // Takes length and breadth as input and returns length × breadth
    double calculateArea(double length, double breadth) {
        return length * breadth;
    }
    
    // Method to calculate area of a circle
    // Takes radius as input and returns π × radius²
    double calculateArea(double radius, boolean isCircle) {
        return Math.PI * radius * radius;
    }
    
    public static void main(String[] args) {
        // Create calculator object to test the methods
        AreaCalculator calculator = new AreaCalculator();
        
        // Test calculations for different shapes
        System.out.println("Area of square with side 5: " + calculator.calculateArea(5));
        System.out.println("Area of rectangle with length 4 and breadth 6: " + calculator.calculateArea(4, 6));
        System.out.println("Area of circle with radius 3: " + calculator.calculateArea(3, true));
    }
}
/* 
Output explanation:
When we run this program, it will:
1. Calculate square area: 5 × 5 = 25
2. Calculate rectangle area: 4 × 6 = 24
3. Calculate circle area: π × 3² = 28.27

The output will be:
Area of square with side 5: 25.0
Area of rectangle with length 4 and breadth 6: 24.0  
Area of circle with radius 3: 28.274333882308138

This program demonstrates method overloading where the same method name
calculateArea() is used with different parameters to calculate areas
of different shapes.
*/
