public class countOccurrences {
    public static int countLetters(String str, String target) {
        int total = 0;
        for (int i = 0; i <= str.length() - target.length(); i++) {
            String sub = str.substring(i, i + target.length());
            if (sub.equals(target))
            total += 1;
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
        testcountLetters("banananana", "na", 4);
        testcountLetters("chickchickchickchickchick", "chick", 5);
        testcountLetters("Brileyeyeyeyeyey", "ey", 6);
        testcountLetters("schooooool", "oo", 5);
    }
}