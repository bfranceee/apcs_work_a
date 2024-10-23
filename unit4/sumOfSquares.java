public class sumOfSquares 
{
    public static int sumSquare (int n) 
    {
        int sum = 0;
        for(int i=1; i <= n; i++) 
        {
            sum += (int) (Math.pow(i, 2));
        }
        return sum;
    }
    public static void testsumSquare(int n, int expected) 
    {
        int result = sumSquare(n);
        
        System.out.print("Number: " + n + " expected: " + expected +
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
        testsumSquare(1, 1);
        testsumSquare(2, 5);
        testsumSquare(3, 14);
        testsumSquare(4, 30);
        testsumSquare(0, 0);
    }
}