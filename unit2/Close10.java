public class Close10
{
    public static int close10(int a, int b) {
        if(Math.abs(a-10) > Math.abs(b-10)){
            return b;
        }
        if(Math.abs(a-10) < Math.abs(b-10)){
            return a;
        }
            return 0;
    }
    public static void testclose10(int a, int b, int expected)
    {
        int result = close10(a,b);
        
        System.out.print("A: " + a +
                " B: " + b + " expected: " + expected +
                " result: " + result + " ");

        if (result == expected) {
            System.out.println("YAY!");
        }
        else {
            System.out.println("Boohoo!");
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Hello, world!");

        testclose10(5, 5, 0);
        testclose10(10, 0, 10);
        testclose10(0, 10, 10);
        testclose10(5, 15, 0);
        testclose10(7, 2, 7);
    }
}