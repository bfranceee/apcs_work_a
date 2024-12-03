public class sumofSquares {
    public static double SumOfSquares(double[] values) {
        double count = 0;
        for (int i = 0; i < values.length; i++) {
            count += Math.pow(values[i], 2);
        }
        return count;
    }

    public static void TestSumOfSquares(double[] values, double expected) {
        double result = SumOfSquares(values);

        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }

        System.out.println("; expected: " + expected + "; result: " + result);

        if (Math.abs(result - expected) < 1e-9) {
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }
    }

    public static void main(String[] args) {
        TestSumOfSquares(new double[] { 1, 1, 2 }, 6.0);
        TestSumOfSquares(new double[] { 0, 4 }, 16.0);
    }
}