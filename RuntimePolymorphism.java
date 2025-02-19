class RuntimePolymorphism {
    // This method is intended to be overridden by subclasses
    void display() {
        System.out.println("Display from RuntimePolymorphism");
    }
}

// SubclassA extends RuntimePolymorphism and overrides the display method
class SubclassA extends RuntimePolymorphism {
    void display() {
        System.out.println("Display from SubclassA");
    }
}

// SubclassB also extends RuntimePolymorphism and overrides the display method
class SubclassB extends RuntimePolymorphism {
    void display() {
        System.out.println("Display from SubclassB");
    }
}

// The main method to demonstrate runtime polymorphism
public static void main(String[] args) {
    // Creating objects of SubclassA and SubclassB, but referencing them as RuntimePolymorphism
    RuntimePolymorphism obj1 = new SubclassA();
    RuntimePolymorphism obj2 = new SubclassB();
    
    // Calling the display method on obj1 will invoke SubclassA's display method
    obj1.display(); // Calls SubclassA's display method
    // Output: Display from SubclassA

    // Calling the display method on obj2 will invoke SubclassB's display method
    obj2.display(); // Calls SubclassB's display method
    // Output: Display from SubclassB
}
