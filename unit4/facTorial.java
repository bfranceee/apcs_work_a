public class Factorial {
    public static int factorialNum(int n) {
        if (n < 0) {
            System.out.println("Undefined");
            return -1;
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        int factor = 1;
        for (int i = 1; i <= n; i++) {
            factor *= i;
        }
        return factor;
    }

    public static void testFactorial(int n, int expected) {
        int result = factorialNum(n);

        System.out.print("Number: " + n + " expected: " + expected +
                " result: " + result + " ");

        if (result == expected) {
            System.out.println("YAY!");
        } else {
            System.out.println("Boohoo!");
        }
    }

    public static void main(String[] args) {
        testFactorial(0, 1);
        testFactorial(1, 1);
        testFactorial(2, 2);
        testFactorial(3, 6);
        testFactorial(4, 24);
        testFactorial(5, 120);
        testFactorial(6, 720);
        testFactorial(7, 5040);
    }
}