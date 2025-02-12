// This class demonstrates method overloading in Java
public class methodoverloadingusingargs {
    // First version of add() method that takes 2 parameters
    int add(int a,int b){
        return a+b;  // Returns sum of 2 numbers
    }
    
    // Second version of add() method that takes 3 parameters 
    int add(int a, int b,int c){
        return a+b+c;  // Returns sum of 3 numbers
    }
    
    public static void main(String[] args){
        // Create an object of the class
        methodoverloadingusingargs t1= new methodoverloadingusingargs();
        
        // Call first version of add() with 2 parameters
        System.out.println(t1.add(10,20));  // Will print 30
        
        // Call second version of add() with 3 parameters
        System.out.println(t1.add(10,20,30));  // Will print 60

    }
    
}
