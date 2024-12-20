import java.util.ArrayList;
import java.util.Arrays;

public class sumofSquaresList {
    public static double SumOfSquares(ArrayList<Double> numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += Math.pow(number, 2);
        }
        return sum;
    }

    public static void testSumOfSquares(ArrayList<Double> numbers, double expected) {
        double result = SumOfSquares(numbers);

        System.out.println("Numbers: " + numbers);

        System.out.println("Expected: " + expected + "; Result: " + result);
        if (result == expected) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect!");
        }
    }

    public static void main(String[] args) {
        testSumOfSquares(new ArrayList<>(Arrays.asList(1.0, 1.0, 2.0)), 6.0);
        testSumOfSquares(new ArrayList<>(Arrays.asList(0.0, 4.0)), 16.0);
    }
}