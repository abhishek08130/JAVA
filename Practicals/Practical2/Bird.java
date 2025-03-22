// Design an interface called to fly with two methods godown() and go forward(). These methods would not contain any logic but each class. create class duck and finch to Implement the interface . finally, create a bird class and call the required method.

interface Fly {
    void goDown();    // Method to simulate going down
    void goForward(); // Method to simulate going forward
}
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
public class Bird {
    public static void main(String[] args) {
        // Creating objects of Duck and Finch using the Fly interface
        Fly duck = new Duck();
        Fly finch = new Finch();
  System.out.println("Duck actions:");
        duck.goDown();   // Duck going down
        duck.goForward(); // Duck going forward
        
        // Calling the methods of Finch
        System.out.println("\nFinch actions:");
        finch.goDown();   // Finch going down
        finch.goForward(); // Finch going forward
    }
}
