import java.util.*;
public class findMax {
    public static double findMax(double[] values) {
        if (values == null || values.length == 0) {
            return 0;
        }

        double max = values[0];
        for (double value : values) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        double[] values1 = {1.0, 2.1, 5.3};
        double expected1 = 5.3;
        double result1 = findMax(values1);
        for (int i = 0; i < values1.length; i++) {
            System.out.print(values1[i] + " ");
        }
        System.out.println();
        if (expected1 == result1) {
            System.out.println("Max Value: " + result1);
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect!");
        }
        System.out.println();

        double[] values2 = {0.0, -35.0, 90.1};
        double expected2 = 90.1;
        double result2 = findMax(values2);
        for (int i = 0; i < values2.length; i++) {
            System.out.print(values2[i] + " ");
        }
        System.out.println();
        if (expected2 == result2) {
            System.out.println("Max Value: " + result2);
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect!");
        }
    }
}
