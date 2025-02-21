// Develop a java program to create an abstract class named shape that contains two integers and an empty method named printarea(). provide three classes named rectangle, triangle and circle such that each one of the classes extends the class shape. each one of the classes contains only the method printarea( ) that prints the area of the given shape.

abstract class Shape {
    int dimension1;
    int dimension2;
    
    abstract void printArea();
}

class Rectangle extends Shape {
    Rectangle(int length, int width) {
        dimension1 = length;
        dimension2 = width;
    }
    
    void printArea() {
        System.out.println("Area of Rectangle: " + (dimension1 * dimension2));
    }
}

class Triangle extends Shape {
    Triangle(int base, int height) {
        dimension1 = base;
        dimension2 = height;
    }
    
    void printArea() {
        System.out.println("Area of Triangle: " + (0.5 * dimension1 * dimension2));
    }
}

class Circle extends Shape {
    Circle(int radius) {
        dimension1 = radius;
        // dimension2 not used for circle
    }
    
    void printArea() {
        System.out.println("Area of Circle: " + (Math.PI * dimension1 * dimension1));
    }
}

class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 5);
        Triangle tri = new Triangle(8, 4);
        Circle circle = new Circle(3);
        
        rect.printArea();
        tri.printArea();
        circle.printArea();
    }
}
