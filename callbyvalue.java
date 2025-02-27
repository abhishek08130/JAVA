public class callbyvalue {
    void modify(int x) {
        x = x + 10; // Modifying the copy
    }

    public static void main(String[] args) {
        int a = 5;
        callbyvalue obj = new callbyvalue();
        obj.modify(a);
        System.out.println(a); // Output: 5 (Original value remains unchanged)
    }
}