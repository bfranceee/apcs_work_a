import java.util.ArrayList;

public class sumofSquaresList {

    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<Double>();
        numbers.add(1.);
        numbers.add(1.);
        numbers.add(2.);

        System.out.println("Numbers: " + numbers);

        int count = 0;

        for (double number : numbers) {
                count += Math.pow(number, 2);
            }
        System.out.println("Square: " + count);
    }
}