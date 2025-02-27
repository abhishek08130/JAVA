public class objectclone implements Cloneable {
    String name;
    int age;

    // Constructor
    objectclone(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overriding clone() method
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // Display method
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        try {
            objectclone p1 = new objectclone("John", 25);
            objectclone p2 = (objectclone) p1.clone();  // Cloning the object

            // Display original and cloned object data
            p1.display();
            p2.display();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not allowed.");
        }
    }
}