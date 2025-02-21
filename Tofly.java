//  Design an interface called to fly with two methods godown() and go forward(). These methods would not contain any logic but each class. create class duck and finch to Implement the interface . finally, create a bird class and call the required method.

// Interface definition
interface ToFly {
    void goDown();
    void goForward();
}

// Duck class implementing ToFly
class Duck implements ToFly {
    public void goDown() {
        System.out.println("Duck going down");
    }
    
    public void goForward() {
        System.out.println("Duck moving forward");
    }
}

// Finch class implementing ToFly 
class Finch implements ToFly {
    public void goDown() {
        System.out.println("Finch going down");
    }
    
    public void goForward() {
        System.out.println("Finch moving forward");
    }
}

// Bird class to test the implementation
class Bird {
    public static void main(String[] args) {
        // Create instances of Duck and Finch
        Duck duck = new Duck();
        Finch finch = new Finch();
        
        // Test Duck methods
        System.out.println("Duck movements:");
        duck.goDown();
        duck.goForward();
        
        // Test Finch methods
        System.out.println("\nFinch movements:");
        finch.goDown();
        finch.goForward();
    }
}
