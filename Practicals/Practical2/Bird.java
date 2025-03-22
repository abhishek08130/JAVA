// Design an interface called to fly with two methods godown() and go forward(). These methods would not contain any logic but each class. create class duck and finch to Implement the interface . finally, create a bird class and call the required method.

// 1. We create an interface called 'Fly' that defines two actions birds can do:
//    - goDown(): for moving downward
//    - goForward(): for moving forward
interface Fly {
    void goDown();    // Method to simulate going down
    void goForward(); // Method to simulate going forward
}

// 2. We create a Duck class that implements the Fly interface
// This means Duck must provide actual code for both goDown() and goForward()
class Duck implements Fly {
    @Override
    public void goDown() {
        System.out.println("Duck is going down.");
    }
      @Override
    public void goForward() {
        System.out.println("Duck is going forward.");
    }
}

// 3. Similarly, we create a Finch class that also implements Fly
// It provides its own versions of goDown() and goForward()
class Finch implements Fly {
    @Override
    public void goDown() {
        System.out.println("Finch is going down.");
    }
       @Override
    public void goForward() {
        System.out.println("Finch is going forward.");
    }
}

// 4. The main Bird class shows how to use these flying birds
public class Bird {
    public static void main(String[] args) {
        // Create a duck and finch using the Fly interface type
        Fly duck = new Duck();
        Fly finch = new Finch();

        // Test the duck's flying actions
        System.out.println("Duck actions:");
        duck.goDown();   // Make the duck go down
        duck.goForward(); // Make the duck go forward
        
        // Test the finch's flying actions
        System.out.println("\nFinch actions:");
        finch.goDown();   // Make the finch go down
        finch.goForward(); // Make the finch go forward
    }
}
