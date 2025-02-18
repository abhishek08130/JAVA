class ParameterizedConstructor extends Example {
    int additionalValue;

    ParameterizedConstructor(int num, int additionalValue) {
        super(num); // Call to the superclass constructor
        this.additionalValue = additionalValue;
    }

    void displayValues() {
        display(); // Call to the method from the superclass
        System.out.println("Additional Value: " + additionalValue);
    }
}
