// This is a simple Java class demonstrating object-oriented programming concepts
public class objectss {
    // Instance variables (attributes) that each object will have
    String name;    // To store the person's name
    int age;       // To store the person's age
    
    // Method to print a greeting using the object's name and age
    void sayhello() {
        System.out.println("hello my name is " + name + " and my age is " + age);
    }
    
    // Main method - program execution starts here
    public static void main(String[] args) {
        // Create two objects (instances) of the objectss class
        objectss obj1 = new objectss();  // First object
        objectss obj2 = new objectss();  // Second object
        
        // Set values for first object (obj1)
        obj1.name = "ajay";
        obj1.age = 22;
        obj1.sayhello();  // Call sayhello() method for obj1
        
        // Set values for second object (obj2)
        obj2.name = "rohit";
        obj2.age = 19;
        obj2.sayhello();  // Call sayhello() method for obj2
    }
}