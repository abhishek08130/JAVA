class Pparent
{
    void parent() {
        System.out.println("parent class");
    }
}

class child extends Pparent {
    child() {
        System.out.println("child class constructor");
    }
}

public class SuperCons {
    public static void main(String[] args) {
        child obj = new child();
    }
}