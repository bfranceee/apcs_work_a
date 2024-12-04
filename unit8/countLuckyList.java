import java.util.ArrayList;

public class countLuckyList {

    public static void main(String [] args) {
        ArrayList<Double> numbers = new ArrayList<Double>();
        numbers.add(8.);
        numbers.add(9.);
        numbers.add(3.);
        numbers.add(7.);
        numbers.add(49.);

        System.out.println("Numbers: " + numbers);

        int count = 0;

        for (double number : numbers) {
            if ((number%7==0 || number%10==7) && number!= 0)
            {
                count += 1;
            }
        }
        System.out.println("Lucky: " + count);
    }
}