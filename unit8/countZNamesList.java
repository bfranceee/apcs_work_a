import java.util.ArrayList;

public class countZNamesList {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Zoe");
        words.add("Zebra");
        words.add("Tyler");

        System.out.println("Names: " + words);

        int count = 0;

        for (String word : words) {
            if (word.startsWith("Z") || word.startsWith("z")) {
                count += word.length();
            }
        }

        System.out.println("Total Z: " + count);
    }
}