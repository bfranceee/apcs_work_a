public class CountOccurrences {
    public static int countLetters(String str, String target) {
        int total = 0;
        int index = 0;

        while (index < str.length()) {
            index = str.indexOf(target, index);
            if (index != -1) {
                total++;
                index += target.length();
            } else {
                break;
            }
        }
        return total;
    }

    public static void testcountLetters(String str, String target, int expected) {
        int result = countLetters(str, target);

        System.out.println("String: " + str + ", Target: " + target +
                ", Expected: " + expected + ", Result: " + result);

        if (result == expected) {
            System.out.println("YAY!");
        } else {
            System.out.println("Boohoo!");
        }
    }

    public static void main(String[] args) {
        testcountLetters("Mississippi", "iss", 2);
        testcountLetters("banananana", "na", 3);
        testcountLetters("schooooooool", "oo", 4);
        testcountLetters("Brileyeyeyeyeyey", "ey", 6);
    }
}