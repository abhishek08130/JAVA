// This is a simple Java class that shows how to use objects in programming.
// Objects are like real-world items that have properties (attributes) and actions (methods).

public class objectss {
    // These are the attributes of the object. Each object will have its own name and age.
    String name;    // This will hold the person's name
    int age;       // This will hold the person's age
    
    // This method allows the object to greet by using its name and age.
    void sayhello() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
    
    // The main method is where the program starts running.
    public static void main(String[] args) {
        // Here we create two objects of the objectss class.
        objectss obj1 = new objectss();  // This is the first object
        objectss obj2 = new objectss();  // This is the second object
        
        // We set the name and age for the first object (obj1).
        obj1.name = "Ajay";  // Assigning the name "Ajay" to obj1
        obj1.age = 22;       // Assigning the age 22 to obj1
        obj1.sayhello();     // This will print: Hello, my name is Ajay and I am 22 years old.
        
        // We set the name and age for the second object (obj2).
        obj2.name = "Rohit"; // Assigning the name "Rohit" to obj2
        obj2.age = 19;       // Assigning the age 19 to obj2
        obj2.sayhello();     // This will print: Hello, my name is Rohit and I am 19 years old.
    }
}

// The output of this program will be:
// Hello, my name is Ajay and I am 22 years old.
// Hello, my name is Rohit and I am 19 years old.