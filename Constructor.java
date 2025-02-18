public class Constructor {
    int value;

    // Constructor
    Constructor(int value) {
        this.value = value;
    }

    void displayValue() {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        Constructor obj = new Constructor(5);
        obj.displayValue();
    }
}
