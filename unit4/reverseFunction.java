public class reverseFunction {
    public static String reverseString(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    public static void testReverseString(String str, String expected) {
        String result = reverseString(str);

        System.out.print("Word: " + str + " expected: " + expected +
                " result: " + result + " ");
        if (result.equals(expected))
            System.out.println("YAY!");
        else
            System.out.println("Boohoo!");
    }

    public static void main(String[] args) {
        testReverseString("bad", "dab");
        testReverseString("pig", "gip");
        testReverseString("tacocat", "tacocat");
    }
}