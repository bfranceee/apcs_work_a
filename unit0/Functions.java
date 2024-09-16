//Functions.java


public class Functions {
    
    
    public static double sum(double a, double b){
        return a+b;
    }
    
    public static boolean isOdd(int n){
        if (n%2 == 1)
            return true;
        else
            return false;
    }
    
    public static void main(String[] args){
        hello();
        
        double a = 5.0;
        double b = 7.0;
        System.out.println("a+b: " + sum(a,b));
        
        double c = sum(6.23,7.34);
        System.out.println("a+b: " + c);
        
        String result - twice("Hello, APCS!");
        System.out.println(result);
    }
}