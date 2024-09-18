public class Fibonaccisequence {
    public static void main(String[] args) {
        int count = 30;
        int a = 1;
        int b = 1;
        if (count > 1) {
            System.out.println(b);
        }
    
        for (int i = 2; i <= 30; i++) {
            a = a+b;
            System.out.println(a);
            b = a-b;
    }
}
}