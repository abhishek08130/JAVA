import java.io.*;
class Person {
   private String name;
   void accept() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name");
        name = br.readLine();
    }
    void display(){
        System.out.println("Name: "+name);
    }
}
class Main {
    public static void main(String[] args) throws IOException {
        Person s = new Person();
        s.accept();
        s.display();
    }
}