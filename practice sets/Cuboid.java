// write a java code program to create 2 abstract method in a classname as "area()"and "volume@".creating Another class named as "cuboid inherits the class in which two abstract method define and calculate the area and volume of cuboid.


abstract class Shape {
    // Abstract method to calculate area
    abstract double area();
    
    // Abstract method to calculate volume
    abstract double volume();
}


public class Cuboid extends Shape {
    // Length, breadth and height of the cuboid
    double length, breadth, height;
    
    // Constructor to initialize the length, breadth and height of the cuboid
    Cuboid(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }
        double area() {
        return 2 * (length * breadth + breadth * height + height * length);
    }
    double volume() {
        return length * breadth * height;
    }
}

// Main class to test the Cuboid class
class Main {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid(5, 6, 7);
        System.out.println("Area of the cuboid: " + cuboid.area());
        System.out.println("Volume of the cuboid: " + cuboid.volume());
    }
}
