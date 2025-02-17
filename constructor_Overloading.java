class constructor_Overloading{
    String brand;

    constructor_Overloading(){
        System.out.println("Car is created");
        brand = "Unknown";
    }

    public class Main{
        public static void main (String[] args){
            constructor_Overloading myCar = new constructor_Overloading();
            System.out.println(myCar.brand);
        }
    }
}