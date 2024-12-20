import java.util.ArrayList;
import java.util.Arrays;

public class countLuckyList {

    public static int countLucky(ArrayList<Double> numbers) {
        int count = 0;
        for (double number : numbers) {
            if ((number % 7 == 0 || number % 10 == 7) && number != 0) {
                count += 1;
            }
        }
        return count;
    }

    public static void testCountLucky(Double[] numbers, int expected) {
        ArrayList<Double> numberList = new ArrayList<>(Arrays.asList(numbers));
        int result = countLucky(numberList);

        System.out.print("Numbers: ");
        for (Double number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println("; expected: " + expected + "; result: " + result);

        if (result == expected) {
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }
    }

    public static void main(String[] args) {
        testCountLucky(new Double[] { 8.0, 9.0, 3.0, 7.0, 49.0 }, 2); 
        testCountLucky(new Double[] { 0.0, 7.0, 14.0, 27.0, 70.0 }, 4);
    }
}
