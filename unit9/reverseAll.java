import java.util.*;

public class reverseAll {

    public static String reverse(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.substring(i, i + 1); 
        }
        return result;
    }

    public static ArrayList<String> reverseAll(ArrayList<String> list) {
        ArrayList<String> reversedList = new ArrayList<>();
        for (String str : list) {
            reversedList.add(reverse(str)); 
        }
        return reversedList;
    }

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("hello", "briley", "chicken nuggets", "tacocat"));
        
        ArrayList<String> reversedWords = reverseAll(words);

        for (String word : reversedWords) {
            System.out.println(word);
        }
    }
}
