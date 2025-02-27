public class enclapsulation {
    private String name;  // Private variable (data hiding)

    // Public getter method to access private data
    public String getName() {
        return name;
    }
    // Public setter method to modify private data
    public void setName(String newName) {
        this.name = newName;
    }
}
public class EncapsulationExample {
    public static void main(String[] args) {
        enclapsulation p = new enclapsulation();
        p.setName("John"); 
        System.out.println(p.getName());  
    }
}