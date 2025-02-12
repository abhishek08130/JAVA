public class objectss{
    String name;
    int age;
    void sayhello(){
        System.out.println("hello my name is "+name+" and my age is "+age);
    }
    public static void main(String[] args) {
        objectss obj1 =new objectss();
        objectss obj2 =new objectss();
        obj1.name="ajay";
        obj1.age=22;
        obj1.sayhello();
        obj2.name="rohit";
        obj2.age=19;
        obj2.sayhello();
    }

}