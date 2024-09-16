//Functions.java


public class Functions {
    
    
    public static void hello(){
        System.out.println("Hello, world!");
    }
    
    public static void main(String[] args){
        hello();
        
        double a = 5.0;
        double b = 7.0;
        System.out.println("a+b: " + sum(a,b));
        
        double c = sum(6.23,7.34);
        System.out.println("a+b: " + c)
    }
}