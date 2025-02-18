public class Example {
    int num;

    Example(int num) {
        this.num = num;
    }

    void display() { // Fixed the method name and changed 'Void' to 'void'
        System.out.println(num);
    }
}

class UsingKeyword { // Fixed the class name to follow Java naming conventions
    public static void main(String[] args) {
        Example object = new Example(10);
        object.display(); // Fixed the method call to match the corrected method name
    }
}