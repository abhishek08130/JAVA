class Car{
    String brand;

    Car(){
        System.out.println("Car is created");
        brand = "Unknown";
    }

    public class Main{
        public static void main (String[] args){
            Car myCar = new Car();
            System.out.println(myCar.brand);
        }
    }
}