import java.util.ArrayList;
import java.util.Arrays;

public class countZNamesList {

    public static int countZNames(ArrayList<String> names) {
        int count = 0;
        for (String name : names) {
            if (name.startsWith("Z") || name.startsWith("z")) {
                count += name.length();
            }
        }
        return count;
    }

    public static void testCountZNames(String[] names, int expected) {
        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(names));
        int result = countZNames(nameList);

        System.out.print("Names: ");
        for (String name : names) {
            System.out.print(name + " ");
        }

        System.out.println("; expected: " + expected + "; result: " + result);

        if (result == expected) {
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }
    }

    public static void main(String[] args) {
        testCountZNames(new String[] { "Zoe", "Zebra", "Tyler" }, 8);
        testCountZNames(new String[] { "Alice", "Bob", "Zachary" }, 7);
    }
}
