public class methodoverloadingusingargs {
    int add(int a,int b){
        return a+b;
    }
    int add(int a, int b,int c){
        return a+b+c;
    }
    public static void main(String[] args){
        methodoverloadingusingargs t1= new methodoverloadingusingargs();
        System.out.println(t1.add(10,20));
        System.out.println(t1.add(10,20,30));

    }
    
}
