public class callbyref {
    int num;
}

class Test {
    void modify(callbyref obj) {
        obj.num = obj.num + 10; // Modifying the original object
    }

    public static void main(String[] args) {
        callbyref d = new callbyref();
        d.num = 5;
        Test obj = new Test();
        obj.modify(d);
        System.out.println(d.num); // Output: 15 (Original value is modified)
    }
}