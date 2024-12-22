import java.util.*;

public class fibonacci {
    public static int[] Fibonacci(int num) {
        if (num <= 0) {
            return null;
        }

        int[] result = new int[num];

        if (num >= 1) {
            result[0] = 1;
        }
        if (num >= 2) {
            result[1] = 1;
        }

        for (int i = 2; i < num; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Fibonacci(2))); 
        System.out.println(Arrays.toString(Fibonacci(5))); 
        System.out.println(Arrays.toString(Fibonacci(10))); 
    }
}
