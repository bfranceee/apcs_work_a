public class makes10
{
    public static boolean makes10(int a, int b) 
    {
        if (a + b == 10){
            return true;
  }
        if (a == 10 || b == 10){
            return true;
  }
        else{
            return false;
  }
    }

    public static void testmakes10(int a, int b, boolean expected)
    {
        boolean result = makes10(a,b);
        
        System.out.print("A: " + a +
                " B: " + b + " expected: " + expected +
                " result: " + result + " ");

        if (result == expected)
            System.out.println("YAY!");
        else
            System.out.println("Boohoo!");

    }


    public static void main(String[] args)
    {
        System.out.println("Hello, world!");

        testmakes10(5, 5, true);
        testmakes10(10, 0, true);
        testmakes10(0, 10, true);
        testmakes10(5, 15, false);
    }
}